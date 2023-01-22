package ru.itmo.dbproject.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.security.AuthProvider;

@CrossOrigin(origins = "*")
@RestController
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthProvider.class);

    public AuthController() {
        // ToDo
    }

    // ToDo add PostMapping Login, Register and DeleteMapping Logout
}
