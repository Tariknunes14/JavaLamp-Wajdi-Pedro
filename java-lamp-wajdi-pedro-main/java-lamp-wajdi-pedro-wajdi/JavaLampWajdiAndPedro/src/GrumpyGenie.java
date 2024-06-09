import java.util.Random;

class GrumpyGenie extends Genie {
    private boolean recycled;

    public GrumpyGenie() {
        super(1);
        this.recycled = false;
    }

    @Override
    public void grantWish() {
        if (!recycled) {
            System.out.println("Grumpy Genie grants a wish!");
            WishType randomWishType = getRandomWishType();
            System.out.println(randomWishType.getDescription());
            incrementGrantedWishes();
        }
    }
    public String toString() {
        return "Grumpy Genie";
    }
    private WishType getRandomWishType() { // 50% probability of good wish
        if (new Random().nextBoolean()) {
            return WishType.values()[(int) (Math.random() * 3)];// // or new Random().nextInt(3)
        } else {
            return WishType.values()[(int) (Math.random() * 3) + 3];// or new Random().nextInt(3)+3
        }
    }


    public void recycle() {
        if (!recycled){
            if (shouldDestroyLamp()) {
                System.out.println("Grumpy Genie destroys the lamp!");
            } recycled=true; }
            else {
            System.out.println("Grumpy Genie has been recycled! Lamp is recharged!");
        }
    }


    private boolean shouldDestroyLamp() {
        return new Random().nextBoolean();
    }
}
