/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zaqueu.data_structure;

import com.zaqueu.data_structure.listas.Lista;
import com.zaqueu.data_structure.listas.ListaRecursiva;

/**
 *
 * @author zaqueu
 */
public class Data_structure {

    public static void main(String[] args) {
        Lista listaNormal = new Lista();
        ListaRecursiva listaRecursiva = new ListaRecursiva();
        
        listaNormal.add(1);
        listaNormal.add(34);
        listaNormal.add(52);
        listaNormal.add(78);
        listaNormal.add(43);
        
        listaRecursiva.add(45);
        listaRecursiva.add(12);
        listaRecursiva.add(24);
        listaRecursiva.add(23);
        listaRecursiva.add(56);
        
        listaNormal.show();
        
        listaRecursiva.show();
        
        listaRecursiva.search(12);
        listaRecursiva.search(13);
        
        
    }
}
