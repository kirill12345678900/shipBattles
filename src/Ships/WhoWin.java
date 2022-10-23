package Ships;

import static Ships.BattleShip.monitor1;
import static Ships.BattleShip.monitor2;

public class WhoWin {

    public static boolean isWinCondition() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }
        }

        if (counter1 == 10) {
            System.out.println(Player.player1 + " ПОБЕДА!");
            return true;
        }

        if (counter2 == 10) {
            System.out.println(Player.player2 + " ПОБЕДА!");
            return true;
        }
        return false;
    }

    public static boolean isWinCondition2() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }
        }

        if (counter1 == 10) {
            System.out.println(Bot.bot1 + " ПОБЕДА!");
            return true;
        }

        if (counter2 == 10) {
            System.out.println(Bot.bot2 + " ПОБЕДА!");
            return true;
        }
        return false;
    }

    public static boolean isWinCondition3() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }
        }

        if (counter1 == 10) {
            System.out.println(Player.player1 + " ПОБЕДА!");
            return true;
        }

        if (counter2 == 10) {
            System.out.println(Bot.bot1 + " ПОБЕДА!");
            return true;
        }
        return false;
    }
}
