
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
                    int aux = menu1.MenuChooseLamp(counterLamps); //aux var auxiliary
                    if (aux >= 0) {
                        chosenLamp = aux;
                    }
                    break;
                case 3:
                    menu1.MenuRubLamp(magicLamps[chosenLamp]);
                    break;
                case 4:
                    menu1.MenuCompareLamps(counterLamps, magicLamps, chosenLamp);
                    break;
                default:
                    break;
            }
        }
    }
}