import java.util.Scanner;
public class SelectCharacter{
    Game game=new Game();
    Player player=new Player(game.login());
    Scanner scan =new Scanner(System.in);
    public void select(){
        System.out.println("Lütfen bir karakter seçiniz!");
        System.out.println("1- Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
        System.out.println("2- Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
        System.out.println("3- Şövalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5");
        int selectedCharacter=scan.nextInt();
        while (selectedCharacter>3 || selectedCharacter<1){
            System.out.println("Karakter id yanlış seçildi.");
            System.out.println("Lütfen tekrar deneyin");
            selectedCharacter=scan.nextInt();

        }


        switch (selectedCharacter){
            case 1:
                player.setCharacterName("Samuray");
                player.setDamage(0b101);
                player.setHealth(21);
                player.setMoney(15);
                break;
            case 2:
                player.setCharacterName("Okçu");
                player.setDamage(7);
                player.setHealth(18);
                player.setMoney(20);
                break;
            case 3:
                player.setCharacterName("Şövalye");
                player.setDamage(8);
                player.setHealth(24);
                player.setMoney(5);
                break;
            default:
                player.setCharacterName("Samuray");
                player.setDamage(5);
                player.setHealth(21);
                player.setMoney(15);
                break;
        }
        System.out.println("Karakteriniz: "+player.getCharacterName()+"\t Hasar: "+player.getDamage()+"\t Sağlık: "+player.getHealth()+"\t Para: "+player.getMoney());

    }


}
