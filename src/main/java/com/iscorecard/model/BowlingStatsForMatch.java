package com.iscorecard.model;

/**
 * Created by asabtharishi on 6/16/2015.
 */
public class BowlingStatsForMatch {

    private boolean didNotBowl;
    private int bowlingPosition;
    private int oversBowled;
    private int ballsBowledBeforeCompletingOver;
    private int runsConceded;
    private int wicketsTaken;
    private int maidens;

    public int getBallsBowledBeforeCompletingOver() {
        return ballsBowledBeforeCompletingOver;
    }

    public void setBallsBowledBeforeCompletingOver(int ballsBowledBeforeCompletingOver) {
        this.ballsBowledBeforeCompletingOver = ballsBowledBeforeCompletingOver;
    }

    public int getOversBowled() {
        return oversBowled;
    }

    public void setOversBowled(int oversBowled) {
        this.oversBowled = oversBowled;
    }

    public int getBowlingPosition() {
        return bowlingPosition;
    }

    public void setBowlingPosition(int bowlingPosition) {
        this.bowlingPosition = bowlingPosition;
    }

    public boolean isDidNotBowl() {
        return didNotBowl;
    }

    public void setDidNotBowl(boolean didNotBowl) {
        this.didNotBowl = didNotBowl;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public int getMaidens() {
        return maidens;
    }

    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }


}
