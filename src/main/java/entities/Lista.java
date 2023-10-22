package entities;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0; //solucacao do livro effective java.
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }
    //    public void adicionaElemento(String elemento){
//        for (int i=0; i<this.elementos.length; i++){
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
//        }
//
//    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        return false;
    }

    //B C E F G     TOTAL = 10
    //0 1 2 3 4 = TAMANHO 5
    public void adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição ou index não encontrado");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        //mover todos os elementos
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição ou index não encontrado");
        }
        return this.elementos[posicao];
    }
    public T obtem(int posicao){
        return this.busca(posicao);
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    public int ultimoIndice(T elemento){

        int ultimaPos = -1;
        for(int i=this.tamanho-1; i>-1; i--){
            if(this.elementos[i].equals(elemento)) {
                ultimaPos = i;
                break;
            }
        }
        return ultimaPos;
    }

    // B G D E F -> Posição a ser removida = 1 = 'G';
    // O 1 2 3 4 -> Tamanho do vetor == 5;
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição ou index não encontrado");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
    public void remove(T elemento){
        int pos = this.busca(elemento);
        //ou seja, o indice existe.
        if(pos > -1){
            this.remove(pos);
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }
        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }
        sb.append("]");
        return sb.toString();

    }

    public boolean contem(T elemento) {
//        int pos = busca(elemento);
//        if(pos > -1){
//            return true;
//        }
//        return false;
        return busca(elemento) > -1; //>=0
    }

    public void limpar(){
        this.elementos = (T[]) new Object[this.elementos.length];
    }
}

