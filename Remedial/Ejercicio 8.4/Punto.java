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
public class Punto {
    private double x;
    private double y;
 
    public Punto() {
    }
 
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public double getX() {
        return x;
    }
 
    public void setX(double x) {
        this.x = x;
    }
 
    public double getY() {
        return y;
    }
 
    public void setY(double y) {
        this.y = y;
    }
 
    @Override
    public String toString() {
        return "Punto (" + "x= " + x + ", y= " + y+")" ;
    }
}