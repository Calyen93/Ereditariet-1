/*
-Scrivere un programmache contenga una classe chiamata
Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.

-Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto.*/

public class Main {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal();

        genericAnimal.makeSound();

        Cat cat = new Cat();

        cat.makeSound();
    }
}
