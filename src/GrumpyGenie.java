import java.util.Random;

public class GrumpyGenie extends Genie {

    private boolean isRecycled;

    //Grants only one wish, even if the maximum has not been reached.

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
        //It can grant good or bad wishes, and the probability of either should be 50%.
        Random random = new Random();
        int probabilityOfTypeWish = random.nextInt(6) + 1; {
            switch (probabilityOfTypeWish) {
                case 1:
                    System.out.println("You got a good wish.. " + WishType.LUCK.getDescriptionWish());
                    break;
                case 2:
                    System.out.println("You got a good wish.. " + WishType.WEALTH.getDescriptionWish());
                    break;
                case 3:
                    System.out.println("You got a good wish.. " + WishType.FAME.getDescriptionWish());
                    break;
                case 4:
                    System.out.println("You got yourself a bad wish.. " + WishType.POOR.getDescriptionWish());
                    break;
                case 5:
                    System.out.println("You got yourself a bad wish.. " + WishType.SICKNESS.getDescriptionWish());
                    break;
                case 6:
                    System.out.println("You got yourself a bad wish.. " + WishType.BAD_LUCK.getDescriptionWish());
                    break;
            }
            remainingWishes--;
        }
    }

    //It can recharge a magic lamp if recycled but has a 50% chance of destroying the lamp.
    //It will not grant any more wishes after being recycled.
    //It can only be recycled once.
    public boolean Recycle() {
        isRecycled = true;
        remainingWishes = 0;

        Random random = new Random();
        boolean destroyingTheLamp = random.nextBoolean();
        if (destroyingTheLamp) {
            System.out.println("The lamp will be destroyed.");
        } else {
            System.out.println("Magic lamp will be recharged.");
        }
        return destroyingTheLamp;
    }

    public boolean isRecycled() {
        return isRecycled;
    }
}
