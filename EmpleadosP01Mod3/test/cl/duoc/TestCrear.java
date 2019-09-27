
package cl.duoc;



import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import org.junit.Assert;
import org.junit.Test;


public class TestCrear {
    
    public TestCrear(){
        
    }
    @Test
    public void testCrear(){
        System.out.println("Agregar");
        Empleado emp = new Empleado("11824244", "patricio", 2, 3);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado=true;
        boolean obtenido=instance.Crear(emp);
        Assert.assertEquals(esperado,obtenido);
    }
    
}
