package org.tpiggo.zoo.controllers;

import org.springframework.web.bind.annotation.*;
import org.tpiggo.zoo.model.Animal;
import org.tpiggo.zoo.model.OpeningHours;
import org.tpiggo.zoo.service.Zoo;

import java.util.List;

@RestController
public class ZooController {
    private final Zoo zoo;

    public ZooController(Zoo zoo) {
        this.zoo = zoo;
    }


    @GetMapping("zoo/openingHours")
    public OpeningHours getOpeningHours(){
        return zoo.getOpeningHours();
    }

    @PutMapping("zoo/animals/{animalName}")
    public void updateAnimal(@PathVariable("animalName") String name, @RequestBody Animal animal){
        zoo.addAnimal(name, animal);
    }

    @GetMapping("zoo/animals/{animalName}")
    public Animal getAnimal(@PathVariable("animalName") String name) {
        return zoo.getAnimalDetails(name);
    }

    @GetMapping("zoo/animals")
    public List<Animal> getAllAnimals(){
        return zoo.getAnimals();
    }
}
