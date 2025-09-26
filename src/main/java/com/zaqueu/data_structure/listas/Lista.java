/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.data_structure.listas;

/**
 *
 * @author zaqueu
 */
public class Lista {
  Node inicio; 
  Node fim;
  int size;
  public Lista() {
    inicio = null;
    fim = null;
    size = 0;
  }


  public void add(int val) {
    Node novo = new Node(val);
    if (inicio == null) {
      inicio = novo;
      fim = novo;
    } else {
      fim.next = novo;
      novo.prev = fim;
      fim = novo;
    }
    size++;
  }

  public void remove(int val){
    Node item = inicio;
    while(item != null){
      if(item.info == val){
        if(item.prev != null){
          item.prev.next = item.next;
          item.next.prev = item.prev;
          item = item.next;
        }else{
          inicio = item.next;
          item = item.next;
        }

        size--;
      }else{
        item = item.next;
      }
    }
  }

  public void show(){
    Node item = inicio;
    while(item != null){
      System.out.print(item.info + " ");
      item = item.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {
      Lista list = new Lista();
      list.add(42);
      list.add(53);
      list.add(74);
      list.add(65);
      list.add(12);
      list.add(3);

      

      list.show();
      System.out.println("tamanho da lista: " + list.size);
      list.remove(65);
      System.out.println("remove 65");
      System.out.println("tamanho da lista: " + list.size);
      list.show();
      System.out.println("remove 42");
      list.remove(42);
      list.show();
      System.out.println("tamanho da lista: " + list.size);
  }
    
}
