package com.iscorecard.domain.model;

import javax.persistence.*;

/**
 * Created by asabtharishi on 6/16/2015.
 */

@Entity
@Table(name = "TEAM")
public class Team extends Model {


    @Column(name = "PLAYER_ID")
    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Player [] player = new Player[11];

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    @OneToOne(optional = false)
    private Game match;

    public Game getMatch() {
        return match;
    }

    public void setMatch(Game match) {
        this.match = match;
    }

    @OneToOne(optional = false)
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
