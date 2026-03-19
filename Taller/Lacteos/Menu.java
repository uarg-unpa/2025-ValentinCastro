package Lacteos;

import java.util.Scanner;

public class Menu {
    public static void main (String args[])
	{
        Scanner sc = new Scanner(System.in);
		Empresa lacteos = new Empresa(10);
		int op;
		do{
			System.out.println("------------ << PRODUCTOS >> -------------");
			System.out.println("1- Agregar producto");
			System.out.println("2- Listar prodcutos por denominación");
			System.out.println("3- Listar productos por marca");
			System.out.println("0- Salir");
			System.out.println("----------------------------------------------");
            System.out.println("Ingrese opcion --->");
			op = sc.nextInt();
			switch(op)
			{
				case 1:{
                    //Agregar producto
                        System.out.println("Denominación: ");
                        String denom = sc.next();
                        System.out.println("Marca: ");
                        String marca = sc.next();
                        System.out.println("Peso: ");
                        Double peso = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Precio: ");
                        Double precio = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Fecha de vencimiento: ");
                        String fechaVen = sc.next();

						Productos p = new Productos(denom, marca, peso, precio, fechaVen);
                        lacteos.addProduct(p);
					    break;
						}
				case 2:{
                    //Lista de productos por denominacion
                lacteos.listasDenom();
				}break;
				case 3:{
                    //Lista de productos por marca
                lacteos.ListMarca();
				}break;
				case 0:{
				}break;
			}
		}
		while(op!=0);
        sc.close();
	}
}

