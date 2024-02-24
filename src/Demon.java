import java.util.Random;

public class Demon extends Genie {

    private boolean isRecycled;

    public Demon() {
        this.isRecycled = false;
    }

    @Override
    public void GrantWish() {
        Random random = new Random();
        int wish = random.nextInt(3) + 1;
            if (wish == 1) {
                System.out.println("*                   Your wish is: " + WishType.POOR.getDescriptionWish()  + "                      *");
            } else if (wish == 2) {
                System.out.println("*                  Your wish is: " + WishType.SICKNESS.getDescriptionWish()  + "                   *");
            } else {
                System.out.println("*                 Your wish is: " + WishType.BAD_LUCK.getDescriptionWish()  + "                    *");
            }
    }

    //It can recharge the magic lamp if recycled.
    //It will not grant any more wishes after being recycled.
    public boolean Recycle() {
        isRecycled = true;
        remainingWishes = 0;
        System.out.println("*                 The Lamp will be recharged.               *");
        return false;
    }

    public boolean isRecycled() {
        return isRecycled;
    }

}
