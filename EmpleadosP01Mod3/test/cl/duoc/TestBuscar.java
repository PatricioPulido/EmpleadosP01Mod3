/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Dell
 */
public class TestBuscar {

    public TestBuscar() {
    }
    @Test
    public void testBuscar(){
        System.out.println("Buscar");
        String rut ="22222222";
        BussEmpleado instance = new BussEmpleado();
        Empleado emp = instance.Buscar(rut);
        Assert.assertEquals(emp.getRut(),rut);
    }
    
}
