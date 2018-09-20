package com.scspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.context.annotation.ApplicationScope;

@SpringBootApplication
public class Oauth2authenticationserver1Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2authenticationserver1Application.class, args);
    }
}
