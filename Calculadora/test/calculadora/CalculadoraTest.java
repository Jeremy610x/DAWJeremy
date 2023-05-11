/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jepa2698
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarNumeros method, of class Calculadora.
     */
    @Test
    public void testSumarNumeros() {
        System.out.println("sumarNumeros");
        int a = 10;
        int b = 5;
        Calculadora instance = new Calculadora();
        int expResult = 15;
        int result = instance.sumarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restarNumeros method, of class Calculadora.
     */
    @Test
    public void testRestarNumeros() {
        System.out.println("restarNumeros");
        int a = 10;
        int b = 5;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.restarNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiNumeros method, of class Calculadora.
     */
    @Test
    public void testMultiNumeros() {
        System.out.println("multiNumeros");
        int a = 2;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.multiNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of dividirNumeros method, of class Calculadora.
     */
    @Test
    public void testDividirNumeros() {
        System.out.println("dividirNumeros");
        int a = 10;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.dividirNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
