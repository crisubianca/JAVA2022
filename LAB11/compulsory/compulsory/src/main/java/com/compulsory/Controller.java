package com.compulsory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/controller")
public class Controller {
    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> get(){
        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") int id){
        for(User user : users)
            if(user.getId() == id){
                return user;
            }
        return null;
    }

    @PostMapping("new")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public void newUser(@RequestParam String name){
        users.add(new User(users.size()+1, name));
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED, reason = "CREATED")
    public void editUser(@PathVariable int id, @RequestParam String name){
        for(User user : users)
            if(user.getId() == id)
            {
                user.setName(name);
                System.out.println("merge");
                break;
            }
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED, reason = "DELETED")
    public void deleteUser(@PathVariable int id){
        for(User user : users)
            if(user.getId() == id)
            {
                users.remove(users.remove(user.getId()-1));
                return;
            }
    }
}
