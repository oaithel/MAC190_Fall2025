package com.mac190.finalReview;

public class GameTester {
    public static void main(String[] args) {
        //create a SoccerGame
        SoccerGame S = new SoccerGame("Real", "Barca", "ref");
        System.out.println("S: " + S);
        S.teamBScored(2);
        S.teamBScored(3);
        System.out.println("S: " + S);
        try {
            S.substitutionA(3);
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("S: " + S);
        //use the interface to create another soccerGame
        iSoccerGame iS = new SoccerGame("Paris", "Arsenal", "ref2");
        iS.teamAScored(2);
        try {
            iS.substitutionB(2);
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("iS: " + iS);
        //combine the two soccer games
        SoccerGame S2 = S.add((SoccerGame) iS);
        System.out.println("S2: " + S2);
        //use the static method
        S2 = SoccerGame.add(S, (SoccerGame) iS);
        System.out.println("S2: " + S2);
        Addable A = ((SoccerGame) iS).add(S);
        System.out.println("A: " + A);
    }
}
