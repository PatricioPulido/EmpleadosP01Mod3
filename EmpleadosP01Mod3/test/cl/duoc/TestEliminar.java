
package cl.duoc;

import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import org.junit.Assert;
import org.junit.Test;


public class TestEliminar {
    
    public TestEliminar(){
        
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String rut="202788858";
        Empleado emp = new Empleado("202788858", "patricio", 2, 3);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperado=true;
        boolean obtenido=instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
