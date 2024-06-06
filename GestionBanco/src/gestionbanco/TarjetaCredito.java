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
public class TarjetaCredito extends Tarjeta{
    public TarjetaCredito(int i, int c, float s){
        super(i, c, s);
    }
    
    @Override
    public void retiro(float ingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
