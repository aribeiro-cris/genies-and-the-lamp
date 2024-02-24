import java.util.Random;

public class FriendlyGenie extends Genie {

    public FriendlyGenie() {
        super();
    }

    @Override
    public void GrantWish() {
        if(remainingWishes == 0) {
            System.out.println("No more wishes to grant.");
            return;
        }
        Random random = new Random();
        int wish = random.nextInt(3) + 1;
        if (wish == 1) {
            System.out.println("*                   Your wish is: " + WishType.WEALTH.getDescriptionWish() + "                    *");
            remainingWishes --;
        } else if (wish == 2) {
            System.out.println("*                    Your wish is: " + WishType.FAME.getDescriptionWish() + "                     *");
            remainingWishes--;
        } else {
            System.out.println("*                    Your wish is: " + WishType.LUCK.getDescriptionWish()  + "                     *");
            remainingWishes --;
        }
    }
}

