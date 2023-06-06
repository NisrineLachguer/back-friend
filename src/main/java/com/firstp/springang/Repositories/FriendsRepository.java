package com.firstp.springang.Repositories;

import com.firstp.springang.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends JpaRepository <Friends,Long> {

}
