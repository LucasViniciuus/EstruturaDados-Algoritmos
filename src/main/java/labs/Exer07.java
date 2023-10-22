package labs;

import testes.Contato;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06 {

    public static void main(String[] args) {

        //criação de variáveis
        Scanner sc = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        //criar um menu para o usuário tenha a escolha do método a ser realizado.
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoUsuario(sc);
            if (opcao == 1) {
                adicionarContatoFinal(sc, lista);
            } else if (opcao == 2) {
                adicionarContatoEmPosicaoEspecifica(sc, lista);
            } else if (opcao == 3) {
                obtemContatoPosicao(sc, lista);
            } else if (opcao == 4) {
                obtemContato(sc, lista);
            } else if (opcao == 5) {
                pesquisarUltimoIndice(sc, lista);
            } else if (opcao == 6) {
                pesquisarSeContatoExiste(sc, lista);
            } else if (opcao == 7) {
                excluirPorPosicao(sc, lista);
            } else if (opcao == 8) {
                excluirContato(sc, lista);
            } else if (opcao == 9) {
                imprimeTamanhoVetor(lista);
            } else if (opcao == 10) {
                excluirVetor(lista);
            } else if (opcao == 11) {
                imprimirVetor(lista);
            }
        }
        System.out.println("Usuário digitou 0, programa terminado.");
    }
    private static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println("Vetor completo:" + lista);

    }
    private static void excluirVetor(ArrayList<Contato> lista){

        lista.clear();
        System.out.println("Exclusão realizada.");
        System.out.println(lista);

    }
    private static void imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de:" + lista.size());
    }
    private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser removida", sc);
        try{
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído.");
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser removida", sc);
        try{
            lista.remove(pos);
            System.out.println("Contato excluído.");
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void pesquisarSeContatoExiste(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);
            if(existe) {
                System.out.println("Contato existe, seguem dados:");
            } else {
                System.out.println("Contato não existe, seguem dados:");
            }
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");

            pos = lista.lastIndexOf(contato);
            System.out.println("Contato encontrado na posição" + pos);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado, seguem dados:");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição" + pos);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }

    private static void adicionarContatoEmPosicaoEspecifica(Scanner sc, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações");

        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", sc);

        try{
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(lista);
        }   catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }
    }
    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista){
        Contato contato;
        for(int i=1; i<=quantidade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato " + i+"@email.com");

            lista.add(contato);
        }



    }
}