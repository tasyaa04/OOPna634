package cyberpet;

import java.util.*;

public class CyberPetGame {
    private List<CyberPet> pets;

    public CyberPetGame() {
        pets = new ArrayList<>();
        play();
    }

    public void play() {
        Scanner in = new Scanner(System.in);

        System.out.print("Give your pet a name: ");
        String petName = in.nextLine();

        CyberPet pet = new CyberPet(petName);
        pets.add(pet);
        /**
         * One day this game will allow users to create multiple pets of various types
         * and this line will make sense...
         * but today is not that day
         */

        boolean gameOver = false;
        while (!gameOver) {
            System.out.println(pet);

            System.out.println("\nChoose an action (1-4):");
            System.out.println("1. Play");
            System.out.println("2. Feed");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");


            try {
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        pet.play();
                        break;
                    case 2:
                        pet.feed();
                        break;
                    case 3:
                        pet.sleep();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Please type in an integer between 1 and 4");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                in.nextLine();
            }
            pet.update();
            if (pet.isDead()) {
                System.out.println("Uh oh! Seems like " + pet.getName() + " has died...");
                System.out.println("\nGame Over");
                gameOver = true;
            }
        }
    }
}
