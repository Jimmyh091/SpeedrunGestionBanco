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
    
    private static Usuario[] usuarios;
    private static Cuenta[] cuentas;
    private static Tarjeta[] tarjetas;
    
    private static int numUsu = 0;
    private static int numCue = 0;
    private static int numTar = 0;
    
    public static void main(String[] args) {
        System.out.println("Cuantos usuarios quieres tener?");
        int numUs = 0;        
        try{
            numUs = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        usuarios = new Usuario[numUs];
        
        System.out.println("Cuantos cuentas quieres tener?");
        int numCue = 0;        
        try{
            numCue = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        cuentas = new Cuenta[numCue];
        
        System.out.println("Cuantos tarjetas quieres tener?");
        int numTar = 0;        
        try{
            numTar = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        tarjetas = new Tarjeta[numTar];
        
        do {
            ejecutarMenu();
        } while (true);        
    }
    
    public static void ejecutarMenu(){
        System.out.println("MENU"
                + "\n\n[1] Crear Usuario"
                + "\n[2] Ingresar en la cuenta"
                + "\n[3] Retirar en la cuenta"
                + "\n[4] Ingresar en la tarjeta"
                + "\n[5] Retirar en la tarjeta"
                + "\n[0] Salir");
        int opc = 0;        
        try{
            opc = sc.nextInt();
        }catch(Exception e){
            System.out.println("Dato incorrecto");
        }finally{
            sc.nextLine();
        }
        
        switch(opc){
            case 1 -> {
                usuarios[numUsu++] = crearUsuario();
                cuentas[numCue++] = crearCuenta(usuarios[numUsu].getNumCuenta());
                boolean soloDebito = cuentas[numCue] instanceof CuentaAhorro;
                tarjetas[numTar++] = crearTarjeta(cuentas[numCue].getId(), soloDebito);
            }
            case 0 -> System.exit(0);
        }
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
    public static Cuenta crearCuenta(int id){

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
    public static Tarjeta crearTarjeta(int id, boolean soloDebito){
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
}
