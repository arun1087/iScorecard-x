package com.iscorecard.domain.model;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "TEAM")
public class Team {

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "PLAYER_ID")
    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
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
