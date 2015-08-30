package com.iscorecard.domain.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "BATTING_STATS")
public class BattingStatsForMatch {

    @NotNull
    @Column(name = "BATTING_STATS_ID")
    private String battingStatsId;

    @NotNull
    @Column(name = "BATTING_POSITION")
    private int battingPosition;

    @NotNull
    @Column(name = "DID_NOT_BAT")
    private boolean didNotBat;

    @NotNull
    @Column(name = "BALLS_FACED")
    private int ballsFaced;

    @NotNull
    @Column(name = "RUNS_SCORED")
    private int runsScored;

    @NotNull
    @Column(name = "FOURS")
    private int fours;

    @NotNull
    @Column(name = "SIXES")
    private int sixes;

    public String getBattingStatsId() {
        return battingStatsId;
    }

    public void setBattingStatsId(String battingStatsId) {
        this.battingStatsId = battingStatsId;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getBattingPosition() {
        return battingPosition;
    }

    public void setBattingPosition(int battingPosition) {
        this.battingPosition = battingPosition;
    }

    public boolean isDidNotBat() {
        return didNotBat;
    }

    public void setDidNotBat(boolean didNotBat) {
        this.didNotBat = didNotBat;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }
}
