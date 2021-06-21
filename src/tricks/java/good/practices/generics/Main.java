package tricks.java.good.practices.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Coin> coins = new ArrayList();

        coins.add(new Coin(1, "Euro"));
        coins.add(new Coin(5,"Euro"));

        for (int i = 0; i < coins.size(); i++) {
            Coin myCoin = coins.get(i);
            System.out.println("Coin: " + myCoin.toString());
        }
    }
}
