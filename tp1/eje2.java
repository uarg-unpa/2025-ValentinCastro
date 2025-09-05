package tp1;

public class eje2 {
    public static void main(String[] args) {
        int valor1 = 5, valor2 = 3, resultadoEntero;
        double decimal1 = 7.5, decimal2 = 2.0, resultadoDecimal;

        resultadoEntero = valor1 / valor2;
        resultadoEntero = (int)(valor1 * decimal2) / (int) (decimal1 = valor1);
        resultadoDecimal = valor1 / valor2;
        resultadoDecimal = (double) (valor1 / valor2);
        resultadoDecimal = (double) valor1 * decimal2 / (int) decimal1;
        resultadoDecimal = (double) valor1 * decimal2;
        resultadoDecimal = (double) (valor1 * decimal2) / (decimal1 * (int)decimal2);
        resultadoDecimal = valor1 * (int)decimal2;
        resultadoDecimal = (int) (valor1 * (int) decimal2);

        System.out.println("el resultado es:" + (resultadoEntero = valor1 / valor2));
        System.out.println("el resultado es:" + (resultadoEntero = (int)(valor1 * decimal2) / (int) (decimal1 = valor1)));
        System.out.println("el resultado es:" + (resultadoDecimal = valor1 / valor2));
        System.out.println("el resultado es:" + (resultadoDecimal = (double) (valor1 / valor2)));
        System.out.println("el resultado es:" + (resultadoDecimal = (double) valor1 * decimal2 / (int) decimal1));
        System.out.println("el resultado es:" + (resultadoDecimal = (double) valor1 * decimal2));
        System.out.println("el resultado es:" + (resultadoDecimal = (double) (valor1 * decimal2) / (decimal1 * (int)decimal2)));
        System.out.println("el resultado es:" + (valor1 * (int)decimal2));
        System.out.println("el resultado es:" + ((int) (valor1 * (int) decimal2)));
}
}
