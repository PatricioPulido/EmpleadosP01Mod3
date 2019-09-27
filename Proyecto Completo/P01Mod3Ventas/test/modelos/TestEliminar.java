
package modelos;

import modelo.ColeccionVentas;
import modelo.Venta;
import org.junit.Assert;
import org.junit.Test;


public class TestEliminar {
    
    public TestEliminar(){
        
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="Ven001";
        Venta venta = new Venta("Ven001",100,10);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;
        boolean obtenido=instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
