public class ArabianNights {
    public static void main(String[] args) {
        MagicLamp lamp1 = new MagicLamp(3);
        MagicLamp lamp2 = new MagicLamp(5);

        System.out.println("Lamp 1: Max Genies  " + lamp1.getMaxGenies() +
                ", Remaining Genies " + lamp1.getRemainingGenies() +
                ", Recharge Count  " + lamp1.getRechargeCount());

        System.out.println("Lamp 2: Max Genies " + lamp2.getMaxGenies() +
                ", Remaining Genies  " + lamp2.getRemainingGenies() +
                ", Recharge Count  " + lamp2.getRechargeCount());

        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();

        lamp2.rubLamp();
        lamp2.rubLamp();
        lamp2.rubLamp();
        lamp2.rubLamp();

        lamp1.rubLamp();

        System.out.println("Lamp 1: Max Genies  " + lamp1.getMaxGenies() +
                ", Remaining Genies  " + lamp1.getRemainingGenies() +
                ", Recharge Count  " + lamp1.getRechargeCount());

        System.out.println("Lamp 2: Max Genies  " + lamp2.getMaxGenies() +
                ", Remaining Genies  " + lamp2.getRemainingGenies() +
                ", Recharge Count  " + lamp2.getRechargeCount());

        if (lamp1.isEqual(lamp2)) {
            System.out.println("Lamp 1 is equal to Lamp 2");
        } else {
            System.out.println("Lamp 1 is not equal to Lamp 2");
        }

    }
}
