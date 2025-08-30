package com.fitness.Fitness.controller;

import com.fitness.Fitness.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {
    private UserService userService;

}
