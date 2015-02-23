package almacen;

import java.util.Scanner;

public class Leche extends Producto {


private Double eurosLitro;


private Scanner sc = new Scanner(System.in);

public Double getEurosLitro(){

	return eurosLitro;
}

public void setEurosLitro(double el){

	eurosLitro=el;
}


public void añadirLeche(){

	System.out.println("Introduce el codigo de barras de la leche: ");
	this.setCod_barras(sc.nextInt());
	System.out.println("Introduce el tipo de leche: ");
	this.setTipo(sc.next());
	System.out.println("Introduce la procedencia de la leche: ");
	this.setProcedencia(sc.next());
	System.out.println("Introduce cuantos litros: ");
	this.setEurosLitro(sc.nextDouble());
	
}


public void pintarLeche(){
	
	 System.out.println(" \n**************INFORMACION DE LA LECHE**************" );
	 System.out.println(" \nTipo de leche: "+this.getTipo() );
     System.out.println(" Procedencia: "+this.getProcedencia());
     System.out.println(" Euros Litro: "+this.getEurosLitro());
     System.out.println(" Codigo de barras:" + this.getCod_barras());

   //}
}


}
