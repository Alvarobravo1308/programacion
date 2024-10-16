public class Producto {
    private String nombre;
    private String nombre1;
    private Precio precio;
    private Precio precio1;

    public Producto(String nombre, Precio precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }



    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public Precio getPrecio1() {
        return precio1;
    }

    public void setPrecio1(Precio precio1) {
        this.precio1 = precio1;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + nombre +
                ", precio=" + precio +
                
                '}';
    }
}
