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
public abstract class Cuenta {
    private int id;
    private float saldo;
    private int anio;
    //private int tarjeta;
    public Cuenta(int i, float s, int a){
        id = i;
        saldo = s;
        anio = a;
    }
    
    public int getId(){
        return id;
    }
    
    public abstract void ingresar(float ingreso);
    public abstract void retiro(float ingreso);
}
