package RECURSIVIDAD;
public class TP6 {
public static void main (String[] args){
    int resultado = suma (5);
    int resultado2 = sumaPares(5);
    int resultado3 = sumaDigitos(1234);
    System.out.println(resultado);
    System.out.println(resultado2);
    System.out.println( "Es:" + resultado3);
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
    if (n <= 0)
        return 0;
    else if (n % 2 == 0){
            return n + sumaPares(n - 1);
    }
        else
            return sumaPares(n - 1);

}

//Ejercicio 6
public static int funcionG (int x, int y){
    if (x <= y)
        return 1;
    else
        return 1 + funcionG(x, y + 1);
}

//Ejercicio 7
public static int vocales (String cd){
    if (cd.length() == 0)
        return 0;
    else
        if (cd.charAt(0) == 'a' || cd.charAt(0) == 'e' || cd.charAt(0) == 'i' || cd.charAt(0) == 'o' || cd.charAt(0) == 'u')
            return 1 + vocales(cd.substring(1));
        else
            return vocales (cd.substring(1));
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
    if (n == 1)
        return 1;
    else
        return n + calcularSuma(n - 1);
}

//Ejercicio 9
public static boolean determinarNum (int n, int [] num, int indice){
    if (indice == num.length)
        return false;
    else
        if (num [indice] == n)
            return true;
        else
            return determinarNum(n, num, indice + 1);
}

//Ejercicio practica 25/11
public static int cantOcurrencias (int n, int [] num, int indice){
    if (indice == num.length)
        return 0;
    else
        if (num [indice] == n)
            return 1 + cantOcurrencias(n, num, indice + 1);
        else
            return cantOcurrencias(n, num, indice + 1);
}

//Ejercicio 10
public static int valorMinimo (int [] arr, int indice){
    int minResto = valorMinimo(arr, indice + 1);
    if (indice == arr.length - 1)
        return arr[indice];
    else
        if (arr [indice] < minResto)
            return arr[indice];
        else
            return minResto;
}

public static int misterio (int a, int b){
    if (a == 0)
        return b;
    else
        return misterio(a-1, b+1);
}

//Practica contar cuantas veces aparece 'A' o 'a'
public static int contarA (String s){
    if (s.charAt(0) == 0)
        return 0;
    else
        if(s.charAt(0) == 'a' || s.charAt(0) == 'A')
            return 1 + contarA(s.substring(1));
        else
            return contarA(s.substring(1));
}
// traza rapida eje4
public static int f (int n){
    if (n < 1)
        return 1;
    return n * f(n - 1);
}

//La suma de digitos de un entero eje3
public static int sumaDigitos(int n){
    if (n < 10)
        return n;
    else
        return (n % 10) + sumaDigitos(n / 10);
}

//suma de elmentos de un arreglo
public static int sumaArr (int n, int arr[], int indice){
    if (indice == arr.length)
        return 1;
    else
        return arr [indice] + sumaArr(n, arr, indice + 1);
}
}
