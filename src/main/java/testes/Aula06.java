package testes;

import entities.Vetor;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");
        vetor.adiciona("elemento 6");
        vetor.adiciona("elemento 7");
        vetor.adiciona("elemento 8");
        vetor.adiciona("elemento 9");
        vetor.adiciona("elemento 10");
        System.out.println(vetor.busca("elemento 3"));
    }
}