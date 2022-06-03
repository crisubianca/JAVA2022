package com.callService.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("userList")
    public List<User> getUserList(){
        return restTemplate.getForObject("http://localhost:8082/api/users", List.class);
    }

    @GetMapping("user")
    public List<User> getUser(){
        return restTemplate.getForObject("http://localhost:8082/api/users/1", List.class);
    }

    @GetMapping("friendship/{id}")
    public List<User> getFriendship(@PathVariable int id){
        return restTemplate.getForObject("http://localhost:8082/api/useers/friendship/" + id, List.class);
    }

    @GetMapping("popularity/{count}")
    public List<User> getPopularity(@PathVariable int count){
        return restTemplate.getForObject("http://localhost:8082/api/users/popularity/" + count, List.class);
    }

}
