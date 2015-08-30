package com.iscorecard.domain.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "BOWLING_STATS")
public class BowlingStatsForMatch {

    @NotNull
    @Column(name = "BOWLING_STATS_ID")
    private String bowlingStatsId;

    @NotNull
    @Column(name = "DID_NOT_BOWL")
    private boolean didNotBowl;

    @NotNull
    @Column(name = "BOWLING_POSITION")
    private int bowlingPosition;

    @NotNull
    @Column(name = "OVERS_BOWLED")
    private int oversBowled;

    @NotNull
    @Column(name = "BALLS_BOWLED_BEFORE_COMPLETING_OVER")
    private int ballsBowledBeforeCompletingOver;

    @NotNull
    @Column(name = "RUNS_CONCEDED")
    private int runsConceded;

    @NotNull
    @Column(name = "WICKETS_TAKEN")
    private int wicketsTaken;

    @NotNull
    @Column(name = "MAIDENS")
    private int maidens;

    public String getBowlingStatsId() {
        return bowlingStatsId;
    }

    public void setBowlingStatsId(String bowlingStatsId) {
        this.bowlingStatsId = bowlingStatsId;
    }

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
