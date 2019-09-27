
package cl.duoc;




import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import org.junit.Assert;
import org.junit.Test;


public class TestModificar {
    
   public TestModificar(){
       
   } 
   
   @Test  
  public void testModificar(){
       System.out.println("Modificar");
       Empleado emp = new Empleado("11111111", "Joaquina", 36, 3);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperado=true;
        emp = new Empleado("11111111", "Joaquina", 34, 3);
        boolean obtenido=instance.Modificar(emp);
        Assert.assertEquals(esperado, obtenido);
  }
   
}
