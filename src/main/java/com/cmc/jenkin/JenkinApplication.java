package com.cmc.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JenkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinApplication.class, args);
    }

}
