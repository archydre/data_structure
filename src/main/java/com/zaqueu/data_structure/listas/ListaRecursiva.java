/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.data_structure.listas;

/**
 *
 * @author zaqueu
 */
public class ListaRecursiva<T> extends Lista<T>{
    
    @Override
    public void show() {
        showRecursivo(inicio); // Começa a partir do início da lista
        System.out.println(); // Pula uma linha no final
    }
    
    private void showRecursivo(Node<T> atual){
        if(atual == null){
            return;
        }else{
            System.out.print(atual.info + " ");
            showRecursivo(atual.next);
        }
    }
    
    public void search(T val){
        int found = searchRecursivo(inicio ,val);
        
        if(found == 1){
            System.out.println("elemento existe na lista");
        }else{
            System.out.println("elemento NAO existe na lista");
        }
    }
    
    private int searchRecursivo(Node<T> atual, T value){
        if(atual != null){
            if(value.equals(atual.info)){
                return 1;
            }else{
                return searchRecursivo(atual.next, value);
            }
        }else{
            return 0;
        }
    }
}
