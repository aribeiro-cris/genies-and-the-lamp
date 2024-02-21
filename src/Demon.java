import java.util.Random;

public class Demon extends Genie {

    private boolean isRecycled;

    public Demon() {
        this.isRecycled = false;
    }

    //Grants all wishes, even if the maximum has already been reached.
    //It only grants bad wishes.
    @Override
    public void GrantWish() {
        Random random = new Random();
        int wish = random.nextInt(3) + 1;
            if (wish == 1) {
                System.out.println("You got yourself a bad wish.. " + WishType.POOR.getDescriptionWish());
            } else if (wish == 2) {
                System.out.println("You got yourself a bad wish.. " + WishType.SICKNESS.getDescriptionWish());
            } else {
                System.out.println("You got yourself a bad wish.. " + WishType.BAD_LUCK.getDescriptionWish());
            }
    }

    //It can recharge the magic lamp if recycled.
    //It will not grant any more wishes after being recycled.
    //It can only be recycled once.
    public boolean Recycle() {
        isRecycled = true;
        remainingWishes = 0;
        System.out.println("Magic lamp will be recharged.");
        return false;
    }

    public boolean isRecycled() {
        return isRecycled;
    }

}
