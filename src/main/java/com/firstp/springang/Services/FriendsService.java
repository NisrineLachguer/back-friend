package com.firstp.springang.Services;

import com.firstp.springang.Repositories.FriendsRepository;
import com.firstp.springang.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Service
public class FriendsService {

    @Autowired
    private FriendsRepository friendsRepository;

    public List<Friends> getFriends(){
        return friendsRepository.findAll();
    }

    public void  addFriends(Friends friends){
        friendsRepository.save(friends);
    }

    public void updateFriends(Friends friends){
        friendsRepository.save(friends);
    }

    public void deleteFriends(long id){
        friendsRepository.deleteById(id);
    }
}
