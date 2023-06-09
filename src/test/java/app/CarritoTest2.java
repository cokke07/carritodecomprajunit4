package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarritoTest2 {
    // El sujeto de prueba
    private Carrito carrito;
    private Carrito carrito2;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;


    @Before
    public void setUp() {
        carrito = new Carrito();
        carrito2 = new Carrito();
        producto1 = new Producto("Monitor gamer Asus", 250000);
        producto2 = new Producto("Mouse Razer", 65000);
        producto3 = new Producto("Teclado Gamer", 80000);
        carrito.agregarProducto(producto1);
    }

    @Test
    public void testCarroVacio() {
        carrito2.getProductos();
        assertEquals(0, carrito2.getProductos().size());
    }


    @Test
    public void testCalcularTotal() {
        carrito2.agregarProducto(producto1);
        carrito2.agregarProducto(producto2);
        carrito2.agregarProducto(producto3);
        double total = carrito2.calcularTotal();
        assertEquals(395000,total,0.0);
    }
}
