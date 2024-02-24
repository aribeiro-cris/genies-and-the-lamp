import java.util.Random;

public class GrumpyGenie extends Genie {

    private boolean isRecycled;

    public GrumpyGenie() {
        remainingWishes = 1;
        this.isRecycled = false;
    }

    @Override
    public void GrantWish() {
        if(remainingWishes == 0) {
            System.out.println("No more wishes to grant.");
            return;
        }
        Random random = new Random();
        int probabilityOfTypeWish = random.nextInt(6) + 1; {
            switch (probabilityOfTypeWish) {
                case 1:
                    System.out.println("*                    Your wish is: " + WishType.LUCK.getDescriptionWish()  + "                     *");
                    break;
                case 2:
                    System.out.println("*                   Your wish is: " + WishType.WEALTH.getDescriptionWish() + "                    *");
                    break;
                case 3:
                    System.out.println("*                    Your wish is: " + WishType.FAME.getDescriptionWish() + "                     *");
                    break;
                case 4:
                    System.out.println("*                   Your wish is: " + WishType.POOR.getDescriptionWish()  + "                      *");
                    break;
                case 5:
                    System.out.println("*                  Your wish is: " + WishType.SICKNESS.getDescriptionWish()  + "                   *");
                    break;
                case 6:
                    System.out.println("*                 Your wish is: " + WishType.BAD_LUCK.getDescriptionWish()  + "                    *");
                    break;
            }
            remainingWishes--;
        }
    }

    //It can recharge a magic lamp if recycled but has a 50% chance of destroying the lamp.
    //It will not grant any more wishes after being recycled.
    public boolean Recycle() {
        isRecycled = true;
        remainingWishes = 0;

        Random random = new Random();
        boolean destroyingTheLamp = random.nextBoolean();
        if (destroyingTheLamp) {
            System.out.println("*               The Lamp will be destroyed.                 *");

        } else {
            System.out.println("*              The Lamp will be recharged.                  *");

        }
        return destroyingTheLamp;
    }

    public boolean isRecycled() {
        return isRecycled;
    }
}
