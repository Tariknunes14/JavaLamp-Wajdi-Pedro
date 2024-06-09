public abstract class Genie {
    private int maxWishes;
    private int grantedWishes;

    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;
        this.grantedWishes = 0;
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    protected void incrementGrantedWishes() {
        if (grantedWishes < maxWishes) {
            grantedWishes++;
        }
    }



    public abstract void grantWish();

    public abstract void recycle();
}

