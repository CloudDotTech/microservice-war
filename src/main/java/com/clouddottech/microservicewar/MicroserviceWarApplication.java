package com.clouddottech.microservicewar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceWarApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MicroserviceWarApplication.class);
    }

    @RequestMapping(value = "/hi")
    public String hello() {
        return "Hello World from Tomcat...";
    }
}
