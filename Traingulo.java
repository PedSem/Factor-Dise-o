public class Triangulo implements Figuras {
    private static Triangulo instancia;
    private int lado1;
    private int lado2;
    private int lado3;
    private Triangulo(){

    }
    public static Triangulo getInstance(){
        if(instancia==null){
            instancia=new Triangulo(2,3,4);
        }
        return instancia;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double calcularArea() {
        double s=(calcularPerimetro())/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));

    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;


    }
}
