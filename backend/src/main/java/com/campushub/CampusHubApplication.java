package com.campushub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CampusHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusHubApplication.class, args);
    }

    // 顺手写个接口，方便你一会儿验证 CI 跑完后的效果
    @GetMapping("/health")
    public String health() {
        return "CampusHub Backend is running!";
    }
}
