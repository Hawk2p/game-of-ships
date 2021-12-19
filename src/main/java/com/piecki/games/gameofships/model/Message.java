package com.piecki.games.gameofships.model;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Message {

    private UUID playerId;
    private UUID sessionId;
    private Instant timestamp;
    private PlayerAction playerAction;

    public Message() {
    }

    public Message(UUID playerId, UUID sessionId, Instant timestamp, PlayerAction playerAction) {
        this.playerId = playerId;
        this.sessionId = sessionId;
        this.timestamp = timestamp;
        this.playerAction = playerAction;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public void setPlayerId(UUID playerId) {
        this.playerId = playerId;
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public PlayerAction getPlayerAction() {
        return playerAction;
    }

    public void setPlayerAction(PlayerAction playerAction) {
        this.playerAction = playerAction;
    }

    @Override
    public String toString() {
        return "Message{" +
                "playerId=" + playerId +
                ", sessionId=" + sessionId +
                ", timestamp=" + timestamp +
                ", playerAction=" + playerAction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(playerId, message.playerId) && Objects.equals(sessionId, message.sessionId) && Objects.equals(timestamp, message.timestamp) && Objects.equals(playerAction, message.playerAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, sessionId, timestamp, playerAction);
    }
}
