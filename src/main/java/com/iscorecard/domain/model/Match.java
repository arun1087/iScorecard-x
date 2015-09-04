package com.iscorecard.domain.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/15/2015.
 */

@Entity
@Table(name = "MATCH_")
public class Match {

    @NotNull
    @Column(name = "MATCH_ID")
    private String matchId;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "match_", cascade = CascadeType.ALL)
    @Column(name = "HOME_TEAM_ID")
    private Team homeTeam;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "match_", cascade = CascadeType.ALL)
    @Column(name = "AWAY_TEAM_ID)")
    private Team awayTeam;

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

}
