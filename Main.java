import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            Triangulo triangulos=Triangulo.getInstance();
            System.out.println("El area del triangulo singleton es:" +triangulos.calcularArea());
            System.out.println("El perimetro del triangulo singleton es:" + triangulos.calcularPerimetro());
            System.out.println("Escoge una de estas figuras:");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.print("Ingrese el número correspondiente a la figura deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Introduce los 3 lados del triangulo");
                    int lado1 = scanner.nextInt();
                    int lado2 = scanner.nextInt();
                    int lado3 = scanner.nextInt();

                    Figuras triangulo = FiguraFactory.crearFigura(TiposFiguras.triangulo,lado1,lado2,lado3);
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Ingrese la longitud de los dos lados del rectángulo:");
                    int base= scanner.nextInt();
                    int altura= scanner.nextInt();

                    Figuras rectangulo = FiguraFactory.crearFigura(TiposFiguras.rectangulo,base,altura);
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Ingrese el radio del círculo:");
                    int radio= scanner.nextInt();
                    Figuras circulo = FiguraFactory.crearFigura(TiposFiguras.circulo,radio);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
