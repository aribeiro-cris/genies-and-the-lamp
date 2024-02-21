public enum WishType {
    WEALTH("I wish for you true wealth, which boils down to holistic and abiding well-being."),
    FAME("I wish for you fame and glory. Your name will be famous."),
    LUCK("I wish you all the biggest luck in the world, only good and positive thoughts."),
    POOR("I wish you to become poor, all your money will be gone."),
    SICKNESS("I wish you to become sick, all the illness will be with you."),
    BAD_LUCK("You will have bad luck for the future.");

    private String descriptionWish;

    WishType(String descriptionWish) {
        this.descriptionWish = descriptionWish;
    }

    public String getDescriptionWish() {
        return descriptionWish;
    }

    public void description() {
        System.out.println(descriptionWish);
    }
}
