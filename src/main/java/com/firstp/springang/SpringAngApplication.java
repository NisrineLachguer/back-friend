package com.firstp.springang;

import com.firstp.springang.Repositories.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAngApplication implements CommandLineRunner {
    @Autowired FriendsRepository FriendsRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringAngApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // FriendsRepository.save(new Friends(null, "nisrine","lachguer","info","nis@gmail.com","Marrakech"));
        //FriendsRepository.save(new Friends(null, "mohamed","laghouiti","prod","lagh@gmail.com","Casa"));
        FriendsRepository.save(new Friends(null, "sana","nasif","SE","sana@gmail.com","Marrakech"));


    }
}
