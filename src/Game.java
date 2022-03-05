import java.util.Scanner;
public class Game {
    Scanner scan=new Scanner(System.in);
    public String login(){
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.println("Lütfen İsminizi Giriniz.");
        String playerName= scan.nextLine();
        System.out.println("Hoşgeldin "+playerName);
        return playerName;
    }

}