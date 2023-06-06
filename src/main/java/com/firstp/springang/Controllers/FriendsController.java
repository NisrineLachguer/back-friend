package com.firstp.springang.Controllers;

import com.firstp.springang.Friends;
import com.firstp.springang.Services.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;           // this class is a API
//@GetMapping("/friends")
@RestController
@CrossOrigin("*")
public class FriendsController {

    @Autowired
    private FriendsService friendService;

    @GetMapping("/friends")
    public List<Friends> getFiends(){
        return  friendService.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void  addFriends(@RequestBody Friends friends){
        friendService.addFriends(friends);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriends(@PathVariable("id") Long id, @RequestBody Friends friends){
        friendService.updateFriends(friends);
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriends(@PathVariable("id") Long id){
        friendService.deleteFriends(id);
    }
}
