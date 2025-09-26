/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.data_structure.listas;

/**
 *
 * @author zaqueu
 */
public class ListaRecursiva extends Lista{
    
    @Override
    public void show() {
        showRecursivo(inicio); // Começa a partir do início da lista
        System.out.println(); // Pula uma linha no final
    }
    
    public void showRecursivo(Node atual){
        if(atual == null){
            return;
        }else{
            System.out.print(atual.info + " ");
            showRecursivo(atual.next);
        }
    }
}
