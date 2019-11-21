/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_4;

/**
 *
 * @author Vianey
 */
public class Nodo {
 private Punto dato;
    private Nodo siguiente;
 
    public Nodo(Punto dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    public Nodo(Punto dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
 
    public Punto getDato() {
        return dato;
    }
 
    public void setDato(Punto dato) {
        this.dato = dato;
    }
 
    public Nodo getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
     
} 
