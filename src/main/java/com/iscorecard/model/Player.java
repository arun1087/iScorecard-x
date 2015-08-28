package com.iscorecard.model;

/**
 * Created by asabtharishi on 6/16/2015.
 */
public class Player {
    private String playerId;
    private PlayerStatsForMatch playerStatsForMatch;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public PlayerStatsForMatch getPlayerStatsForMatch() {
        return playerStatsForMatch;
    }

    public void setPlayerStatsForMatch(PlayerStatsForMatch playerStatsForMatch) {
        this.playerStatsForMatch = playerStatsForMatch;
    }
}
