import model.Cachorro;
import model.Gato;
import model.Vaca;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobias", "Dashchund", 9, "Marrom");
        Gato gato = new Gato("Javascript", "Siamês", 1, "Tigrada");
        Vaca vaca = new Vaca("Mimosa", "Angus", 2, "Gatiada");

        System.out.println(String.format("%s está falando: %s", cachorro.getNome(), cachorro.falar()));
        System.out.println(String.format("%s está falando: %s", gato.getNome(), gato.falar()));
        System.out.println(String.format("%s está falando: %s", vaca.getNome(), vaca.falar()));

        System.out.println(" ");

        System.out.println(String.format("%s está: %s", cachorro.getNome(), cachorro.comerCarne()));
        System.out.println(String.format("%s está: %s", gato.getNome(), gato.comerCarne()));
        System.out.println(String.format("%s está: %s", vaca.getNome(), vaca.comerPlantas()));
    }
}
