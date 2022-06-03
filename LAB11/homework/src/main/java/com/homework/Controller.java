package com.homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@RestController
@RequestMapping("/api/users")
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

    @GetMapping("friendship/{id}")
    public List<String> getFriendships(@PathVariable int id){
        List<String> friends = new ArrayList<>();
        for(User user : users)
            if(user.getId() == id)
                for(User friend : user.getFriends())
                    friends.add(friend.getName());

        return friends;
    }
    @GetMapping("popularity/{count}")
    public List<User> getPopular(@PathVariable int count){
        int users_counted;
        List<User> response = new ArrayList<>();

        if(count > users.size())
            return null;

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getFriends().size() - o2.getFriends().size();
            }
        });

        users_counted = 0;
        for(User user : users){
            response.add(user);
            users_counted++;
            if(users_counted == count)
                break;
        }
        return response;
    }

    @PostMapping("new")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public void newUser(@RequestParam String name){
        users.add(new User(users.size()+1, name));
    }

    @PutMapping("/friend/{id_user}")
    @ResponseStatus(code = HttpStatus.ACCEPTED, reason = "CREATED")
    public void addFriend(@PathVariable int id_user, @RequestParam String friend_name){
        User friend = null;
        for(User user : users)
            if(user.getName().compareTo(friend_name) == 0){
                friend = user;
                break;
            }
        if(friend != null)
            for(User user : users)
                if(user.getId() == id_user)
                {
                    user.getFriends().add(friend);
                    return;
                }
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
