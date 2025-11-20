package com.mac190.stocks;
/*
 * Design a class Oanda to be a Broker. Implement the methods buy and sell so that
 * only currencies can be bought and add $2.5 as fees.
 * If not currency should display an error message.
 *
 */

public class Oanda extends Broker implements iBroker {

    public void buy(String t, String type, int s, float p) {
        //if type is not "STK" or "stk", display "Can only buy Stocks" and return
        if(!type.toLowerCase().equals("cur")){
            System.out.println("Error, can only buy currencies");
            return;
        }
        float fee = 1.5f;
        //check if the ticket t already exists in holdings, if it does
        for(Security sec:getHoldings()) {
            if(sec.getTicker().toLowerCase().equals(t.toLowerCase())) {
                //compute the new price as (oldPrice*oldNumberShares + (p*s+ fees))/(oldNumbershares + s)
                float newPrice = (sec.getPrice()*sec.getShares() + p*s + fee)/(sec.getShares() + s);
                //update number shares and new price
                sec.setPrice(newPrice);
                sec.setShares(sec.getShares()+s);
                return; //get out
            }
        }
        //The security does not exist
        //if t does not exist already
        //create a new Security with t, type and s and the price as (p*s+fees)/s
        Security se = new Security(t, type, s, (p*s+fee)/s);
        //add the security to the list of holdings.
        getHoldings().add(se);

    }

    @Override
    public double sell(String t, String type, int s, float p) {
        //if type is not "STK" throw and exception wrong type
        if(!type.toLowerCase().equals("cur")){
            System.out.println("Error, can only sell currencies ");
            return 0;
        }
        //check if t exists in the list of holdings, if it doesn't then display
        //"cannot sell what you don't have"
        float fee = 1.5f;
        for(Security sec:getHoldings()) {
            if(sec.getTicker().toLowerCase().equals(t.toLowerCase())) {
                //if s is larger than the number of shares in the list, then display a message
                //Trying to sell more than what you have. So closing position.
                if(s > sec.getShares()){
                    //compute the proceedings as number of share in the list* p.
                    //remove the security from the list and return the proceedings
                    System.out.println("Trying to sell more than you have, closing the position");
                    double proceeds = sec.getShares()*p;
                    //remove the security from th elist
                    getHoldings().remove(sec);
                    return (proceeds-fee);
                }else {
                    //if you are trying to sell less than you have, then
                    //compute the proceedings as s*p.
                    double proceedings = s*p;
                    //subtract s from the number of share in the security in the list
                    //return proceedings.
                    sec.setShares(sec.getShares() - s);
                    if(sec.getShares() == 0){
                        //remove it from the list
                        getHoldings().remove(sec);
                    }
                    return (proceedings-fee);
                }
            }
        }
        System.out.println("You don't own " + t);
        return 0;
    }
}