
package modelos;


import modelo.ColeccionVentas;
import modelo.Venta;
import org.junit.Assert;
import org.junit.Test;


public class TestModificar {
    
   public TestModificar(){
       
   } 
   
   @Test  
  public void testModificar(){
       System.out.println("Modificar");
       Venta venta = new Venta("Ven001",100,10);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado=true;
        instance.Agregar(venta);
        
        boolean obtenido=instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
  }
   
}
