package com.iscorecard.domain.model;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "PLAYER")
public class Player {

    @Column(name = "PLAYER_ID")
    private String playerId;

    @Column(name = "PLAYER_STATS_ID")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "player", cascade = CascadeType.ALL)
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
