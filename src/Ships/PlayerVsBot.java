package Ships;

import static Ships.BattleShip.scanner;

public class PlayerVsBot {

    public static void placeShips(String playerName, int[][] battlefield) {
        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName + ", поставь свой " + deck + "-х палубный боевой корабль!");
            System.out.println();

            drawField(battlefield);

            System.out.println("Введи координаты по оси X: ");
            int x = scanner.nextInt();
            System.out.println("Введи координаты по оси Y: ");
            int y = scanner.nextInt();
            System.out.println("Выбери в каком расположении будет корабль: ");
            System.out.println("1. По вертикали: ");
            System.out.println("2. По горизонтали: ");
            int direction = scanner.nextInt();
            if (!CheckShips.isAvailable(x, y, deck, direction, battlefield)) {
                System.out.println("Неправильные координаты");
                continue;
            }

            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield[x][y + i] = 1;
                } else {
                    battlefield[x + i][y] = 1;
                }
            }
            deck--;
        }
    }


    public static void drawField(int[][] battlefield) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");

        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) {
                if (battlefield[j][i] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }



    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) {

        while (true) {
            System.out.println(playerName + ", пожалуйста, сделайте свой выстрел!");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[j][i] == 0) {
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) {
                        System.out.print(". ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println("Введи координаты по оси X: ");
            int x = scanner.nextInt();
            System.out.println("Введи координаты по оси Y: ");
            int y = scanner.nextInt();
            if (battlefield[x][y] == 1) {
                System.out.println("Попадание! Ты можешь сделать выстрел еще раз!");
                monitor[x][y] = 2;
            } else {
                System.out.println("Не попал :(, ход за твоим противником!");
                monitor[x][y] = 1;
                break;
            }
        }

    }

    public static void placeShipsBot(String playerName, int[][] battlefield) {
        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName + ", поставь свой " + deck + "-х палубный боевой корабль!");
            System.out.println();

            drawField(battlefield);

            System.out.println("Введи координаты по оси X: ");
            int x = (int) (Math.random() * 10);
            System.out.println("Введи координаты по оси Y: ");
            int y = (int) (Math.random() * 10);
            System.out.println("Выбери в каком расположении будет корабль: ");
            System.out.println("1. По вертикали: ");
            System.out.println("2. По горизонтали: ");
            int direction = (int) (Math.random() * 2 + 1);
            if (!CheckShips.isAvailable(x, y, deck, direction, battlefield)) {
                System.out.println("Неправильные координаты");
                continue;
            }

            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield[x][y + i] = 1;
                } else {
                    battlefield[x + i][y] = 1;
                }
            }
            deck--;
        }
    }

    public static void makeTurnBot(String playerName, int[][] monitor, int[][] battlefield) {

        while (true) {
            System.out.println(playerName + ", пожалуйста, сделайте свой выстрел!");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[j][i] == 0) {
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) {
                        System.out.print(". ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println("Введи координаты по оси X: ");
            int x = (int) (Math.random() * 10);
            System.out.println("Введи координаты по оси Y: ");
            int y = (int) (Math.random() * 10);
            if (battlefield[x][y] == 1) {
                System.out.println("Попадание! Ты можешь сделать выстрел еще раз!");
                monitor[x][y] = 2;
            } else {
                System.out.println("Не попал :(, ход за твоим противником!");
                monitor[x][y] = 1;
                break;
            }
        }

    }


}
