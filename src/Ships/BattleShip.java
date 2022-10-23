package Ships;

import java.io.IOException;
import java.util.Scanner;

//Раскидать похожий код по методам
//Разобраться с наследованием
//Задать константы enum
//Раскидать всё по папкам
//Сделать интерфейсы

public class BattleShip {

    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];
    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];

    public static void main(String[] args) {

        System.out.println("       Добро пожаловать в игру Морской бой!");
        System.out.println("Для регистрации боя вам необходимо ввести свои имена!");

        Menu.menu();

    }


}
