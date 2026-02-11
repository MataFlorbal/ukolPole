package cviceni;

import java.util.Scanner;

public class cviceni3 {
    public static void main(String[] args) {
        String[][] tabulka = {
                {"česky ", "anglicky ", "německy ", "španělsky"},
                {"bílá ", "white ", "weiss ", "blanco "},
                {"černá ", "black ", "schwarz ", "negro "}
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < tabulka.length; i++) {
            System.out.println(i + ". " + tabulka[i][0]);
        }
        System.out.println("Zadejte číslo barvy: ");
        int radek = sc.nextInt();

        for (int i = 1; i < tabulka[0].length; i++){
            System.out.println(i + ". " + tabulka[0][i]);
        }
        System.out.println("Zadejte číslo jazyka: ");
        int sloupec = sc.nextInt();

        System.out.println("Překlad: " + tabulka[radek][sloupec]);
    }
}
