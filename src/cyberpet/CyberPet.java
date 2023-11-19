package cyberpet;

public class CyberPet {
    private String name;
    private int hunger;
    private int tiredness;
    private int happiness;
    private int maxState = 100;
    private int minState = 0;
    public CyberPet(String name) {
        this.name = name;
        this.hunger = 0;
        this.tiredness = 0;
        this.happiness = 50;
    }

    public String getName() {
        return name;
    }

    public int getHunger(){
        return hunger;
    }

    public int getTiredness() {
        return tiredness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed() {
        System.out.println("Yum!");
        if (hunger > minState) {
            hunger -= 10;
        } else {
            hunger -= (hunger - minState);
        }
    }

    public void play() {
        System.out.println(name + " is playing!");
        if (happiness < maxState) {
            happiness += 10;
        } else {
            happiness += (maxState - happiness);
        }
        tiredness += 5;
    }

    public void sleep() {
        System.out.println("Zzz...");
        if (tiredness > minState) {
            tiredness -= 10;
        } else {
            tiredness -= (tiredness - minState);
        }
    }

    public boolean isDead() {
        if (tiredness > maxState || hunger > maxState || happiness < minState) {
            return true;
        }
        return false;
    }

    public void update() {
        happiness -= 5;
        tiredness += 5;
        hunger += 5;
    }

    public String toString() {
        return ("Name: " + name + "; happiness: " + Integer.toString(happiness)
        + "; tiredness: " + Integer.toString(tiredness) + "; hunger: "
        + Integer.toString((hunger)));
    }
}

