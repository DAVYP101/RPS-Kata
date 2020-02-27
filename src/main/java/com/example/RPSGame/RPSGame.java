package com.example.RPSGame;

public class RPSGame {
    public static Winner playGame(Throw player1Throw, Throw player2Throw) {
        if (player1Throw == Throw.ROCK && player2Throw == Throw.SCISSORS ||
        player1Throw == Throw.PAPER && player2Throw == Throw.ROCK ||
        player1Throw == Throw.SCISSORS && player2Throw == Throw.PAPER) {
            return Winner.PLAYER1;
        }
        else if (player1Throw == player2Throw) {
            return Winner.DRAW;
        }
        return Winner.PLAYER2;
    }
}