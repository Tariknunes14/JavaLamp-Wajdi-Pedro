public enum WishType {
    FAME("OOOOPS!!!!!!You will be more famous than Micheal Jackson!!!"),
    LUCK("OH YEAH!!!!!You will win the next EuroMillion!"),
    WEALTH("OH YEAHH!!!!you will be the CEO of CodeforALL_!!!"),
    POOR("OOOOPS!!!!!You will lose all your money in Estoril casino!!"),
    SICKNESS("OOOOPS!!!!You will stay sick until the end of your life "),
    BAD_LUCK("OOOOPS!!!!!Your Bank account will be hacked soon!!!");



    private final String description;

    WishType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
