package labs;

import entities.Lista;
import testes.Contato;

import java.util.List;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        //criação de variáveis
        Scanner sc = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

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
    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println("Vetor completo:" + lista);

    }
    private static void excluirVetor(Lista<Contato> lista){

        lista.limpar();
        System.out.println("Exclusão realizada.");
        System.out.println(lista);

    }
    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de:" + lista.tamanho());
    }
    private static void excluirContato(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser removida", sc);
        try{
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído.");
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser removida", sc);
        try{
          lista.remove(pos);
          System.out.println("Contato excluído.");
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void pesquisarSeContatoExiste(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);
            if(existe) {
                System.out.println("Contato existe, seguem dados:");
            } else {
                System.out.println("Contato não existe, seguem dados:");
            }
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");

            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado na posição" + pos);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void obtemContato(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado, seguem dados:");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição" + pos);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", sc);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posição inválida.");

        }
    }
    private static void adicionarContatoFinal(Scanner sc, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }

    private static void adicionarContatoEmPosicaoEspecifica(Scanner sc, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações");

        String nome = leInformacao("Entre com o nome", sc);
        String telefone = leInformacao("Entre com o telefone", sc);
        String email = leInformacao("Entre com o email", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", sc);

        try{
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(lista);
        }   catch (Exception e) {
          System.out.println("Posição inválida, contato não adicionado");
        }
    }
     static String leInformacao(String msg, Scanner scan){

        System.out.println(msg);
        String entrada = scan.next();

        return entrada;
    }
     static int leInformacaoInt(String msg, Scanner scan){

        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida){
            try{
                System.out.println(msg);
                String entrada = scan.next();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;
    }

     static int obterOpcaoUsuario(Scanner sc){
        int opcaoEscolhida = 0;
        String option;
        boolean entradaValida = false;

        while(!entradaValida){
            System.out.println("Digite a opção desejada");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Consulta contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                option = sc.next();
                opcaoEscolhida = Integer.parseInt(option);

                if(opcaoEscolhida >=0 && opcaoEscolhida<=11){
                    entradaValida = true;
                }else{
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("Entrada incorreta, digite o número baseado na legenda. De 0 até 11");

            }
        }
        return opcaoEscolhida;
    }
     static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        Contato contato;
        for(int i=1; i<=quantidade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato " + i+"@email.com");

            lista.adiciona(contato);
        }



    }
}