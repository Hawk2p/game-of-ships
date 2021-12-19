package com.piecki.games.gameofships.model;

import java.util.List;

public class GetMessagesResponse {

    private List<Message> messageList;

    public GetMessagesResponse(List<Message> messageList) {
        this.messageList = messageList;
    }
}
