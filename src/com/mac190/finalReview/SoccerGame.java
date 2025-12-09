package com.mac190.finalReview;

public class SoccerGame extends Game implements iSoccerGame{
    private String refree;

    public SoccerGame(){
        super("N/A", "N/A", 11, 5);
        refree = "N/A";
    }
    public SoccerGame(String tA, String tB, String ref){
        super(tA,tB, 11, 5);
        refree = ref;
    }

    public String getRefree() {
        return refree;
    }

    public void setRefree(String refree) {
        this.refree = refree;
    }

    @Override
    public String toString() {
        return "SoccerGame{" +
                "refree='" + refree + '\'' +
                "} " + super.toString();
    }
    public boolean equals(SoccerGame S){
        return (super.equals(S) && refree.equals(S.getRefree()));
    }


    @Override
    public void teamAScored(int a) {
        this.scoreA += 1;
    }

    @Override
    public void teamBScored(int a) {
        this.scoreB += 1;
    }

    @Override
    public void substitutionA(int a) throws Exception{
        if(a > 3){
            throw new Exception("Cannot substitute more than 3 players at a time");
        }
        if(this.getSubstitutionA() + a > getMaxSubstitutes()){
            throw new Exception("Cannot substitute more than 5 players total");
        }
        substitutionA += a;
    }

    @Override
    public void substitutionB(int a) throws Exception{
        if(a > 3){
            throw new Exception("Cannot substitute more than 3 players at a time");
        }
        if(this.getSubstitutionA() + a > getMaxSubstitutes()){
            throw new Exception("Cannot substitute more than 5 players total");
        }
        substitutionA += a;
    }
    public SoccerGame add(SoccerGame S){
        SoccerGame res = new SoccerGame(getTeamA() + S.getTeamA(),
                getTeamB() + S.getTeamB(), refree);
        res.substitutionA = Math.min(substitutionA + S.substitutionA, getMaxSubstitutes());
        res.substitutionB = Math.min(substitutionB + S.substitutionB, getMaxSubstitutes());
        res.scoreA = scoreA + S.scoreA;
        res.scoreB = scoreB + S.scoreB;
        return res;
    }
    public static SoccerGame add(SoccerGame S1, SoccerGame S2){
        SoccerGame res = new SoccerGame(S1.getTeamA() + S2.getTeamA(),
                S1.getTeamB() + S2.getTeamB(), S1.refree);
        res.substitutionA = Math.min(S1.substitutionA + S2.substitutionA, S1.getMaxSubstitutes());
        res.substitutionB = Math.min(S1.substitutionB + S2.substitutionB, S1.getMaxSubstitutes());
        res.scoreA = S1.scoreA + S2.scoreA;
        res.scoreB = S1.scoreB + S2.scoreB;
        return res;
    }
}
