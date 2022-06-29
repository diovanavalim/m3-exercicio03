package model;

import util.Animal;
import util.AnimalCarnivoro;

public class Gato extends Animal implements AnimalCarnivoro {
    public Gato(String nome, String raca, int idade, String corDoPelo) {
        super(nome, raca, idade, corDoPelo);
    }

    @Override
    public String falar() {
        return "Miau!";
    }

    @Override
    public String comerCarne() {
        return "Comendo ração de carne!";
    }
}
