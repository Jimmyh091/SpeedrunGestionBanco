/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanco;

import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class GestionBanco {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here        
    }
    
    public static Tarjeta crearTarjeta(){
        System.out.println("Introduce el id");
        int id = 0;        
        try{
            id = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Introduce el saldo");
        float saldo = 0;        
        try{
            saldo = sc.nextFloat();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Introduce el numero de cuenta relacionado");
        int numCuenta = 0;        
        try{
            numCuenta = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Quieres que sea tarjeta de credito o de debito?");
        String tipo = sc.nextLine();
        
        if (tipo.equals("credito")) {
            return new TarjetaCredito(id, numCuenta, saldo);
        }else if (tipo.equals("debito")){
            return new TarjetaDebito(id, numCuenta, saldo);
        }else return null;
    }    
    public static Cuenta crearCuenta(){
        System.out.println("Introduce el id");
        int id = 0;
        
        try{
            id = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Introduce el saldo");
        int saldo = 0;
        
        try{
            saldo = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Introduce el anio");
        int anio = 0;
        
        try{
            anio = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        System.out.println("Quieres que sea cuenta corriente o Ahorro");
        String tipo = sc.nextLine().toLowerCase();
                
        if (tipo.equals("corriente")) {
            return new CuentaCorriente(id, saldo, anio);
        }else if (tipo.equals("ahorro")){
            return new CuentaAhorro(id, saldo, anio);            
        }else return null;
    }
    public static Usuario crearUsuario(){
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce el DNI");
        String dni = sc.nextLine();
        
        System.out.println("Introduce el numero de cuenta");
        int numCuenta = 0;
        
        try{
            numCuenta = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        return new Usuario(nombre, dni, numCuenta);
    }
        
}
