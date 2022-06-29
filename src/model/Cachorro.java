package model;

import util.AnimalCarnivoro;
import util.Animal;

public class Cachorro extends Animal implements AnimalCarnivoro {
    public Cachorro(String nome, String raca, int idade, String corDoPelo) {
        super(nome, raca, idade, corDoPelo);
    }

    @Override
    public String falar() {
        return "Auau!";
    }

    @Override
    public String comerCarne() {
        return "Comendo ração de carne!";
    }
}
