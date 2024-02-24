import java.util.Scanner;

public class MenuOptions {

    public int MenuArabianNight() {
        System.out.println("*************************************************************");
        System.out.println("*               Welcome to Arabian Night                    *");
        System.out.println("*************************************************************");
        System.out.println("*  1-Create New Magic Lamp                                  *");
        System.out.println("*  2-Choose Magic Lamp                                      *");
        System.out.println("*  3-Rub Magic Lamp                                         *");
        System.out.println("*  4-Compare Magic Lamp                                     *");
        System.out.println("*  0-Exit                                                   *");
        System.out.println("*************************************************************");
        System.out.println("*                  Select an option                         *");
        System.out.println("*************************************************************");
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }

    public MagicLamp MenuCreateLamp(){
        return new MagicLamp();
    }

    public int MenuChooseLamp(int counterLamps){
        int input = 99;
        System.out.println("*************************************************************");
        System.out.println("*              Choose a Lamp between 1 - "+ (counterLamps) + "                  *");
        System.out.println("*************************************************************");
        System.out.println("*  0-Back                                                   *");
        System.out.println("*************************************************************");
        Scanner scanner= new Scanner(System.in);

        input = scanner.nextInt() - 1;

        while(counterLamps < input){
            System.out.println("Try again, Lamp does not exist");
            input = scanner.nextInt() - 1;
        }
        if (input != -1){
            System.out.println("Magic Lamp " + (input + 1) + " chosen");
        }

        return input;
    }

    public void MenuRubLamp(MagicLamp magicLamp){
        System.out.println("*************************************************************");
        System.out.println("*                   You rubbed the Lamp.                    *");
        int genie = magicLamp.isRubbed();

        if(genie == 0) {
            Demon demon = new Demon();
            System.out.println("*                Bad luck. You got a Demon.                 *");

            demon.GrantWish();
            if(!demon.isRecycled()){
                demon.Recycle();
                magicLamp.RechargingGenie();
            }
        }
        else if(genie == 1) {
            GrumpyGenie grumpy = new GrumpyGenie();
            System.out.println("*                 You got a Grumpy Genie.                   *");



            grumpy.GrantWish();
            boolean destructionLamp = false;
            if(!grumpy.isRecycled()) {
                destructionLamp = grumpy.Recycle();
                if(destructionLamp == true) {
                    magicLamp = null;
                    System.out.println("*          The Grumpy Genie has destroyed the Lamp.         *");

                } else {
                    magicLamp.RechargingGenie();
                    System.out.println("*              The Grumpy Genie was recycled.               *");
                }
            }
        } else {
            FriendlyGenie friendlyGenie = new FriendlyGenie();
            System.out.println("*             You got a Friendly Genie. Yupi!               *");
            friendlyGenie.GrantWish();
        }
        System.out.println("*************************************************************");
    }


    public int MenuCompareLamps(int counterLamps, MagicLamp[] magicLamps, int chosenLamp){
        System.out.println("*************************************************************");
        System.out.println("*       Choose 1 Lamp to compare between 1 - " + (counterLamps) +"              *");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("*  0-Back                                                   *");
        System.out.println("*************************************************************");

        if(counterLamps < 2) {
            System.out.println("*   Try again, you need to create at least 2 Magic Lamps    *");
            return 0; //back to menu
        }
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt() - 1;
        if (magicLamps[input].equals(magicLamps[chosenLamp])){
            System.out.println("*       Your lamps have the same number of genies.          *");
        } else {
            System.out.println("*      Your lamps have a different number of genies.        *");
        }
        return 1;
    }
}
