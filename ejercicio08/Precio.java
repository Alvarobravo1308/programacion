public class Precio {
    private int value;

    public Precio(int value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValor(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value +"$" ;
    }
}
