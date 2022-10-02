package org.tpiggo.zoo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Principal class of the Zoo, offering all relevant public functionality. Access to public methods
 * of this implementation is demonstrated in the DesktopLauncher class. This class is a singleton.
 *
 * @author Maximilian Schiedermeier
 */
public class Zoo {

  // Singleton reference
  private static Zoo singleton = null;

  // private fields for indexed animals and opening hours.
  private final Map<String, Animal> animals;
  private final OpeningHours openingHours;

  /**
   * Private constructor, populates the zoo.
   */
  private Zoo() {
    openingHours = new OpeningHours();
    animals = new LinkedHashMap<>();
    addAnimal("Charly", new Animal("Chimpanzee", 10, "Bananas"));
    addAnimal("Nemo", new Animal("Clownfish", 4, "Plankton"));
    addAnimal("Dumbo", new Animal("Elephant", 13, "Peanuts"));
  }

  /**
   * Singleton patter access method.
   *
   * @return the one and only Zoo instance.
   */
  public static Zoo getInstance() {
    if (singleton == null) {
      singleton = new Zoo();
    }
    return singleton;
  }

  /**
   * Returns a list with all animal names.
   *
   * @return Collection with the names of all indexed animals.
   */
  public Collection<String> getAllAnimalNames() {
    return animals.keySet();
  }

  /**
   * Getter to look up details on one specific animal, identified by name.
   *
   * @param name as the animals name.
   * @return the animal object associated to this name.
   */
  public Animal getAnimalDetails(String name) {
    return animals.get(name);
  }

  /**
   * Setter to add a new animal to the zoo.
   *
   * @param name   as the name of the animal to index.
   * @param animal as the characteristics of the animal to add.
   */
  public void addAnimal(String name, Animal animal) {
    animals.put(name, animal);
  }

  /**
   * Getter to retrieve the zoo opening hours.
   *
   * @return the zoo opening hours.
   */
  public OpeningHours getOpeningHours() {
    return openingHours;
  }


}