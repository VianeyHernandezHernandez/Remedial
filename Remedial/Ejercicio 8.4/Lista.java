/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_4;

import static java.lang.Math.pow;

/**
 *
 * @author Vianey
 */
class Lista {
 Nodo inicio;
    Nodo fin;
 
    public Lista() {
        inicio=null;
        fin=null;
    }
     public void insertarInicio(Punto dato){
        Nodo nuevo=new Nodo(dato, inicio);
        inicio=nuevo;
        if(fin==null)
            fin=inicio;
    }
      public void insertarFinal(Punto dato){
        Nodo nuevo=new Nodo(dato,null);
        if(inicio==null){
            inicio=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
      public Nodo Distancia(){
          Punto origen=new Punto(0,0);
          Nodo aux=inicio;
          Nodo mayorDistancia=inicio;
          double mayor=0;
          double distancia=0;
          while(aux!=null){
              distancia=calculoDistancia(origen, aux.getDato());
              if(distancia>mayor){
                  mayor=distancia;
                  mayorDistancia=aux;
              }
              aux=aux.getSiguiente();
          }
          return mayorDistancia;
           
      }
      public double calculoDistancia(Punto a, Punto b){
         double distancia=( Math.pow(b.getY()-a.getY(), 2.0)+Math.pow(b.getX()-a.getX(), 2.0));
         return distancia;
      }
       
} 