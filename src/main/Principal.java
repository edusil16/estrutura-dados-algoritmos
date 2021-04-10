package main;

import model.ContatoGenericsTeste;
import model.ListaGenericsIMP;
import model.Vetor;
import model.VetorGenerics;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        int menuEscolhido;
        int metodoEscolhido;

        do{
           Menu menu = new Menu();
           menu.exibirMenu();

           System.out.println ("Escolha um tipo ->");
           menuEscolhido = ler.nextInt();

           switch (menuEscolhido){
               case 1:
                   ArrayList<String> listaMenus = menu.exibirSubMenuVetores();
                   System.out.println ("Escolha um método ->");
                   metodoEscolhido = ler.nextInt();
                   if(listaMenus.size() > 0){
                       switch(metodoEscolhido){
                           case 1: executarAdicionarElemento();
                           break;
                           case 2: executarAdicionarContabilizado();
                           break;
                           case 3: executarExibirTamanhoVetor();
                           break;
                           case 4: executarBuscarElementoDoVetor();
                           break;
                           case 5: executarVerificaElemento();
                           break;
                           case 6: adionarElementoEmPosicaoDoVetor();
                           break;
                           case 7: adionarElementoEmPosicaoAcimaDoTamanho();
                           break;
                           case 8: removerElementoPosicaoVetor();
                           break;
                           case 9: criarVetorGenerics();
                           break;
                           case 10: criandoVetorTipoDaClasse();
                           break;
                           default: System.out.println ("O Menu inserido não existe...");
                       }
                       System.out.println("Deseja retornar ao menu principal? 1-SIM 0-NÃO");
                       op = ler.nextInt();
                   }
                   break;
               default: System.out.println("Menu não existe");
           }
        } while (op != 0);

    }

    static Vetor executarAdicionarElemento(){
        Vetor vetor = new Vetor(5);
        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");
        System.out.println (vetor);
        return vetor;
    }

    // Revisar pois não está retornando o valor inteiro.
    static Vetor executarAdicionarContabilizado(){
        Vetor vetor = new Vetor(5);
        try {
            vetor.adicionarElementosContabilizados("elemento1");
            vetor.adicionarElementosContabilizados("elemento2");
            vetor.adicionarElementosContabilizados("elemento3");
            vetor.adicionarElementosContabilizados("elemento4");
            vetor.adicionarElementosContabilizados("elemento5");
            System.out.println("O número de elementos no vetor é: " + vetor);
        } catch (Exception e){
            e.printStackTrace();
        }
        return vetor;
    }

    static Vetor executarExibirTamanhoVetor(){
        Vetor vetor = new Vetor(10);
        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");
        System.out.println ("Elementos do Vetor: " + vetor.exibirElementosDentroVetor());
        System.out.println ("Tamanho total do Vetor: " + vetor.calcularTamanhoTotalVetor());
        System.out.println (vetor);
        return vetor;
    }

    static Vetor executarBuscarElementoDoVetor(){
        Vetor vetor = new Vetor(10);
        int opcaoEscolhida;

        System.out.println ("Digite a posição do model para saber seu valor em memória -> ");
        opcaoEscolhida = ler.nextInt();

        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");

        System.out.println (vetor.buscarDeterminadaPosicaoDoVetor(opcaoEscolhida));

        return vetor;
    }

    static Vetor executarVerificaElemento(){
        Vetor vetor = new Vetor(5);
        String busca;

        System.out.println ("Digite 1 nome de Elemento de 0 a 10 para buscar seu valor no vetor -> ");
        busca = ler.next();

        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");

        System.out.println ("A posição da busca do elemento no vetor é: " + vetor.buscarPosicaoElementoNoVetor(busca));

        return vetor;
    }

    static Vetor adionarElementoEmPosicaoDoVetor(){
        Vetor vetor = new Vetor(10);
        int posicao;
        String valor;

        System.out.println ("Digite posição de Elemento de 0 a 10 para inserir seu valor no vetor -> ");
        posicao = ler.nextInt();

        System.out.println ("Digite valor do elemento");
        valor = ler.next();

        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");

        System.out.println ("O Vetor original:"  + vetor);

        vetor.adicionarElementoEmQualquerPosicaoDoVetor(posicao,valor);

        System.out.println ("O " + valor + " foi inserido -> Vetor motificado:"  + vetor);

        return vetor;
    }

    static Vetor adionarElementoEmPosicaoAcimaDoTamanho(){
        Vetor vetor = new Vetor(3);
        int posicao;
        String valor;

        System.out.println ("Digite posição de Elemento de 0 a 10 para inserir seu valor no vetor -> ");
        posicao = ler.nextInt();

        System.out.println ("Digite valor do elemento");
        valor = ler.next();

        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");

        System.out.println ("O Vetor original:"  + vetor);

        vetor.adicionarElementoEmQualquerPosicaoDoVetor(posicao,valor);

        System.out.println ("O " + valor + " foi inserido -> Vetor motificado:"  + vetor);

        return vetor;
    }

    static Vetor removerElementoPosicaoVetor(){
        Vetor vetor = new Vetor(5);
        int posicao;

        System.out.println ("Digite posição de Elemento de 0 a 10 para remover seu valor no vetor -> ");
        posicao = ler.nextInt();

        vetor.adicionarElemento("elemento1");
        vetor.adicionarElemento("elemento2");
        vetor.adicionarElemento("elemento3");
        vetor.adicionarElemento("elemento4");
        vetor.adicionarElemento("elemento5");

        System.out.println ("O Vetor original:"  + vetor);

        vetor.removerValorPosicaoVetor(posicao);

        System.out.println ("O vetor depois de removido:"  + vetor);

        return vetor;
    }

    static VetorGenerics criarVetorGenerics(){
        VetorGenerics vetor = new VetorGenerics(5);

        ContatoGenericsTeste contato = new ContatoGenericsTeste("eduardo", "edu@email.com", "12354563");
        ContatoGenericsTeste contato2 = new ContatoGenericsTeste("julia", "julia@email.com", "1432563");
        ContatoGenericsTeste contato3 = new ContatoGenericsTeste("eduardo", "julia@email.com", "12434363");


        vetor.adicionarElemento(contato);
        vetor.adicionarElemento (contato2);
        vetor.adicionarElemento (contato3);

        vetor.calcularTamanhoTotalVetor();

        System.out.println ("Tamanho = " + vetor.calcularTamanhoTotalVetor());
        System.out.println (vetor);


        return vetor;
    }

    static ListaGenericsIMP<ContatoGenericsTeste> criandoVetorTipoDaClasse(){
        ListaGenericsIMP<ContatoGenericsTeste> lista = new ListaGenericsIMP<ContatoGenericsTeste>(5);

        ContatoGenericsTeste contato = new ContatoGenericsTeste("eduardo", "edu@email.com", "12354563");
        ContatoGenericsTeste contato2 = new ContatoGenericsTeste("julia", "julia@email.com", "1432563");
        ContatoGenericsTeste contato3 = new ContatoGenericsTeste("eduardo", "julia@email.com", "12434363");


        lista.adicionarElemento(contato);
        lista.adicionarElemento (contato2);
        lista.adicionarElemento (contato3);

        lista.calcularTamanhoTotalVetor();

        System.out.println ("Tamanho = " + lista.calcularTamanhoTotalVetor());
        System.out.println (lista);


        return lista;
    }

}
