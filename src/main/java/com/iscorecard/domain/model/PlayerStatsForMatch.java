package com.iscorecard.domain.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "PLAYER_STATS")
public class PlayerStatsForMatch extends Model {

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "playerStatsForMatch", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "BOWLING_STATS_ID")
    private BowlingStatsForMatch bowlingStatsForMatch;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "playerStatsForMatch", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "BOWLING_STATS_ID")
    private BattingStatsForMatch battingStatsForMatch;

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
