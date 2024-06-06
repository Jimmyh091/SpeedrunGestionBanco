/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanco;

/**
 *
 * @author EAG
 */
public abstract class Tarjeta {
    private int id;
    private int cuenta;
    private float saldo;
    
    public Tarjeta(int i, int c, float s){
        id = i;
        cuenta = c;
        saldo = s;
    }
    
    public void ingresar(float ingreso){
        saldo += ingreso;
    }
    
    public abstract void retiro(float ingreso);
}
