package labs;

import entities.Lista;

public class Exer04 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(1));
        System.out.println(lista.obtem(2));
    }
}