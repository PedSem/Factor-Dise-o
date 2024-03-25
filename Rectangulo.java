public class Rectangulo implements Figuras {
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    @Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2*lado1+2*lado2;
    }
}
