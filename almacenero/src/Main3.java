import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

import almacen.*;

public class Main3 {

	
	

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		
		sc = new Scanner(System.in);
		Integer palabra2=0;

		//1-Añadir productos
		//2-Ver clientes 
		//3- La cesta

		System.out.print("\ningresa lo que quieres hacer: 1)Añadir Productos / 2) Ver Clientes / 3) La cesta / 4) Salir ");
		sc = new Scanner(System.in);
		palabra2 = sc.nextInt();
		
	
		
  do{
	   
	  
	switch (palabra2) {



		case 1:  

			 System.out.println("**********Has elegido añadir PRODUCTOS**********");

	//CODIGO DE BARRAS MANZANA 1001,1002
			 
	Lote_manzana lot_manz = new Lote_manzana();
	
	lot_manz.añadirManzanas();
	lot_manz.pintarManzanas();
	
	
	
	//CODIGO DE BARRAS LECHUGA 1003

	Lote_lechuga lot_lechu = new Lote_lechuga();
	
	lot_lechu.añadirLechugas();
	lot_lechu.pintarLechugas();
	
	//CODIGO DE BARRAS LECHE 1004,1005
	
	Lote_leche lot_leche = new Lote_leche();
	
	lot_leche.añadirLeches();
	lot_leche.pintarLeches();
	
	
	
	
			

	System.out.print("\ningresa lo que quieres hacer: 1)Añadir Productos / 2) Ver Clientes / 3) La cesta / 4) Salir ");
	sc = new Scanner(System.in);
	palabra2 = sc.nextInt();

			break;
		

		case 2: 

			System.out.println("**********Has elegido ver clientes**********");

			Lista_clientes lcliente = new Lista_clientes();
			
			lcliente.leer_clientes();
			lcliente.ver_clientes();



System.out.print("\ningresa lo que quieres hacer: 1)Añadir Productos / 2) Ver Clientes / 3) La cesta / 4) Salir ");
sc = new Scanner(System.in);
palabra2 = sc.nextInt();


			break;

		case 3: 
			// la cesta no funciona
			
			Cesta cesta = new Cesta();
			
			cesta.la_cesta();


   			System.out.print("\ningresa lo que quieres hacer: 1)Añadir Productos / 2) Ver Clientes / 3) La cesta / 4) Salir ");
   			sc = new Scanner(System.in);
   			palabra2 = sc.nextInt();


   			break;
   		}


   
			
  } while (palabra2 !=4);	
  
	

		

	}
}
