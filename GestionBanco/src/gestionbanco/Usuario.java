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
public class Usuario {
    private String nombre;
    private String dni;
    private int numCuenta;
    
    public Usuario(String n, String d, int nu){
        nombre = n;
        dni = d;
        numCuenta = nu;
    }
}
