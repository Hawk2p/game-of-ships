package com.piecki.games.gameofships.config;

import com.piecki.games.gameofships.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentLinkedQueue;

@Configuration
public class MessagesConfig {

    @Bean
    public ConcurrentLinkedQueue<Message> getMessages(){
        return new ConcurrentLinkedQueue<>();
    }


}
