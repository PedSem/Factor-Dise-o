public class Circulo implements Figuras {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
