package com.piecki.games.gameofships.model;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class GetMessagesRequest {

    private UUID playerId;
    private UUID sessionId;
    private Instant begin;
    private Instant end;

    public GetMessagesRequest() {
    }

    public GetMessagesRequest(UUID playerId, UUID sessionId, Instant begin, Instant end) {
        this.playerId = playerId;
        this.sessionId = sessionId;
        this.begin = begin;
        this.end = end;
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


    public Instant getBegin() {
        return begin;
    }

    public void setBegin(Instant begin) {
        this.begin = begin;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "GetMessagesRequest{" +
                "playerId=" + playerId +
                ", sessionId=" + sessionId +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMessagesRequest that = (GetMessagesRequest) o;
        return Objects.equals(playerId, that.playerId) && Objects.equals(sessionId, that.sessionId) && Objects.equals(begin, that.begin) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, sessionId, begin, end);
    }
}
