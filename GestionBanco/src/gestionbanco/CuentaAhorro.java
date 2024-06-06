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
public class CuentaAhorro extends Cuenta{
    public CuentaAhorro(int i, float s, int a){
        super(i, s, a);
    }

    @Override
    public void ingresar(float ingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retiro(float ingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
// saldo * (1 + intereses) ^ (numAnio<pedir> * 2)