package com.itutry.spring5;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User("lucy", "nan", 24));
        userMap.put(2, new User("mary", "nv", 18));
        userMap.put(3, new User("jack", "nan", 36));
    }

    public Mono<User> getUserById(Integer id) {
        return Mono.justOrEmpty(userMap.get(id));
    }

    public Flux<User> getAllUsers() {
        return Flux.fromIterable(userMap.values());
    }

    public Mono<Void> saveUser(Mono<User> userMono) {
        return userMono.doOnNext(user -> {
            userMap.put(userMap.size() + 1, user);
        }).thenEmpty(Mono.empty());
    }
}
