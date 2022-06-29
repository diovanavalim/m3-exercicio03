package model;

import util.Animal;
import util.AnimalHerbivoro;

public class Vaca extends Animal implements AnimalHerbivoro {
    public Vaca(String nome, String raca, int idade, String corDoPelo) {
        super(nome, raca, idade, corDoPelo);
    }

    @Override
    public String falar() {
        return "Muu!";
    }

    @Override
    public String comerPlantas() {
        return "Comendo pasto!";
    }
}
