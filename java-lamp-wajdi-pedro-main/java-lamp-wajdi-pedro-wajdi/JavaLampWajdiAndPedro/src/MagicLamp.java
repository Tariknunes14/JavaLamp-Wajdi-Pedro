public class MagicLamp {
    private int maxGenies;
    private int remainingGenies;
    private int rechargeCount;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        this.remainingGenies = maxGenies;
        this.rechargeCount = 0;
    }

    public int getMaxGenies() {
        return maxGenies;
    }

    public int getRemainingGenies() {
        return remainingGenies;
    }

    public int getRechargeCount() {
        return rechargeCount;
    }

    public boolean hasGenies() {
        return remainingGenies > 0;
    }

    public void rubLamp() {
        if (hasGenies()) {
            Genie genie = releaseGenie();
            if (genie instanceof Demon || genie instanceof GrumpyGenie) {
                rechargeLamp();
            }
            genie.grantWish();
            remainingGenies--;
            System.out.println("You have released a " + genie  + "!");
            System.out.println("Remaining genies: " + remainingGenies);
        }
        else {
            System.out.println("No more genies left! A Demon is released!");
        }

    }


    private Genie releaseGenie() {
        if (remainingGenies % 2 == 0) {
            return new FriendlyGenie();
        } else {
            return new GrumpyGenie();
        }
    }


    private void rechargeLamp() {
        if (rechargeCount < 3) {
            remainingGenies++;
            rechargeCount++;
            System.out.println("Lamp has been recharged!");
        } else {
            System.out.println("Lamp cannot be recharged anymore!");
        }
    }
    public boolean isEqual(MagicLamp otherLamp) {
        return maxGenies == otherLamp.getMaxGenies() &&
                remainingGenies == otherLamp.getRemainingGenies() &&
                rechargeCount == otherLamp.getRechargeCount();
    }
}