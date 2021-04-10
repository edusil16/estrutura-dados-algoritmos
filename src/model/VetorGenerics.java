package model;

public class VetorGenerics {

    private Object[] elementos;
    private int tamanho; // Atributo da classe para dizer o tamanho do model.

    // Construtor com a capacidade do Array
    public VetorGenerics(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adicionarElemento(Object elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            aumentarCapiciadade ( );
            //Verifica se é nulo para atribuir um valor de elemento ao model elementos.
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                tamanho++;
                break; // Usado para frear quando o indice achar a primeira posição nula.
            }
        }
    }

    public int buscarPosicaoElementoNoVetor(Object elemento) {
        //Algoritmo de busca sequencial.
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals ( elemento )) {
                return i;
            }
        }
        return -1;
    }

    // Métodos privados da Classe
    private void aumentarCapiciadade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Obter elemento de determinada posição
    public Object buscarDeterminadaPosicaoDoVetor(int posicao) {
        // Verificar se a posição do argumento é valida dentro do tamanho do Vetor.
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException ( "Posição inválida." );
        }
        return this.elementos[posicao];
    }

    public Object calcularTamanhoTotalVetor(){
        Integer tamanho = 0;
        for (int i = 0; i < this.elementos.length; i++)
        {
            tamanho ++;
        }
        return tamanho.toString();
    }

    public String toString() {
        // Tratamento para retirar os espaços null na exibição do Array;
        StringBuilder arrayFormatado = new StringBuilder ( );
        arrayFormatado.append ( "[" );

        for (int i = 0; i < this.tamanho - 1; i++) {
            arrayFormatado.append ( this.elementos[i] );
            arrayFormatado.append ( ", " );
        }
        if (this.tamanho > 0) {
            arrayFormatado.append ( this.elementos[this.tamanho - 1] );
        }
        arrayFormatado.append ( "]" );

        return arrayFormatado.toString ( );
    }

}
