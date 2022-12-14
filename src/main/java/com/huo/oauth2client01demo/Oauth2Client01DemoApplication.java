package com.huo.oauth2client01demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Oauth2Client01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Client01DemoApplication.class, args);
    }

}