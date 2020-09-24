package com.itutry.spring5;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class MyClient {

    public static void main(String[] args) {
        //调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:64938");

        //根据 id 查询
        String id = "1";
        User user = webClient.get().uri("/users/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(user);

        //查询所有
        User user1 = webClient.get().uri("/users").accept(MediaType.APPLICATION_JSON).retrieve()
                .bodyToFlux(User.class).blockFirst();
        System.out.println(user1);

    }
}
