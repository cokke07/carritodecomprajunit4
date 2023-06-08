package app;

import org.junit.Before;

public class CarritoTest {

  // El sujeto de prueba
  private Carrito carrito;
  private Producto producto1;
  private Producto producto2;
  
  // Configuración inicial antes de cada @Test (método de prueba)
  @Before
  public void setUp() {
    carrito = new Carrito();
    producto1 = new Producto("Monitor gamer Asus", 250000);
    producto2 = new Producto("Mouse Razer", 65000);
    carrito.agregarProducto(producto1);
  }
  
  
}
