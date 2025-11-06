package PILA.MusicPlayer;

import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayList music = new PlayList();
        Song cancion = new Song(null, null, null, 0);
        int opcion;

        do {
            System.out.println("\n :::: REPRODUCTOR DE MUSICA ::::");
            System.out.println("1. Agregar una cancion");
            System.out.println("2. Quitar cancion agregada recientemente");
            System.out.println("3. Reproducir playlist");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (music.estaLlena()){
                        System.out.println("Error: La playlist esta llena");
                    }else {
                        sc.nextLine();
                        System.out.println("Ingrese el nombre de la cancion: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese nombre del interprete: ");
                        String interprete = sc.nextLine();
                        System.out.println("Ingrese genero musical: ");
                        String genero = sc.nextLine();
                        System.out.println("Ingrese año de lanzamiento: ");
                        int año = sc.nextInt();
                        Song tema = new Song(nombre, interprete, genero, año);
                        music.encolar(tema);
                        System.out.println("La cancion: " + tema.toString() + " ha sido agregada correctamente.");
                    }
                    break;

                case 2:
                    if (music.estaVacia()){
                        System.out.println("Error: La playlist esta vacia.");
                    }else{
                        Song elemento = music.desencolar();
                        System.out.println("La cancion: " + elemento + " se ha eliminado correctamente.");
                    }
                    break;

                case 3:
                    if (music.estaVacia()){
                        System.out.println("La playlist esta vacia");
                    }else{
                        System.out.println("\n. . . REPRODUCIENDO PLAYLIST . . .\n");
                        PlayList aux = new PlayList();
                        int contador = 0;
                        
                        while (!music.estaVacia()) {
                            Song tema = music.desencolar();
                            contador ++;
                            System.out.println(contador + " _ " + tema);
                            aux.encolar(tema);
                        }
                        while (!aux.estaVacia()) {
                            music.encolar(aux.desencolar());
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }
        } while (opcion != 0);

        sc.close();

    }
}
