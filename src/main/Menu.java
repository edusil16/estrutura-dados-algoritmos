package main;

import java.util.ArrayList;

public class Menu {

    ArrayList<String> nomeMenu = new ArrayList<String>();
    ArrayList<String> nomeSubMenuVetores = new ArrayList<String>();

    public ArrayList<String> exibirMenu() {
        System.out.println ("---------ESTRUTURA DE DADOS---------");
        ArrayList<String> menus = adicionarMenu ();
        for (int i = 0; i < menus.size(); i++){
            System.out.println(nomeMenu.get(i));
        }
        return menus;
    }

    public ArrayList<String> exibirSubMenuVetores() {
        System.out.println ("---------VETORES---------");
        ArrayList<String> subMenus = adcionarSubMenuVetores();
        for (int i = 0; i < subMenus.size(); i++){
            System.out.println(nomeSubMenuVetores.get(i));
        }
        return subMenus;
    }

    public ArrayList<String> adicionarMenu(){
        nomeMenu.add("1 - Vetores");
        nomeMenu.add("2 - Pilhas");
        nomeMenu.add("3 - Filas");
        return nomeMenu;
    }

    public ArrayList<String> adcionarSubMenuVetores(){
        nomeSubMenuVetores.add ("1 - Adicionar Elemento");
        nomeSubMenuVetores.add ("2 - Adicionar Elemento Contabilizado");
        nomeSubMenuVetores.add ("3 - Exibir Tamanho Vetor");
        nomeSubMenuVetores.add ("4 - Buscar Elemento Do Vetor");
        nomeSubMenuVetores.add ("5 - Buscar Posição de Elemento no Vetor");
        nomeSubMenuVetores.add ("6 - Adicionar Elemento na Posição do Vetor");
        nomeSubMenuVetores.add ("7 - Adicionar Elemento Além da Posição Total do Vetor");
        nomeSubMenuVetores.add ("8 - Remover do Vetor");
        nomeSubMenuVetores.add ("9 - Criando um vetor GENERICS(Object)");
        nomeSubMenuVetores.add ("10 - Criando um vetor GENERICS(T Class)");
        return nomeSubMenuVetores;
    }

}
