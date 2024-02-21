import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class ArabianNights {

    public static void main(String[] args) {

        MenuOptions menu1 = new MenuOptions();
        int menuOption = 99;
        int counterLamps = 0;
        int chosenLamp = 0;

        MagicLamp magicLamps[] = new MagicLamp[10];

        while(menuOption != 0) {
            menuOption = menu1.MenuArabianNight();
            System.out.println(menuOption);

            switch (menuOption) {
                case 1:
                    magicLamps[counterLamps] = menu1.MenuCreateLamp();
                    System.out.println("New Lamp Created (" + (counterLamps + 1) + ")");
                    counterLamps++;
                    break;
                case 2:
                    int aux = menu1.MenuChooseLamp(counterLamps);
                    if (aux >= 0) {
                        chosenLamp = aux;
                    }
                    break;
                case 3:
                    //menu1.MenuRubLamp();
                    break;
                case 4:
                    //menu1.MenuCompareLamps();
                    break;
                default:
                    break;
            }
        }

        MagicLamp magicLamp = new MagicLamp();
        int genie = magicLamp.isRubbed();

        if(genie == 0) {
            Demon demon = new Demon();
            demon.GrantWish();
            if(!demon.isRecycled()){
                demon.Recycle();
                magicLamp.RechargingGenie();
            }
        }
        else if(genie == 1) {
            GrumpyGenie grumpy = new GrumpyGenie();
            grumpy.GrantWish();
            boolean destructionLamp = false;
            if(!grumpy.isRecycled()) {
                destructionLamp = grumpy.Recycle();
                if(destructionLamp == true) {
                     magicLamp = null;
                     System.out.println("Lamp destroyed.");
                } else {
                    magicLamp.RechargingGenie();
                }
            }
        } else {
            FriendlyGenie friendlyGenie = new FriendlyGenie();
            friendlyGenie.GrantWish();
        }

    }
}