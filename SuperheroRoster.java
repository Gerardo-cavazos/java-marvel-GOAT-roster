public class SuperheroRoster {

    public static void main(String[] args) {
        // Updated hero data
        String[] heroNames = {"Iron Fist", "Rocket", "The Thing", "Thor", "Luna Snow"};
        String[] abilities = {
            "Martial arts and chi energy", 
            "Expert marksman and tactician", 
            "Super strength and durability", 
            "Thunder god powers", 
            "Cryokinesis (ice powers)"
        };
        int[] powerLevels = {82, 78, 88, 95, 84};

        // Display each hero's details
        System.out.println("Marvel Superhero Roster:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }

        // Search for heroes 
        searchHero(heroNames, abilities, powerLevels, "Rocket"); 
        searchHero(heroNames, abilities, powerLevels, "Black Panther");

        // Average power
        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);

        // Create Superhero objects 
        Superhero[] heroObjects = new Superhero[heroNames.length]; 
        for (int i = 0; i < heroNames.length; i++) {
            heroObjects[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        System.out.println("\n--- Superhero Objects Display ---");
        for (Superhero hero : heroObjects) {
            hero.displayHero();
        }
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\nHero Found:");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nHero '" + target + "' not found in the roster.");
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}

