package labs;

import entities.Lista;

import java.util.ArrayList;

public class Exer05 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        System.out.println(lista);

        lista.clear();

        System.out.println(lista);

        //

        Lista<String> ls = new Lista<>(5);
        ls.adiciona("A");
        ls.adiciona("B");
        ls.adiciona("C");
        System.out.println(ls);
        ls.limpar();
        System.out.println(ls);


    }
}
