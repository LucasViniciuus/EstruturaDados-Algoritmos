package labs;

import entities.Lista;

import java.util.ArrayList;

public class Exer02 {

    public static void main(String args[]){

        ArrayList<String> al = new ArrayList<>();
        al.add("João");
        al.add("Carlos");
        al.add("João");

    //retorna a última posição/indice onde o objeto apareceu na lista.
        System.out.println(al.lastIndexOf("João"));

        Lista<String> ls2 = new Lista<>(3);
        ls2.adiciona("João");
        ls2.adiciona("Carlos");
        ls2.adiciona("João");
        System.out.println(ls2);
        System.out.println(ls2.ultimoIndice("João"));

    }
}
