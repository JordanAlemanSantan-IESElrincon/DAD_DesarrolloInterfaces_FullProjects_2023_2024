/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitario;

/**
 *
 * @author jjrodmar
 */
public class calculadora {
    
    public int sumarNumeros(int a, int b){
        return a+b;
    }
    public int restarNumeros(int a, int b){
        return a-b;
    }
    public float multiplicarNumeros(float a, float b){
        return (a*b);
    }
    public double divisionNumeros(double a, double b) throws Exception{
      if (b==0) throw new Exception("División entre cero");
        return (a/b);
    }
   
}
