package almacen;

import java.util.ArrayList;
import java.util.Scanner;

import almacen.Manzana;

public class Lote_manzana {
	
	private static Scanner sc;
	private int numManzanas;
	private static ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
	
	public void añadirManzanas() {
	    
		System.out.println(" ¿ Cuantas manzanas quieres ?");
		sc = new Scanner(System.in);
		numManzanas = sc.nextInt();
		
		for (int i = 0; i < numManzanas;i++) {
			Manzana man = new Manzana();
			man.añadirManzana();
			manzanas.add(man);
		}
			
	}
	
	public void pintarManzanas() {
	
		for (int i = 0; i < manzanas.size();i++) {
		      
			Manzana man = manzanas.get(i);
			man.pintarManzana();
		}
	}	
		
	/*public staic ArrayList<Manzana> obtenerManzanas() {
		
		for (int i = 0; i < manzanas.size();i++) {
		      
			manzanas.get(i);
			System.out.println(manzanas.size());
			
		}
		
		return manzanas;
	}
	*/
	
public static ArrayList<Manzana> obtenerManzanas() {
		
		return manzanas;

}
}
