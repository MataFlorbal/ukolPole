package cviceni;

public class cviceni3 {
    public static void main(String[] args) {
        String[][] tabulka = {
                {"česky ", "anglicky ", "německy ", "španělsky"},
                {"bílá ", "white ", "weiss ", "blanco "},

        };
        for (int i = 1; i < tabulka[0].length; i++) {
            for (int j = 0; j < tabulka[i].length; j++) {
                System.out.print(tabulka[i][j] + "");
            }
            System.out.println();
        }
    }
}
