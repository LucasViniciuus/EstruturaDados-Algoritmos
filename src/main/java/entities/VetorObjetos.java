package entities;

public class VetorObjetos {
        private Object[] elementos;
        private int tamanho;

        public VetorObjetos(int capacidade) {
            this.elementos = new Object[capacidade];
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

        public boolean adiciona(Object elemento) {
            this.aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
            }
            return false;
        }

        //B C E F G     TOTAL = 10
        //0 1 2 3 4 = TAMANHO 5
        public void adiciona(int posicao, Object elemento) {
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
                Object[] elementosNovos = new Object[this.elementos.length * 2];
                for (int i = 0; i < this.elementos.length; i++) {
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
            }
        }

        public Object busca(int posicao) {
            if (!(posicao >= 0 && posicao < tamanho)) {
                throw new IllegalArgumentException("Posição ou index não encontrado");
            }
            return this.elementos[posicao];
        }

        public int busca(Object elemento) {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return -1;
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
            for(int i=posicao; i<this.tamanho-1; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
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
    }


