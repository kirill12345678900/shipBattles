package Ships;

public class BotVsBot {

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
            PlayerVsPlayer.logger.info("Робот " + playerName + "ввел координаты корабля по оси X и Y " + x + " " + y);

            System.out.println("Выбери в каком расположении будет корабль: ");
            System.out.println("1. По вертикали: ");
            System.out.println("2. По горизонтали: ");
            int direction = (int) (Math.random() * 2 + 1);

            if(direction == 1){
                PlayerVsPlayer.logger.info("Робот ставит"+ playerName + deck + "-х корабль по вертикали" );
            }
            else {
                PlayerVsPlayer.logger.info("Робот ставит"+ playerName + deck + "-х корабль по горизонтали" );
            }

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
            PlayerVsPlayer.logger.info("Робот " + playerName + " сделал выстрел по координатам " + x + " " + y + " ");
            if (battlefield[x][y] == 1) {
                System.out.println("Попадание! Ты можешь сделать выстрел еще раз!");
                PlayerVsPlayer.logger.info("Робот " + playerName + " попал по кораблю противника!");
                monitor[x][y] = 2;
            } else {
                System.out.println("Не попал :(, ход за твоим противником!");
                PlayerVsPlayer.logger.info("Робот " + playerName + " промазал по кораблю противника!");
                monitor[x][y] = 1;
                break;
            }
        }

    }
}
