package com.mycompany.data_estruct_t3;

import java.util.ArrayList;
import java.util.List;

public class Data_Estruct_T3 {

    private Arvore arvoreCod = new Arvore();
    private Arvore arvoreDecod = new Arvore();

    private List<Objeto_Tabela> tabelaBinaria = new ArrayList<>();

    private int frequenciaMaior = 0;

//    public void PrintConsole(No NO) {
//
//        List<List<String>> lines = new ArrayList<List<String>>();
//
//        List<No> level = new ArrayList<No>();
//        List<No> next = new ArrayList<No>();
//
//        level.add(NO);
//        int nn = 1;
//
//        int widest = 0;
//
//        while (nn != 0) {
//            List<String> line = new ArrayList<String>();
//
//            nn = 0;
//
//            for (No n : level) {
//                if (n == null) {
//                    line.add(null);
//
//                    next.add(null);
//                    next.add(null);
//                } else {
//                    String aa = "" + n.getFrequencia();
//                    line.add(aa);
//                    if (aa.length() > widest) {
//                        widest = aa.length();
//                    }
//
//                    next.add(n.getEsquerda());
//                    next.add(n.getDireita());
//
//                    if (n.getEsquerda() != null) {
//                        nn++;
//                    }
//                    if (n.getDireita() != null) {
//                        nn++;
//                    }
//                }
//            }
//
//            if (widest % 2 == 1) {
//                widest++;
//            }
//
//            lines.add(line);
//
//            List<No> tmp = level;
//            level = next;
//            next = tmp;
//            next.clear();
//        }
//
//        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
//        for (int i = 0; i < lines.size(); i++) {
//            List<String> line = lines.get(i);
//            int hpw = (int) Math.floor(perpiece / 2f) - 1;
//
//            if (i > 0) {
//                for (int j = 0; j < line.size(); j++) {
//
//                    // split node
//                    char c = ' ';
//                    if (j % 2 == 1) {
//                        if (line.get(j - 1) != null) {
//                            c = (line.get(j) != null) ? '┴' : '┘';
//                        } else {
//                            if (j < line.size() && line.get(j) != null) {
//                                c = '└';
//                            }
//                        }
//                    }
//                    System.out.print(c);
//
//                    // lines and spaces
//                    if (line.get(j) == null) {
//                        for (int k = 0; k < perpiece - 1; k++) {
//                            System.out.print(" ");
//                        }
//                    } else {
//
//                        for (int k = 0; k < hpw; k++) {
//                            System.out.print(j % 2 == 0 ? " " : "─");
//                        }
//                        System.out.print(j % 2 == 0 ? "┌" : "┐");
//                        for (int k = 0; k < hpw; k++) {
//                            System.out.print(j % 2 == 0 ? "─" : " ");
//                        }
//                    }
//                }
//                System.out.println();
//            }
//
//            // print line of numbers
//            for (int j = 0; j < line.size(); j++) {
//
//                String f = line.get(j);
//                if (f == null) {
//                    f = "";
//                }
//                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
//                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);
//
//                // a number
//                for (int k = 0; k < gap1; k++) {
//                    System.out.print(" ");
//                }
//                System.out.print(f);
//                for (int k = 0; k < gap2; k++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//            perpiece /= 2;
//        }
//    }

    public List<Objeto_Tabela> ordenarTabela(List<Objeto_Tabela> lista) {

        int maiorASCII = 0;
        List<Objeto_Tabela> listatemp = new ArrayList<>();
        List<Objeto_Tabela> listatemp2 = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getFrequencia() > frequenciaMaior) {
                frequenciaMaior = lista.get(i).getFrequencia();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            int temp = lista.get(i).getLetra();
            if (temp > maiorASCII) {
                maiorASCII = lista.get(i).getLetra();
            }
        }

        for (int i = 0; i <= maiorASCII; i++) {
            for (int k = 0; k < lista.size(); k++) {
                int temp = lista.get(k).getLetra();
                if (temp == i) {
                    listatemp.add(lista.get(k));
                }
            }
        }

        for (int i = 1; i <= frequenciaMaior; i++) {
            for (int k = 0; k < listatemp.size(); k++) {
                if (listatemp.get(k).getFrequencia() == i) {
                    listatemp2.add(listatemp.get(k));
                }
            }
        }

        //debug
//        for (int i = 0; i < listatemp2.size(); i++) {
//            System.out.println("frequencia " + listatemp2.get(i).getFrequencia());
//        }
//        System.out.println("separador");
        return listatemp2;
    }

    public List<No> ordenarLista(List<No> lista) {

        int maiorASCII = 0;
        List<No> listatemp = new ArrayList<>();
        List<No> listatemp2 = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getFrequencia() > frequenciaMaior) {
                frequenciaMaior = lista.get(i).getFrequencia();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            int temp = lista.get(i).getDado().getLetra();
            if (temp > maiorASCII) {
                maiorASCII = lista.get(i).getDado().getLetra();
            }
        }

        for (int i = 0; i <= maiorASCII; i++) {
            for (int k = 0; k < lista.size(); k++) {
                int temp = lista.get(k).getDado().getLetra();
                if (temp == i) {
                    listatemp.add(lista.get(k));
                }
            }
        }

        for (int i = 1; i <= frequenciaMaior; i++) {
            for (int k = 0; k < listatemp.size(); k++) {
                if (listatemp.get(k).getFrequencia() == i) {
                    listatemp2.add(listatemp.get(k));
                }
            }
        }

        //debug
//        for (int i = 0; i < listatemp2.size(); i++) {
//            System.out.println("frequencia " + listatemp2.get(i).getFrequencia());
//        }
//        System.out.println("separador");
        return listatemp2;
    }

    public void gerarArvoreCOD(List<No> lista) {

        if (lista.size() == 1) {
            getArvoreCod().setRaiz(lista.get(0));
        } else {
            int frequencia = lista.get(0).getFrequencia() + lista.get(1).getFrequencia();

            No NO = new No(lista.get(0), lista.get(1), null, frequencia);

            lista.remove(0);

            lista.remove(0);

            int index = 0;
            for (int i = 0; i < lista.size(); i++) {
                for (int k = frequencia + 1; k <= frequenciaMaior; k++) {
                    if (k == lista.get(i).getFrequencia()) {
                        index = i;
                        i = lista.size();
                        break;
                    }
                }
            }
            if (index > 0 && frequenciaMaior > frequencia) {
                lista.add(index, NO);
            } else {
                lista.add(NO);
            }
            //debug
//            System.out.println("esquerda = " + NO.getEsquerda().getFrequencia());
//            if(NO.getEsquerda().getDado() != null)
//            {
//            System.out.println("letra = " + NO.getEsquerda().getDado().getLetra());
//            }
//            System.out.println("atual = " + NO.getFrequencia());
//            System.out.println("direita = " + NO.getDireita().getFrequencia());
//            if(NO.getDireita().getDado() != null)
//            {
//            System.out.println("letra = " + NO.getDireita().getDado().getLetra());
//            }
            gerarArvoreCOD(lista);
        }
    }

    public void gerarArvoreDECOD(List<No> lista) {

        if (lista.size() == 1) {
            getArvoreDecod().setRaiz(lista.get(0));
        } else {
            int frequencia = lista.get(0).getFrequencia() + lista.get(1).getFrequencia();

            No NO = new No(lista.get(0), lista.get(1), null, frequencia);

            lista.remove(0);

            lista.remove(0);

            int index = 0;
            for (int i = 0; i < lista.size(); i++) {
                for (int k = frequencia + 1; k <= frequenciaMaior; k++) {
                    if (k == lista.get(i).getFrequencia()) {
                        index = i;
                        i = lista.size();
                        break;
                    }
                }
            }
            if (index > 0 && frequenciaMaior > frequencia) {
                lista.add(index, NO);

            } else {
                lista.add(NO);
            }
            //debug
//            System.out.println("esquerda = " + NO.getEsquerda().getFrequencia());
//            if(NO.getEsquerda().getDado() != null)
//            {
//            System.out.println("letra = " + NO.getEsquerda().getDado().getLetra());
//            }
//            System.out.println("atual = " + NO.getFrequencia());
//            System.out.println("direita = " + NO.getDireita().getFrequencia());
//            if(NO.getDireita().getDado() != null)
//            {
//            System.out.println("letra = " + NO.getDireita().getDado().getLetra());
//            }
            gerarArvoreDECOD(lista);
        }
    }

    public void construirTabela(No NO, String binario) {

        if (NO.getDado() != null) {

            Objeto_Tabela objeto = new Objeto_Tabela(NO.getDado().getLetra(), binario, NO.getFrequencia());
            getTabelaBinaria().add(objeto);
        }

        if (NO.getEsquerda() != null) {
            binario += "0";
            construirTabela(NO.getEsquerda(), binario);
        }

        String temp = "";
        for (int i = 0; i < binario.length() - 1; i++) {
            temp += binario.charAt(i);
        }
        binario = temp;

        if (NO.getDireita() != null) {
            binario += "1";
            construirTabela(NO.getDireita(), binario);
        }
    }

    public String construirBinario(List<Objeto_Tabela> tabela, String texto) {
        String textoBinario = "";

        for (int i = 0; i < texto.length(); i++) {
            for (int k = 0; k < tabela.size(); k++) {
                if (tabela.get(k).getLetra() == texto.charAt(i)) {
                    textoBinario += tabela.get(k).getCodigo();
                }
            }
        }

        return textoBinario;
    }

    public String construirTexto(No NO, String textoBinario) {

        String texto = "";

        for (int i = 0; i < textoBinario.length(); i++) {
            if (textoBinario.charAt(i) == '0') {
                if (NO.getEsquerda().getDado() != null) {
                    texto += NO.getEsquerda().getDado().getLetra();
                    NO = getArvoreDecod().getRaiz();
                } else {
                    NO = NO.getEsquerda();
                }
            } else if (textoBinario.charAt(i) == '1'){
                if (NO.getDireita().getDado() != null) {
                    texto += NO.getDireita().getDado().getLetra();
                    NO = getArvoreDecod().getRaiz();
                } else {
                    NO = NO.getDireita();
                }
            }
        }
        return texto;
    }

    public void codificar(String texto) {

        List<No> lista = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {

            boolean existe = false;

            for (int k = 0; k < lista.size(); k++) {
                if (lista.get(k).getDado().getLetra() == texto.charAt(i)) {
                    lista.get(k).setFrequencia(lista.get(k).getFrequencia() + 1);
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                Objeto objeto = new Objeto(texto.charAt(i));
                No NO = new No(null, null, objeto, 1);
                lista.add(NO);
            }
        }
        gerarArvoreCOD(ordenarLista(lista));
        construirTabela(getArvoreCod().getRaiz(), "");
        tabelaBinaria = ordenarTabela(tabelaBinaria);
    }

    public String decodificar(String texto) {

        List<No> lista = new ArrayList<>();

        for (int i = 0; i < tabelaBinaria.size(); i++) {
            Objeto objeto = new Objeto(tabelaBinaria.get(i).getLetra());
            No NO = new No(null, null, objeto, tabelaBinaria.get(i).getFrequencia());
            lista.add(NO);
        }
        gerarArvoreDECOD(ordenarLista(lista));
        String textoDecodificado = construirTexto(getArvoreDecod().getRaiz(), texto);
        lista.clear();

        for (int i = 0; i < textoDecodificado.length(); i++) {

            boolean existe = false;

            for (int k = 0; k < lista.size(); k++) {
                if (lista.get(k).getDado().getLetra() == textoDecodificado.charAt(i)) {
                    lista.get(k).setFrequencia(lista.get(k).getFrequencia() + 1);
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                Objeto objeto = new Objeto(textoDecodificado.charAt(i));
                No NO = new No(null, null, objeto, 1);
                lista.add(NO);
            }
        }
        
        gerarArvoreDECOD(ordenarLista(lista));
        return textoDecodificado;
    }

    /**
     * @return the tabelaBinaria
     */
    public List<Objeto_Tabela> getTabelaBinaria() {
        return tabelaBinaria;
    }

    /**
     * @return the arvoreCod
     */
    public Arvore getArvoreCod() {
        return arvoreCod;
    }

    /**
     * @return the arvoreDecod
     */
    public Arvore getArvoreDecod() {
        return arvoreDecod;
    }

}
