/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_estruct_t3;

/**
 *
 * @author utirra
 */
public class No {
    
    private No esquerda;
    private No direita;
    private Objeto dado;
    private int frequencia;
    
    public No(No esquerda, No direita, Objeto dado, int frequencia)
    {
        this.esquerda = esquerda;
        this.direita = direita;
        this.dado = dado;
        this.frequencia = frequencia;
    }

    /**
     * @return the esquerda
     */
    public No getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public No getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(No direita) {
        this.direita = direita;
    }

    /**
     * @return the dado
     */
    public Objeto getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(Objeto dado) {
        this.dado = dado;
    }

    /**
     * @return the frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
      
}
