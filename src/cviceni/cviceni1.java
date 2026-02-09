package cviceni;

import java.util.Scanner;
public class cviceni1 {
    public static void main(String[] args) {
        String[][] znacky = {{"A","B","C","E","H","J","K","L","M","P","S","T","U","Z"},{"Praha","Jihomoravský kraj","Jihočeský kraj","Pardubický kraj","Královéhradecký kraj","Vysočina","Karlovarský kraj","Liberecký kraj","Olomoucký kraj","Plzeňský kraj","Středočeský kraj","Moravskoslezský kraj","Ústecký kraj","Zlínský kraj"}};
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej SPZ: ");
        String znacka = sc.nextLine().toUpperCase();

        char pismeno = znacka.charAt(1);

        for (int i = 0; i < znacky[0].length; i++){
            if (znacky[0][i].charAt(0) == pismeno){
                System.out.println(znacky[1][i]);
            }
        }
    }
}
