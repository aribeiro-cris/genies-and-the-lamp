import java.util.Random;

public class MagicLamp {
    private int totalGenies;
    private int remainingGenies;
    private int timesRecharged;
    private int maxNumberOfRecharged;

    public MagicLamp() {
        Random random = new Random();
        totalGenies = random.nextInt(10) + 1;
        maxNumberOfRecharged = random.nextInt(10) + 1;
        remainingGenies = totalGenies;
        timesRecharged = 0;
    }

    //Releases a new genie every time it is rubbed.
    public int isRubbed() {
        if(remainingGenies > 0) {
            Random random = new Random();
            int genieType = random.nextInt(2) + 1;
                //if 1 is GrumpyGenie, else is friendlyGenie
                remainingGenies--;
                return genieType;
            }
        //it's a Demon.
        return 0; //When the number of genies is exhausted, the lamp releases a Demon.

    }

    public void RechargingGenie(){
        if(maxNumberOfRecharged > timesRecharged) {
            timesRecharged++;
            remainingGenies++;
            //The Lamp was recharged
        }
    }

    public boolean equals(MagicLamp magicLamp) {
        if (this.totalGenies == magicLamp.totalGenies && this.remainingGenies == magicLamp.remainingGenies && this.timesRecharged == magicLamp.timesRecharged) {
            return true;
        } else {
            return false;
        }
    }

}
