/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jepa2698
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumarNumeros method, of class Calculadora.
     */
    @Test
    public void testSumarNumeros() {
        System.out.println("sumarNumeros");
        int a = 1;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of restarNumeros method, of class Calculadora.
     */
    @Test
    public void testRestarNumeros() {
        System.out.println("restarNumeros");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.restarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of multiNumeros method, of class Calculadora.
     */
    @Test
    public void testMultiNumeros() {
        System.out.println("multiNumeros");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multiNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of dividirNumeros method, of class Calculadora.
     */
    @Test
    public void testDividirNumeros() {
        System.out.println("dividirNumeros");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.dividirNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
