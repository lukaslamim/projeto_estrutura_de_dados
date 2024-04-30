/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_estruct_t3;

/**
 *
 * @author utirra
 */
public class Objeto_Tabela {
    
    private char letra;
    private String codigo;
    private int frequencia;
    
    public Objeto_Tabela(char letra, String codigo, int frequencia)
    {
        this.letra = letra;
        this.codigo = codigo;
        this.frequencia = frequencia;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }
}
