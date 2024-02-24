public enum WishType {
    WEALTH("Wealth"),
    FAME("Fame"),
    LUCK("Luck"),
    POOR("Poor"),
    SICKNESS("Sickness"),
    BAD_LUCK("Bad Luck");

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
