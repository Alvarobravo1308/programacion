public class Transporte {
    private String metodo;
    private TiempoEntrega tiempoEntrega;

    public Transporte(String metodo, TiempoEntrega tiempoEntrega) {
        this.metodo = metodo;
        this.tiempoEntrega = tiempoEntrega;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public TiempoEntrega getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(TiempoEntrega tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "metodo='" + metodo + '\'' +
                ", tiempoEntrega=" + tiempoEntrega +
                '}';
    }
}
