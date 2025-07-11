package com.nginx.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nginx")
public class NginxController {

    @GetMapping
    public String deployNginx() {
        // Logic to deploy Nginx
        return "Nginx deployed successfully!";
    }
}
