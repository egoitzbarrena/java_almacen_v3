package almacen;

import java.util.Scanner;

public class Lechuga extends Producto {



private String color;
private Double eurosUnidad;


private Scanner sc = new Scanner(System.in);


public String getColor (){

	return color;
}

public void setColor(String c){

	color=c;
}

public Double getEurosUnidad (){

	return eurosUnidad;
}

public void setEurosUnidad(Double eu){

	eurosUnidad=eu;
}


public void añadirLechuga(){

	
		System.out.println("Introduce el codigo de barras de la lechuga: ");
		this.setCod_barras(sc.nextInt());
		System.out.println("Introduce el tipo de lechuga: ");
		this.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la lechuga: ");
		this.setProcedencia(sc.next());
		System.out.println("Introduce el color de la lechuga: ");
		this.setColor(sc.next());
		System.out.println("Introduce cuantas lechugas: ");
		this.setEurosUnidad(sc.nextDouble());		
		

}

public void pintarLechuga(){
	
	System.out.println(" \n**************INFORMACION DE LAS LECHUGAS**************" );
	

		System.out.println(" \nTipo de lechuga: "+this.getTipo() );
       System.out.println(" Procedencia: "+this.getProcedencia());
       System.out.println(" Color : "+this.getColor() );
       System.out.println(" Euros Unidad: "+ this.getEurosUnidad());
       System.out.println(" Codigo de barras:" + this.getCod_barras());

}
}