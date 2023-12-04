package com.trabbitproject.habits.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, ObjectId>{
    Mono<User> findByUsername(String username);
    Mono<User> findByEmail(String email);
    // Mono<User> updateUser(ObjectId Id, User user);
}
