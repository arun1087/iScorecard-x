package com.iscorecard.domain.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/15/2015.
 */

@Entity
@Table(name = "GAME")
public class Game extends Model {


    @NotNull
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "HOME_TEAM_ID")
    private Team homeTeam;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "AWAY_TEAM_ID")
    private Team awayTeam;


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
