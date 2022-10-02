package org.tpiggo.zoo.service;

import org.springframework.stereotype.Service;
import org.tpiggo.zoo.model.Animal;
import org.tpiggo.zoo.model.OpeningHours;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Principal class of the Zoo, offering all relevant public functionality. Access to public methods
 * of this implementation is demonstrated in the DesktopLauncher class. This class is a singleton.
 *
 * @author Timothy Piggott
 */

@Service
public class Zoo {


  // private fields for indexed animals and opening hours.
  private final Map<String, Animal> animals;
  private final OpeningHours openingHours;

  /**
   * Private constructor, populates the zoo.
   */
  public Zoo() {
    openingHours = new OpeningHours();
    animals = new LinkedHashMap<>();
    addAnimal("Charly", new Animal("Chimpanzee", 10, "Bananas"));
    addAnimal("Nemo", new Animal("Clownfish", 4, "Plankton"));
    addAnimal("Dumbo", new Animal("Elephant", 13, "Peanuts"));
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

  public List<Animal> getAnimals() {
    return new ArrayList<>(animals.values());
  }
}