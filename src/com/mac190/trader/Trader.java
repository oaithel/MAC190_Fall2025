package com.mac190.trader;

import com.mac190.stocks.iBroker;

import java.util.Scanner;

public class Trader {
    private iBroker broker;

    public Trader(iBroker b){
        broker = b;
    }
    public void trade(String type){
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        while(!answer.toLowerCase().equals("no")){
            System.out.println("What's the ticker: ");
            String ticker = sc.next();
            System.out.println("How many shares would you like: ");
            int shares = sc.nextInt();
            System.out.println("How much are you paying: ");
            float price  = sc.nextFloat();
            broker.buy(ticker,type,shares,price);
            System.out.println("Holdings: " + broker.getHoldings());
            sc.nextLine();
            System.out.println("Do you want buy.sell something else?");
            answer = sc.nextLine();
        }
    }
}
