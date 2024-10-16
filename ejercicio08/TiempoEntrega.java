public class TiempoEntrega {
    private int days;

    public TiempoEntrega(int days) {
        this.days = days;
    }

    public int getDias() {
        return days;
    }

    public void setDias(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return days + " días";
    }
}
