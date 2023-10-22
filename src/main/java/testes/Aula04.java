package testes;

import entities.Vetor;

public class Aula04 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.adiciona ("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}