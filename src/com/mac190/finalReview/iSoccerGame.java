package com.mac190.finalReview;

public interface iSoccerGame {
    void setTeamA(String t);
    void setTeamB(String t);
    void setRefree(String red);
    void teamAScored(int a);
    int getScoreA();
    int getScoreB();
    void teamBScored(int a);
    void substitutionA(int a) throws Exception;
    void substitutionB(int a) throws Exception;
    String whoIsWinning();
}
