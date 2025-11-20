package com.mac190.trader;

import com.mac190.stocks.Broker;
import com.mac190.stocks.Oanda;
import com.mac190.stocks.Robinhood;

import java.util.Locale;
import java.util.Scanner;

public class TraderTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to buy?");
        System.out.println("Currencie or Stocks?");
        String choice = sc.next().toLowerCase(Locale.ROOT);
        if (choice.contains("stock")) {
            //create a Trader object with Robinhood as the broker
            Robinhood b = new Robinhood();
            Trader T = new Trader(b);
            T.trade("STK");
        }else if (choice.contains("currencies")) {
            Trader T = new Trader(new Oanda());
            T.trade("CUR");
        }
    }
}
