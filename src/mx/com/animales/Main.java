package mx.com.animales;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = {
                new Perro("Machito", 3),
                new Gato("Mew", 2),
                new Vaca("Inna", 5),
                new Caballo("Bobollo", 10),
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible movible = (Movible) animal;
            movible.moverse();
        }
    }
}
