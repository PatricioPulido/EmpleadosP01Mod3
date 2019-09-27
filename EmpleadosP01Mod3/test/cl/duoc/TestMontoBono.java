/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class TestMontoBono {
    
     @Test
    
    public void TestMontoBono(){
        System.out.println("MontoBono");
        String rut="22222222";
        BussEmpleado instance = new BussEmpleado();
        Empleado emp = instance.Buscar(rut);
        
        assertTrue(emp.montoBono()==250000);
        
        
    }
}
