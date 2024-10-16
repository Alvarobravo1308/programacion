


public class Main {
    public static void main(String[] args) {
        
        Precio precio = new Precio(29);
       
        Producto producto = new Producto("Cargador Inalámbrico",precio);

        
        Precio precio1 = new Precio(20);
       
        Producto producto1 = new Producto("Disfraz hallowen",precio1);
        TiempoEntrega tiempoEntrega = new TiempoEntrega(10);

        Transporte transporte = new Transporte("DHL", tiempoEntrega);

       
        System.out.println("Detalles iniciales:");
        System.out.println(producto);
        System.out.println(producto1);
        System.out.println(transporte);

      
        Precio nuevoPrecio = new Precio(49);
        Producto nuevoProducto = new Producto("Auriculares Bluetooth", nuevoPrecio);
        producto.setNombre(nuevoProducto.getNombre());
        producto.setPrecio(nuevoProducto.getPrecio());

        TiempoEntrega nuevoTiempoEntrega = new TiempoEntrega(5);
        transporte.setTiempoEntrega(nuevoTiempoEntrega);

        
        transporte.setMetodo("SEUR");

        
        System.out.println("\nDetalles después del cambio:");
        System.out.println(producto);
        System.out.println(transporte);
    }
}
