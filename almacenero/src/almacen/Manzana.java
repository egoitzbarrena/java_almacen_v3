package almacen;

import java.util.Scanner;

public class Manzana extends Producto {


private String color;
private Double eurosKilo;


private Scanner sc = new Scanner(System.in);


public String getColor (){

	return color;
}

public void setColor(String c){

	color=c;
}

public Double getEurosKilo (){

	return eurosKilo;
}

public void setEurosKilo(Double ek){

	eurosKilo=ek;
}





public void añadirManzana(){
		
		System.out.println("Introduce el codigo de barras de la manzana: ");
		this.setCod_barras(sc.nextInt());
		System.out.println("Introduce el tipo de manzana: ");
		this.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la manzana: ");
		this.setProcedencia(sc.next());
		System.out.println("Introduce el color de la manzana: ");
		this.setColor(sc.next());
		System.out.println("Introduce los kilos de manzana: ");
		this.setEurosKilo(sc.nextDouble());
	
}

public void pintarManzana(){
	
	System.out.println(" \n**************INFORMACION DE LAS MANZANAS**************" );
	

		System.out.println(" \nTipo de manzana: "+this.getTipo() );
       System.out.println(" Procedencia: "+this.getProcedencia());
       System.out.println(" Color : "+this.getColor() );
       System.out.println(" Euros Kilo: "+this.getEurosKilo());
       System.out.println(" Codigo de barras:" + this.getCod_barras());
	}
	
}

