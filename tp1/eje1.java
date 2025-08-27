package tp1;
public class eje1 {
    public static void main(String[] args) {
        int valor1 = 5, valor2 = 3, resultadoEntero;
        double decimal1 = 2.5, decimal2 = 2.0, resultadoDecimal;

        resultadoEntero = valor1 / valor2;
        resultadoDecimal = valor1 / decimal1;
        resultadoDecimal = valor1 * decimal2;
        resultadoEntero = valor1 * (int) decimal2;
        resultadoEntero = (int) (decimal1 * decimal2);
        resultadoEntero = valor1 * (int) decimal2;

        System.out.println("El resultado es:" + (resultadoEntero = valor1 / valor2));
        System.out.println("El resultado es:" + (resultadoDecimal = valor1 / decimal1));
        System.out.println("El resultado es:" + (resultadoDecimal = valor1 * decimal2));
        System.out.println("El resultado es:" + (resultadoEntero = valor1 * (int) decimal2));
        System.out.println("El resultado es:" + (resultadoEntero = (int) (valor1 * decimal2)));
        System.out.println("El resultado es:" + (resultadoEntero = valor1 * (int) decimal2));
    }
}