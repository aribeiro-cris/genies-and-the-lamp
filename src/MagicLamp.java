import java.util.Random;

public class MagicLamp {

    //Releases a new genie every time it is rubbed.
    //Genies can be Friendly, Grumpy, or a Demon.

    //The maximum number of genies is set when the lamp is enchanted, or instantiated.
    private int totalGenies;
    private int remainingGenies; //number of remaining genies
    private int timesRecharged; //the number of times they have been recharged
    private int maxNumberOfRecharged; //Has a maximum amount of times it can be recharged.

    public MagicLamp() {
        Random random = new Random();
        totalGenies = random.nextInt(10) + 1;
        maxNumberOfRecharged = random.nextInt(10) + 1;
        remainingGenies = totalGenies;
        timesRecharged = 0;
    }

    //A little tip: you can think of friendly genies as even numbers and of grumpy as odd ones.
    //Releases a new genie every time it is rubbed.
    public int isRubbed() {
        if(remainingGenies > 0) {
            Random random = new Random();
            int genieType = random.nextInt(2) + 1;
                if(genieType == 1) {
                    System.out.println("You got a GrumpyGenie.");
                } else {
                    System.out.println("You got a FriendlyGenie.");
                }
                remainingGenies--;
                return genieType;
            }
        System.out.println("You got a Demon.");
        return 0; //return zero = When the number of genies is exhausted, the lamp releases a Demon.

    }

    //The Lamp has the ability to recharge itself by recycling a Demon or a Grumpy Genie.
    public void RechargingGenie(){
        if(maxNumberOfRecharged > timesRecharged) {
            timesRecharged++;
            remainingGenies++;
            System.out.println("The Lamp was recharged.");
        }
    }

    //Your program needs to be able to produce more than one lamp and compare the lamps.
    //The lamps may be compared
    public boolean equals(MagicLamp magicLamp) {
        if (this.totalGenies == magicLamp.totalGenies && this.remainingGenies == magicLamp.remainingGenies && this.timesRecharged == magicLamp.timesRecharged) {
            return true;
        } else {
            return false;
        }
    }

}
