package com.mac190.finalReview;

public class BasketGame extends Game{
    public BasketGame(){
        super("N/A", "N/A", 5, 0);
    }
    public BasketGame(String tA, String tB){
        super(tA, tB, 5, 0);
    }

    public boolean equals(BasketGame B){
        return super.equals(B);
    }
    @Override
    void teamAScored(int a) {
        if(a <0 || a > 3){
            throw new IllegalArgumentException("Cannot score more than 3");
        }
        scoreA += a;
    }

    @Override
    void teamBScored(int a) {
        if(a <0 || a > 3){
            throw new IllegalArgumentException("Cannot score more than 3");
        }
        scoreB += a;
    }

    @Override
    void substitutionA(int a) throws Exception {
        if(a < 0 || a > 5){
            throw new Exception("Cannot substitute more than 5 at a time");
        }
        substitutionA += a;
    }

    @Override
    void substitutionB(int a) throws Exception {
        if(a < 0 || a > 5){
            throw new Exception("Cannot substitute more than 5 at a time");
        }
        substitutionB += a;
    }
}
