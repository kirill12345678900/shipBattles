package Ships;

import static Ships.BattleShip.*;

public class Menu {
    public static void menu() {
        System.out.println("Введите 1, чтобы войти в режим игры <Игрок против игрока>!");
        System.out.println("Введите 2, чтобы войти в режим игры <Игрок против робота>!");
        System.out.println("Введите 3, чтобы войти в режим игры <Робот против робота>!");
        System.out.println("Введите 4, что бы выйти!");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("             Игрок 1, введите своё имя: ");
                Player.player1 = scanner.next();
                System.out.println("             Игрок 2, введите своё имя: ");
                Player.player2 = scanner.next();

                System.out.println("-------------------------------------------------------");

                System.out.println("Имя первого игрока: " + Player.player1);
                System.out.println("Имя второго игрока: " + Player.player2);

                PlayerVsPlayer.placeShips(Player.player1, battlefield1);
                PlayerVsPlayer.placeShips(Player.player2, battlefield2);

                while (true) {
                    PlayerVsPlayer.makeTurn(Player.player1, monitor1, battlefield2);
                    if (WhoWin.isWinCondition()) {
                        break;
                    }
                    PlayerVsPlayer.makeTurn(Player.player2, monitor2, battlefield1);
                    if (WhoWin.isWinCondition()) {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("             Игрок 1, введите своё имя: ");
                Player.player1 = scanner.next();

                System.out.println("-------------------------------------------------------");

                System.out.println("Имя первого игрока: " + Player.player1);
                System.out.println("Имя робота: " + Bot.bot1);
                PlayerVsBot.placeShips(Player.player1, battlefield1);
                PlayerVsBot.placeShipsBot(Bot.bot1, battlefield2);

                while (true) {
                    PlayerVsBot.makeTurn(Player.player1, monitor1, battlefield2);
                    if (WhoWin.isWinCondition3()) {
                        break;
                    }
                    PlayerVsBot.makeTurnBot(Bot.bot1, monitor2, battlefield1);
                    if (WhoWin.isWinCondition3()) {
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------------");

                System.out.println("Имя первого игрока: " + Bot.bot1);
                System.out.println("Имя второго игрока: " + Bot.bot2);

                BotVsBot.placeShipsBot(Bot.bot1, battlefield1);
                BotVsBot.placeShipsBot(Bot.bot2, battlefield2);

                while (true) {
                    BotVsBot.makeTurnBot(Bot.bot1, monitor1, battlefield2);
                    if (WhoWin.isWinCondition2()) {
                        break;
                    }
                    BotVsBot.makeTurnBot(Bot.bot2, monitor2, battlefield1);
                    if (WhoWin.isWinCondition2()) {
                        break;
                    }
                }
                break;

            case 4:
                return;
            default:
                System.out.println("Error");
        }
        menu();
    }
}
