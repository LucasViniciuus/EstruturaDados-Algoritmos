package testes;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args){
        //Instancia o ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Adiciona elemento ao array
        arrayList.add("A");
        System.out.println(arrayList);
        //Adiciona elemento pelo indice
        arrayList.add(0, "B");
        System.out.println(arrayList);

        //verifica se contém no array criando um boolean que retorna true ou false e assim, caso seja true e atenda a condição ele realiza a ação, caso não, realiza o else.
        boolean contemNoArray = arrayList.contains("A");
        if(contemNoArray == true){
            System.out.println("Elemento encontrado array.");
        }else{
            System.out.println("Elemento não encontrado no array.");
        }
        //index.Of retorna o índice onde o objeto passado se encontra.
        int pos = arrayList.indexOf("A");
        if(pos > -1){
            System.out.println("Elemento encontrado array.");
        }else{
            System.out.println("Elemento não encontrado no array.");
        }

        //busca por posição do index
        System.out.println(arrayList.get(0));

        //forma para remover objeto do array
        arrayList.remove("A");
        arrayList.remove(0);
        System.out.println(arrayList);

        //tamanho
        System.out.println(arrayList.size());
    }
}
