import java.util.Random;

public abstract class Genie {

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
