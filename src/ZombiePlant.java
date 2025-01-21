public class ZombiePlant {

    private int maxPotency;
    private int treatmentsNeeded;
    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        if (potency <= 0) {
            // treatment with potency less than 0 should have no effect
            return;
        }
        if (treatmentsNeeded > 0) {
            if (potency <= maxPotency) {
                treatmentsNeeded--;
            } else {
                treatmentsNeeded++;
            }
        } else if (potency > maxPotency) {
            treatmentsNeeded = 1;
        }
    }

}
