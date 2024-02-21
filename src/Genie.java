import java.util.Random;

public abstract class Genie {

    //When released from the lamp or instantiated, the maximum number of wishes is set. > Genie
    protected int remainingWishes;

    public Genie() {
        Random random = new Random();
        this.remainingWishes = random.nextInt(6) + 1;
    }

    public abstract void GrantWish();

    public int getRemainingWishes() {
        return remainingWishes;
    }

}
