package com.iscorecard.model;

/**
 * Created by asabtharishi on 6/16/2015.
 */
public class Team {
    private String teamId;
    private Player [] player = new Player[11];

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }
}
