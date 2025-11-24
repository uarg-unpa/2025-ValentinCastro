package RECURSIVIDAD;
public class TP6 {
public static void main (String[] args){
    int resultado = suma (5);
    int resultado2 = sumaPares(5);
    int resultado3 = funcionG(100, 10);
    System.out.println(resultado);
    System.out.println(resultado2);
    System.out.println(resultado3);
}
//Ejercicio 4
public static int suma(int n){
    if(n == 1)
        return 1;
    else
        return n + suma(n-1);
}

//Ejercicio 5
public static int sumaPares(int n){
    if (n == 2)
        return 2;
    if (n < 2)
        return 0;
    else if (n % 2 != 0){
            return sumaPares(n - 1);
    }
        else
            return n + sumaPares(n - 2);

}

//Ejercicio 6
public static int funcionG (int x, int y){
    if (x < y)
        return 1;
    else
        return funcionG(x, y + 1) + 1;
}

//Ejercicio 7
public static int vocales (String cd){
    if (cd.length() == 0)
        return 0;
    char voc = Character.toLowerCase(cd.charAt(0));
    int suma = 0;
    if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u');
    suma = 1;
        return suma + vocales(cd.substring(1));
}

//Practica de discord

//El metodo en si no hace nada mas que imprimir un mensaje si N es igual a 0, y sino devuelve el entero N como está.
public void queHago(int n) { //no es static, ni retorna nada, tendria que ser "public static int queHago(int n)"
    if (n == 0) {
        System.out.println("ERROR: No hay valor agregado"); //caso base
    } else {
        System.out.println(n); //solo imprime el entero
        queHago(n); //no hay  caso general, solo esta llamando al mismo metodo.
    }
}

//Ejercicio 8
public static int calcularSuma (int n){
    if (n == 0)
        return 0;
    else
        return n + calcularSuma(n - 1);
}
}
