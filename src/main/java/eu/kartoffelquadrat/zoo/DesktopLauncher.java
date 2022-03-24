package eu.kartoffelquadrat.zoo;

/**
 * Desktop Launcher demonstrates main functionality of the Zoo implementation.
 *
 * @author Maximilian Schiedermeier
 */
public class DesktopLauncher {

    public static void main(String[] args) {

        // Creating a zoo, it comes with some default dataright upon creation.
        Zoo zoo = Zoo.getInstance();

        // Just a little demo on how to access / modify the zoo...
        System.out.println("Welcome to the Zoo!");
        System.out.println("The zoo is open:");
        System.out.println(zoo.getOpeningHours());
        System.out.println("Come and visit out gorgeous animals:");
        System.out.println(zoo.getAllAnimalNames());

        // Modify the zoo by adding a new animal:
        System.out.println("Meet our newest member:");
        zoo.addAnimal("Baloo", new Animal("Black Bear", 8, "Honey"));
        System.out.println("\tBaloo" + zoo.getAnimalDetails("Baloo"));
    }
}