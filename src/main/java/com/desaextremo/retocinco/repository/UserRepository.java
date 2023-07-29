package com.desaextremo.retocinco.repository;

import com.desaextremo.retocinco.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);

    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
