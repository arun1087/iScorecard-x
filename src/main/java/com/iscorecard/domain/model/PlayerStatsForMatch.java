package com.iscorecard.domain.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "PLAYER_STATS")
public class PlayerStatsForMatch {

    @NotNull
    @Column(name = "PLAYER_STATS_ID")
    private String playerStatsForMatchId;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "playerStatsForMatch", cascade = CascadeType.ALL)
    @Column(name = "BOWLING_STATS")
    private BowlingStatsForMatch bowlingStatsForMatch;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "playerStatsForMatch", cascade = CascadeType.ALL)
    @Column(name = "BOWLING_STATS")
    private BattingStatsForMatch battingStatsForMatch;

    public String getPlayerStatsForMatchId() {
        return playerStatsForMatchId;
    }

    public void setPlayerStatsForMatchId(String playerStatsForMatchId) {
        this.playerStatsForMatchId = playerStatsForMatchId;
    }

    public BowlingStatsForMatch getBowlingStatsForMatch() {
        return bowlingStatsForMatch;
    }

    public void setBowlingStatsForMatch(BowlingStatsForMatch bowlingStatsForMatch) {
        this.bowlingStatsForMatch = bowlingStatsForMatch;
    }

    public BattingStatsForMatch getBattingStatsForMatch() {
        return battingStatsForMatch;
    }

    public void setBattingStatsForMatch(BattingStatsForMatch battingStatsForMatch) {
        this.battingStatsForMatch = battingStatsForMatch;
    }
}
