package Q1.repository;

import Q1.entity.Animal;

public interface IAnimalRepository {
    Animal getAnimalByName(String name);

    void save(Animal animal);

    void deleteAnimalByName(String name);

    void updateAnimalByName(String actualName, String newName);
}
