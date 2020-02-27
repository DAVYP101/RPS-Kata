package com.example.RPSGame;

import org.junit.Assert;
import org.junit.Test;

public class RPSGameTests {

    @Test
    public void rockBeatsScissors() {

        Assert.assertEquals(RPSGame.playGame(Throw.ROCK, Throw.SCISSORS), Winner.PLAYER1);
    }

    @Test
    public void scissorsBeatsPaper() {

        Assert.assertEquals(RPSGame.playGame(Throw.SCISSORS, Throw.PAPER), Winner.PLAYER1);
    }

    @Test
    public void paperBeatsRock() {

        Assert.assertEquals(RPSGame.playGame(Throw.PAPER, Throw.ROCK), Winner.PLAYER1);
    }

    @Test
    public void scissorsLosesToRock() {

        Assert.assertEquals(RPSGame.playGame(Throw.SCISSORS, Throw.ROCK), Winner.PLAYER2);

    }
    @Test
    public void paperLosesToScissors() {

        Assert.assertEquals(RPSGame.playGame(Throw.PAPER, Throw.SCISSORS), Winner.PLAYER2);

    }
    @Test
    public void rockLosesToPaper() {

        Assert.assertEquals(RPSGame.playGame(Throw.ROCK, Throw.PAPER), Winner.PLAYER2);
    }

    @Test
    public void rockDrawsWithRock() {

        Assert.assertEquals(RPSGame.playGame(Throw.ROCK, Throw.ROCK), Winner.DRAW);
    }
}

