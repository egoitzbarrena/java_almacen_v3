package almacen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import almacen.Manzana;
import almacen.Cliente;
import almacen.Leche;
import almacen.Lechuga;
import almacen.Lote_leche;
import almacen.Lote_lechuga;
import almacen.Lote_manzana;


public class Cesta {



	private String nombreproducto;
	private Double precio_li_uni;
	private Double preciototalp;
	private Cliente cliente;
	private Double descuento;
	private Scanner sc = new Scanner(System.in);

	private ArrayList<Cesta> cestacompra = new ArrayList<Cesta>();
	private BufferedReader bf;
	
	public ArrayList<Cesta> getCestacompra(){
		
		return cestacompra;
	}
	
	public void setCestacompra(ArrayList<Cesta> cc){
		
		cestacompra = cc;
	}
	
	public String getNombreproducto()
		{
			return nombreproducto;
		}
		
	public void  setNombreproducto(String nombreproducto1)
		{
			nombreproducto=nombreproducto1;
		}

	public Double getPrecio_li_uni()
		{
			return precio_li_uni;
		}
		
	public void  setPrecio_li_uni(Double precioku1)
		{
		precio_li_uni=precioku1;
		}


	public Double getPreciototalp()
		{
			return preciototalp;
		}
		
	public void  setPreciototalp(Double preciototalp1)
		{
			preciototalp=preciototalp1;
		}

	public Cliente getCliente()
		{
			return cliente;
		}
		
	public void  setCliente(Cliente cliente1)
		{
			cliente=cliente1;
		}

		public Double getDescuento()
		{
			return descuento;
		}
		
		public void  setDescuento(Double descuento1)
		{
			descuento=descuento1;
		}

		public void la_cesta(){
			
			
			ArrayList<Manzana> arraymanz = Lote_manzana.obtenerManzanas();
			

			
			ArrayList<Leche> arrayleche = Lote_leche.obtenerLeches();
			

			
			ArrayList<Lechuga> arraylechuga = Lote_lechuga.obtenerLechugas();
			
			Double condescuento = 0.0;
			Double descuento1 = 0.0;
			Double totala = 0.0;
			
			System.out.println("************Cesta*********** ");	   
		   	System.out.println("Introduce el codigo del cliente:");
		   		int numcli = sc.nextInt();
		   try {	
			   
			    String ruta = "/root/git/java_almacen_v3/almacenero/clientes.txt";
	 			File archivo2 = new File(ruta);
				FileReader leer = new FileReader (archivo2);
				bf = new BufferedReader(leer);
				String linea = bf.readLine();

		   	

		   		while (linea != null){
		   		
		   		String [] cortarString = linea.split(";");
		   		
		   		Cliente cliente = new Cliente();
		   		String [] cortarString11 = cortarString[0].split(",");
		   			cliente.setNombre (cortarString11[0]);
		   			cliente.setApellidos (cortarString11[1]);
		   			cliente.setDNI (cortarString11[2]);
		   			cliente.setNum_socio (Integer.parseInt(cortarString11[3]));
		   			cliente.setDto (Double.parseDouble(cortarString11[4]));
		   		
		   		
		   			Double nc =Double.parseDouble(cortarString11[3]);
		       		if (numcli == nc){
		       			descuento1= Double.parseDouble(cortarString11[4]);
		       		}
		       		linea = bf.readLine();
		   		}
		   		} catch(FileNotFoundException exception){
			    	System.out.println("Error esta mal el fichero, no esta en ese lugar: ");
			    	
			    }
		   				catch(Exception ioe){
		    	System.out.println("Error: "+ ioe);
		   				}
		   		
		   	
		   	

		   		System.out.println(" \n Cuantos productos quieres añadira a la cesta? ");
	    		int cuan = sc.nextInt();


			    for  (int ces=0 ; ces < cuan ; ces++){

				   	System.out.println("Introduce el codigo de barras del producto que quieras añadir a la cesta:");
				   		int numbarras=sc.nextInt();




				   		
						for (int manz=0 ; manz < arraymanz.size(); manz++){
				   				
				   				if  (numbarras == arraymanz.get(manz).getCod_barras()){
				   				Cesta cesta = new Cesta();
				   				cesta.setNombreproducto(arraymanz.get(manz).getTipo());
				   				cesta.setPrecio_li_uni(arraymanz.get(manz).getEurosKilo());

				   				System.out.println("Cuantas manzanas: ");
				   				Double cuantas = sc.nextDouble();

				   				Double precio = cuantas * arraymanz.get(manz).getEurosKilo();
				   				cesta.setPreciototalp(precio);
				   				condescuento = (1-descuento1) * precio;
				   				cesta.setDescuento(condescuento); 

				   				cestacompra.add(cesta);
				   				
				   				}
				   				
					
						}
				
					for (int lech=0 ; lech < arrayleche.size(); lech++){
				   				
				   				if  (numbarras == arrayleche.get(lech).getCod_barras()){
				   				Cesta cesta = new Cesta();
				   				cesta.setNombreproducto(arrayleche.get(lech).getTipo());
				   				cesta.setPrecio_li_uni(arrayleche.get(lech).getEurosLitro());

				   				System.out.println("Cuantas leches: ");
				   				Double cuantas = sc.nextDouble();

				   				Double precio = cuantas * arrayleche.get(lech).getEurosLitro();
				   				cesta.setPreciototalp(precio);
				   				condescuento = (1-descuento1) * precio;
				   				cesta.setDescuento(condescuento); 

				   				cestacompra.add(cesta);
				   				
				   				}
				   				
					
						}

				   		
				   		for (int lechu=0 ; lechu < arraylechuga.size(); lechu++){
				   				
				   				if  (numbarras == arraylechuga.get(lechu).getCod_barras()){
				   				Cesta cesta = new Cesta();
				   				cesta.setNombreproducto(arraylechuga.get(lechu).getTipo());
				   				cesta.setPrecio_li_uni(arraylechuga.get(lechu).getEurosUnidad());

				   				System.out.println("Cuantas lechugas: ");
				   				Double cuantas = sc.nextDouble();

				   				Double precio = cuantas * arraylechuga.get(lechu).getEurosUnidad();
				   				cesta.setPreciototalp(precio);
				   				condescuento = (1-descuento1) * precio;
				   				cesta.setDescuento(condescuento); 

				   				cestacompra.add(cesta);
				   				
				   				}
				   				
					
						}
						

						System.out.println(cestacompra.get(ces).getPreciototalp());
				   		System.out.println(condescuento);
   				}

   				for (int cest=0 ; cest < cestacompra.size(); cest++){
   					System.out.println(" nNombre del producto: "+ cestacompra.get(cest).getNombreproducto() );
   					System.out.println(" Precio unidad/kilo: "+ cestacompra.get(cest).getPrecio_li_uni() );
   					System.out.println(" Precio sin descuento: "+ cestacompra.get(cest).getPreciototalp() );



   					totala = totala + cestacompra.get(cest).getDescuento();
   					
   					System.out.println("totala da: " + totala );
   				
			
   				}
		}


}
