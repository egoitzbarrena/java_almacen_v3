package almacen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Lista_clientes {
	
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	
	public void leer_clientes() throws FileNotFoundException{
		
	
		
		
		File archivo = new File("/root/git/java_almacen_v2/almacenes/clientes.txt");
		sc = null;
		sc  = new Scanner(archivo);

		String [] cortarString1 = null;	
	   String [] cortarString2 = null;

		while (sc.hasNextLine()){
		String linea = sc.nextLine(); 
		String [] cortarString = linea.split(";");
		
		Cliente cliente = new Cliente();
		cortarString1 = cortarString[0].split(",");
			cliente.setNombre (cortarString1[0]);
			cliente.setApellidos (cortarString1[1]);
			cliente.setDNI (cortarString1[2]);
			cliente.setNum_socio (Integer.parseInt(cortarString1[3]));
			cliente.setDto (Double.parseDouble(cortarString1[4]));
		
		Direccion direccion = new Direccion();
			cortarString2 = cortarString[1].split(",");
			direccion.setCalle  (cortarString2[0]);
			direccion.setNumeroCalle(Integer.parseInt(cortarString2[1]));
			direccion.setCodigoPostal(cortarString2[2]);
			cliente.setDireccion(direccion);

		
			

			clientes.add(cliente);
			
	}
	}
	public void ver_clientes(){
		
		for(int c=0; c<clientes.size(); c++){


			System.out.println (" \nCLIENTE Nº"+clientes.get(c).getNum_socio());
			System.out.println(" Nombre: "+clientes.get(c).getNombre() );
			System.out.println(" Apellidos: " + clientes.get(c).getApellidos());
			System.out.println(" DNI: " + clientes.get(c).getDNI());
			
			System.out.println (" \nDIRECCION ");
			System.out.println(" Calle: "+ clientes.get(c).getDireccion().getCalle());
			System.out.println(" Numero Calle: "+ clientes.get(c).getDireccion().getNumeroCalle());
			System.out.println(" Codigo Postal: "+ clientes.get(c).getDireccion().getCodigoPostal());

			System.out.println (" \n *************************************************************** ");
			System.out.println(" Numero socio: "+clientes.get(c).getNum_socio() );
			System.out.println(" Descuento: "+clientes.get(c).getDto() );



		}

	}
	
	
	

}
