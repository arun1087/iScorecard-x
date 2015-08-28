package com.iscorecard.model;

/**
 * Created by asabtharishi on 6/16/2015.
 */
public class BattingStatsForMatch {
    private int battingPosition;
    private boolean didNotBat;
    private int ballsFaced;
    private int runsScored;
    private int fours;
    private int sixes;

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
