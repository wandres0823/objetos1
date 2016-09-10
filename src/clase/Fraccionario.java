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
public class Fraccionario {
    
   private int numerador;
   private int denominador;
   private int mixto;
   

public Fraccionario (int numerador,int denominador,int mixto){
       this.numerador=numerador;
       this.denominador=denominador;
       this.mixto=mixto;
   }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getMixto() {
        return mixto;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setMixto(int mixto) {
        this.mixto = mixto;
    }
public Fraccionario Sumar(Fraccionario f2){
       int num,den,mix = 0;
       Fraccionario f;
       
       num=this.numerador * f2.denominador + this.denominador * f2.numerador;
        den=this.denominador * f2.denominador;
        f = new Fraccionario(num,den,mix);
        return f;
   }
   
   public Fraccionario Restar(Fraccionario f2){
       int num,den,mix = 0;
       Fraccionario f;
       
       num=this.numerador * f2.denominador - this.denominador * f2.numerador;
       den=this.denominador * f2.denominador;
       f = new Fraccionario(num,den,mix);
       return f;
   }
   public Fraccionario Multiplicar (Fraccionario f2){
       int num,den,mix = 0;
       Fraccionario f;
       
       num=this.numerador * f2.numerador;
       den=this.denominador * f2.denominador;
       f = new Fraccionario(num,den,mix);
       return f;
   }
   public Fraccionario Dividir(Fraccionario f2){
       int num,den,mix = 0;
       Fraccionario f;
       
       num=this.numerador * f2.denominador;
       den=this.denominador * f2.numerador;
       f = new Fraccionario(num,den,mix);
       return f;
   }
   public Fraccionario Mixto(){
       int num,den,mix;
       Fraccionario f;
       
       num=this.numerador % this.denominador;
       den=this.denominador;
       mix=this.numerador / this.denominador;
       f = new Fraccionario(num,den,mix);
       return f;   
   }

 }
