package com.iscorecard.domain.model;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "PLAYER")
public class Player extends Model {

    @Column(name = "PLAYER_STATS_ID")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private PlayerStatsForMatch playerStatsForMatch;

    public PlayerStatsForMatch getPlayerStatsForMatch() {
        return playerStatsForMatch;
    }

    public void setPlayerStatsForMatch(PlayerStatsForMatch playerStatsForMatch) {
        this.playerStatsForMatch = playerStatsForMatch;
    }
}