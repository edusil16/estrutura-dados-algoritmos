package model;

public class Vetor {

    private String[] elementos;
    private int tamanho; // Atributo da classe para dizer o tamanho do model.

    // Construtor com a capacidade do Array
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionarElemento(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            aumentarCapiciadade();
            //Verifica se é nulo para atribuir um valor de elemento ao model elementos.
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                tamanho++;
                break; // Usado para frear quando o indice achar a primeira posição nula.
            }
        }
    }

    public int adicionarElementosContabilizados(String elemento) throws Exception {
        // Neste caso pode haver erro de exceção por ultrapassar o tamanho do model.
        // Para tratar verificar sempre se o tamanho é menor que a quantidade de elementos.
        int total;
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            total = this.tamanho++;
        } else {
            throw  new Exception ("Vetor já está cheio");
        }
        return total;
    }

    public String calcularTamanhoTotalVetor(){
        Integer tamanho = 0;
        for (int i = 0; i < this.elementos.length; i++)
        {
            tamanho ++;
        }
        return tamanho.toString();
    }

    public int exibirElementosDentroVetor(){
        return this.tamanho;
    }

    //Obter elemento de determinada posição
    public String buscarDeterminadaPosicaoDoVetor(int posicao){
        // Verificar se a posição do argumento é valida dentro do tamanho do Vetor.
        if (!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException ("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    public String toString(){
        // Tratamento para retirar os espaços null na exibição do Array;
        StringBuilder arrayFormatado = new StringBuilder();
        arrayFormatado.append ("[");

        for (int i = 0; i < this.tamanho-1; i++){
            arrayFormatado.append (this.elementos[i]);
            arrayFormatado.append (", ");
        }
        if (this.tamanho>0){
            arrayFormatado.append(this.elementos[this.tamanho-1]);
        }
        arrayFormatado.append ("]");

        return arrayFormatado.toString ();
    }

    // Busca sequencial para verificar se um determinado elemento existe no vetor.
    public int buscarPosicaoElementoNoVetor(String elemento){
        //Algoritmo de busca sequencial.
        for(int i = 0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public String adicionarElementoEmQualquerPosicaoDoVetor(int posicao,String elemento){

        this.aumentarCapiciadade();

        if (!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException ("Posição inválida.");
        }

        // movendo os elementos para atribuir a posição
        for (int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return elementos.toString();
    }


    //Removendo um valor é retornando o valor da frente para o lugar dele no vetor, evita deixar lixo no espaço de memória
    public void removerValorPosicaoVetor(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException ("Posição inválida.");
        }
        for(int i=posicao; i<this.tamanho-1; i++){
           this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    // Métodos privados da Classe
    private void aumentarCapiciadade(){
        if(this.tamanho== this.elementos.length){
           String[] elementosNovos = new String[this.elementos.length * 2];
           for (int i = 0; i<this.elementos.length; i++){
               elementosNovos[i] = this.elementos[i];
           }
           this.elementos = elementosNovos;
        }
    }
}
