public class FiguraFactory {
    public static Figuras crearFigura(TiposFiguras tipofiguras,int...dimensiones){
        switch(tipofiguras){
            case triangulo:
                if (dimensiones.length != 3) {
                    throw new IllegalArgumentException("Se necesitan 3 dimensiones para un rectángulo.");
                }
                return new Triangulo(dimensiones[0],dimensiones[1],dimensiones[2]);

            case rectangulo:
                if (dimensiones.length != 2) {
                    throw new IllegalArgumentException("Se necesitan 2 dimensiones para un rectángulo.");
                }
                return new Rectangulo(dimensiones[0],dimensiones[1]);

            case circulo:
                if (dimensiones.length != 1) {
                    throw new IllegalArgumentException("Se necesitan 2 dimensiones para un rectángulo.");
                }
                return new Circulo(dimensiones[0]);
               

        }
 throw new IllegalArgumentException("Tipo de figura desconocido: " + tipofiguras);

    }
}
