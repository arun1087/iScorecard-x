package com.iscorecard.model;

/**
 * Created by asabtharishi on 6/16/2015.
 */
public class PlayerStatsForMatch {
    private BowlingStatsForMatch bowlingStatsForMatch;
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
