package labs;

import entities.Lista;

public class Exer03 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);

        //remove pelo elemento.
        lista.remove("A");
        System.out.println(lista);

        lista.remove("B");
        System.out.println(lista);

        lista.remove("C");
        System.out.println(lista);

    }
}
