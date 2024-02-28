/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjrodmar
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }
    
    
   
    @BeforeClass
    public static void setUpClass() {
        //por ejemplo abrir conexión a BD
        System.out.println("Se ejecuta antes de la clase y sirve para inicializar");
    }
    
    @AfterClass
    public static void tearDownClass() {
        //por ejemplo cerrar la conexión a la BD
        System.out.println("Esto se ejecita al finalizar cada clase");
    }
    
     //Esto va a ocurrir justo antes de cada prueba
    @Before
    public void setUp() {
        System.out.println("Esto ocurre ANTES de cada test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Esto ocurre justo DESPUÉS de cada test");
    }

    /**
     * Test of sumarNumeros method, of class calculadora.
     */
    @Test
    public void testSumarNumeros() {
        System.out.println("sumar dos Números");
        int a = 4;
        int b = 6;
        calculadora instance = new calculadora();
        int expResult = 10;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
  @Test
    public void testRestarNumeros(){
        System.out.println("restar dos Números");
         int a = 6;
         int b = 4;
        calculadora obj = new calculadora();
        
        int result = obj.restarNumeros(a, b);
        assertEquals(2, result);
        
    }
    
     @Test
    public void testMultiplicarNumeros(){
        System.out.println("Multiplicar dos Números");
        float a = 6.24F;
         float b = 4.15F;
        calculadora obj = new calculadora();
        
        float result = obj.multiplicarNumeros(a, b);
        assertEquals(25.89F, result,0.1 ); //valor torable que se admite
        
    }
    
       @Test
    public void testdivisionNumeros() throws Exception {
        System.out.println("Dividir dos Números");
        double a = 3.0;
        double b = 1.0;
        calculadora obj = new calculadora();
        
        double result = obj.divisionNumeros(a, b);
        assertEquals(3.0, result,0.0 ); //valor torable que se admite
        
    }
    
    @Test(expected = Exception.class)
    public void testdivisionentreceroNumeros() throws Exception {
        System.out.println("Dividir dos Números entre cero");
        double a = 3.0;
        double b = 0.0;
        calculadora obj = new calculadora();
        
        double result = obj.divisionNumeros(a, b);
     //   assertEquals(3.0, result,0.0 ); //valor torable que se admite
        
    }
}
