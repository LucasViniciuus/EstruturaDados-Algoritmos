package testes;

import entities.Vetor;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(4);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 4");
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(vetor);
    }
}
