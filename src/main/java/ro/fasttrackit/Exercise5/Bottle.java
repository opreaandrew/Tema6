package ro.fasttrackit.Exercise5;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;

    public Bottle(int totalCapacity, int availableLiquid, boolean isOpen) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.isOpen = isOpen;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String open() {
        if (isOpen) {
            return "Bottle is already opened";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    public String close() {
        if (!isOpen) {
            return "Bottle is already closed";
        } else {
            isOpen = false;
            return "Bottle is closed";
        }
    }

    public String drink(int amount) {
        if (!isOpen) {
            return "Bottle is closed.";
        }

        if (amount <= 0) {
            return "Bottle is empty.";
        }

        if (availableLiquid >= amount) {
            availableLiquid -= amount;
            return "You drank " + amount + " units of liquid.";
        } else {
            return "Not enough liquid to drink.";
        }
    }
}
