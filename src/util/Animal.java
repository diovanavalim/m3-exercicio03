package util;

public abstract class Animal {
    private String nome;
    private String raca;
    private int idade;
    private String corDoPelo;

    public Animal(String nome, String raca, int idade, String corDoPelo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.corDoPelo = corDoPelo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public void caminhar() {
        System.out.println("Andando!");
    }

    public void dormir() {
        System.out.println("Dormindo!");
    }

    public void seLimpar() {
        System.out.println("Tomando banho!");
    }

    public abstract String falar();
}
