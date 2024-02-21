import java.io.IOException;
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
        System.out.println("*           Choose a Lamp between 1 - "+ (counterLamps) + "    *");
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

    //MenuRubLamp(){

    //}

    public int MenuCompareLamps(int counterLamps){
        System.out.println("*************************************************************");
        System.out.println("Choose 2 Lamps to compare between 1 - " + (counterLamps) +" *");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("*  0-Back                                                   *");
        System.out.println("*************************************************************");
        Scanner scanner= new Scanner(System.in);

    }
}
