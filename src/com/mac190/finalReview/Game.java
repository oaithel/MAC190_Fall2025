package com.mac190.finalReview;

import java.util.Objects;

abstract class Game {
    private String teamA, teamB;
    private int maxPlayers, maxSubstitutes;
    protected int scoreA, scoreB;
    protected int substitutionA, substitutionB;

    public Game(){
        teamA = teamB = "N/A";
        maxPlayers = maxSubstitutes = scoreA = scoreB = substitutionA = substitutionB = 0;
    }
    public Game(String tA, String tB, int maxP, int maxSubs){
        teamA = tA;
        teamB = tB;
        if(maxP < 1){
            throw new IllegalArgumentException("Max players cannot be < 1");
        }
        maxPlayers = maxP;
        if(maxSubs < 0){
            throw new IllegalArgumentException("Max subs cannot be < 0");
        }
        maxSubstitutes = maxSubs;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        if(maxPlayers < 1){
            throw new IllegalArgumentException("Max players cannot be < 1");
        }
        this.maxPlayers = maxPlayers;
    }

    public int getMaxSubstitutes() {
        return maxSubstitutes;
    }

    public void setMaxSubstitutes(int maxSubstitutes) {
        if(maxSubstitutes < 0){
            throw new IllegalArgumentException("Max players cannot be < 1");
        }
        this.maxSubstitutes = maxSubstitutes;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public int getSubstitutionA() {
        return substitutionA;
    }

    public int getSubstitutionB() {
        return substitutionB;
    }


    @Override
    public String toString() {
        return "Game{" +
                "teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", maxPlayers=" + maxPlayers +
                ", maxSubstitutes=" + maxSubstitutes +
                ", scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                ", substitutionA=" + substitutionA +
                ", substitutionB=" + substitutionB +
                '}';
    }

    public boolean equals(Game game) {
        return maxPlayers == game.maxPlayers
                && maxSubstitutes == game.maxSubstitutes
                && scoreA == game.scoreA && scoreB == game.scoreB
                && substitutionA == game.substitutionA
                && substitutionB == game.substitutionB
                && teamA.equals(game.teamA)
                && teamB.equals(game.teamB);
    }

    abstract void teamAScored(int a);
    abstract void teamBScored(int a);
    abstract void substitutionA(int a) throws Exception;
    abstract void substitutionB(int a) throws Exception;
    public String whoIsWinning(){
        if(scoreA > scoreB){
            return teamA;
        }else if(scoreB > scoreA){
            return teamB;
        } else{
            return "Draw";
        }
    }
}
