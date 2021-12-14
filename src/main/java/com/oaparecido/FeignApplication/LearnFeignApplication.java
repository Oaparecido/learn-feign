package com.oaparecido.FeignApplication;

import com.oaparecido.FeignApplication.integration.User;
import com.oaparecido.FeignApplication.integration.client.GithubClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
@EnableFeignClients
public class LearnFeignApplication {

    GithubClient githubClient;

    public static void main(String[] args) {
        SpringApplication.run(LearnFeignApplication.class, args);
    }

    @GetMapping("/user/{username}")
    void getUser(@PathVariable("username") String username) {

        String user = this.githubClient.getUser(username);

        System.out.println(user);
    }
}
