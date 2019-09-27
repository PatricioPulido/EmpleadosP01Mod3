/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import modelo.ColeccionVentas;
import modelo.Venta;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class TestSubtotal {

    public TestSubtotal() {
    }
    
    @Test
    
    public void TestSubtotal(){
        System.out.println("subTotal");
        Venta venta = new Venta("Ven001",100,10);
        ColeccionVentas instance = new ColeccionVentas();
        Assert.assertTrue(instance.subTotal(venta)==1000);
    }
    
}

