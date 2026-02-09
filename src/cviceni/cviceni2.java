package cviceni;

import java.util.Scanner;
public class cviceni2 {
    public static void main(String[] args) {
        String[][] svatky = {{"29","6","Pavel"},{"24","2","Matěj"},{"7","3","Tomáš"},{"24","6","Jan"},{"18","6","Milan"}};
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej den: ");
        String den = sc.nextLine();

        System.out.print("Zadej měsíc: ");
        String mesic = sc.nextLine();

        for (int i = 0; i < svatky.length; i++){
            if (svatky[i][0].equals(den) && svatky[i][1].equals(mesic)){
                System.out.println("Svátek má: " + svatky[i][2]);
            }
        }
    }
}
