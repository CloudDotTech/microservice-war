package com.clouddottech.microservicewar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerAPI {
    @GetMapping
    public String get() {
        return "Hello WAR";
    }
}
