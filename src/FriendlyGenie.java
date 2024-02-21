import java.util.Random;

public class FriendlyGenie extends Genie {

    public FriendlyGenie() {
        super();
    }

    @Override
    public void GrantWish() {
        //It can grant a wish if the maximum has not been reached.
        if(remainingWishes == 0) {
            System.out.println("No more wishes to grant.");
            return;
        }

        //It can only grant good wishes.
        Random random = new Random();
        int wish = random.nextInt(3) + 1;
        if (wish == 1) {
            System.out.println("You got yourself a good wish.. " + WishType.WEALTH.getDescriptionWish());
            remainingWishes --;
        } else if (wish == 2) {
            System.out.println("You got yourself a good wish.. " + WishType.FAME.getDescriptionWish());
            remainingWishes--;
        } else {
            System.out.println("You got yourself a good wish.. " + WishType.LUCK.getDescriptionWish());
            remainingWishes --;
        }
    }
}

