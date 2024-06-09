class FriendlyGenie extends Genie {
    public FriendlyGenie() {
        super(1);
    }




    @Override
    public void grantWish() {
        if (getGrantedWishes() < getMaxWishes()) {
            System.out.println("Friendly Genie grants a wish!");
            /* or new Random().nextInt(3) */
            WishType randomWishType = WishType.values()[(int) (Math.random() * 3)];
            System.out.println(randomWishType.getDescription());
            incrementGrantedWishes();
        }
    }

    @Override
    public void recycle() {
        System.out.println("FriendlyGenie cannot be recycled");

    }

    public String toString() {
        return "Friendly Genie";
    }
}