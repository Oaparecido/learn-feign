package com.oaparecido.FeignApplication.integration.client;

import com.oaparecido.FeignApplication.integration.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "github", url = "https://api.github.com")
public interface GithubClient {
    @GetMapping("/users/{username}")
    String getUser(@PathVariable("username") String username);
}
