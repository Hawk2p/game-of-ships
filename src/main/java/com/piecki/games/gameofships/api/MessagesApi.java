package com.piecki.games.gameofships.api;


import com.piecki.games.gameofships.model.Message;
import com.piecki.games.gameofships.model.GetMessagesRequest;
import com.piecki.games.gameofships.model.GetMessagesResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

@RestController
public class MessagesApi {

    private final ConcurrentLinkedQueue<Message> messages;

    public MessagesApi(ConcurrentLinkedQueue<Message> messages) {
        this.messages = messages;
    }

    @GetMapping(value = "/messages")
    public GetMessagesResponse getMessages(@RequestBody GetMessagesRequest getMessagesRequest) {
        List<Message> messageList = messages.stream()
                .filter(it -> !it.getPlayerId().equals(getMessagesRequest.getPlayerId()))
                .filter(it -> it.getSessionId().equals(getMessagesRequest.getSessionId()))
                .filter(it -> it.getTimestamp().isAfter(getMessagesRequest.getBegin()))
                .filter(it -> it.getTimestamp().isBefore(getMessagesRequest.getEnd()))
                .collect(Collectors.toList());
        return new GetMessagesResponse(messageList);
    }

    @PostMapping(value = "/messages")
    public void saveMessage(@RequestBody Message message){
        messages.add(message);
    }
}
