/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author adalberto
 */
public class numeromixto {
    private int Numerador;
    private int Denominador;
    private int Entera;
    
    public numeromixto (  int Numerador , int Denominador , int Entera){
        this.Denominador = Denominador;
        this.Numerador = Numerador;
        this.Entera = Entera;
       
       
        
    }

    public int getNumerador() {
        return Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public int getEntera() {
        return Entera;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public void setEntera(int Entera) {
        this.Entera = Entera;
    }
    public numeromixto Numeromixto (){
        int num , den , ent;
        numeromixto m;
        
       
        den = this.Denominador;
        ent = this.Numerador / this.Denominador;
        num = this.Numerador % ent;
        
        m = new numeromixto ( num , den , ent);
        return m;
        
    }
    
}
