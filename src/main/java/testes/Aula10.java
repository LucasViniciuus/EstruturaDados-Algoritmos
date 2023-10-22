package testes;

import entities.VetorObjetos;

import java.util.ArrayList;
import java.util.List;

public class Aula10 {

    public static void main(String[] args){
    VetorObjetos vetor = new VetorObjetos(10);

    Contato c1 = new Contato("Contato1", "99963-9199", "contato1@gmail");
    Contato c2 = new Contato("Contato2", "99963-9198", "contato2@gmail");
    Contato c3 = new Contato("Contato3", "99963-9197", "contato3@gmail");

    System.out.println("Tamanho = " + vetor.tamanho());

    vetor.adiciona(c1);
    vetor.adiciona(c2);
    vetor.adiciona(c3);

    System.out.println(vetor);

    int pos = vetor.busca(c1);
    if(pos >= 0){
        System.out.println("O elemento existe no vetor" + "\n Descrito por: " + c1.toString());
    }else{
        System.out.println("O elemento não existe no vetor");
    }


}
}