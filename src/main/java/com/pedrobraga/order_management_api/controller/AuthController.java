 package com.pedrobraga.order_management_api.controller;

import com.pedrobraga.order_management_api.security.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {

        String username = request.get("username");
        String password = request.get("password");

        // login fake (por enquanto)
        if ("admin".equals(username) && "123".equals(password)) {
            String token = jwtService.generateToken(username);
            return Map.of("token", token);
        }

        throw new RuntimeException("Usuário ou senha inválidos");
    }
}
