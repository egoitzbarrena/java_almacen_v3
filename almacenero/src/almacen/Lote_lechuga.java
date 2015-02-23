package almacen;

import java.util.ArrayList;
import java.util.Scanner;

import almacen.Lechuga;

public class Lote_lechuga {
	
	private static Scanner sc;
	private int numLechugas;
	private static ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
	
	public void añadirLechugas() {
	    
		System.out.println(" ¿ Cuantas lechugas quieres ?");
		sc = new Scanner(System.in);
		numLechugas = sc.nextInt();
		
		for (int i = 0; i < numLechugas;i++) {
			Lechuga lechu = new Lechuga();
			lechu.añadirLechuga();
			lechugas.add(lechu);
		}
			
	}
	
	public void pintarLechugas() {
	
		for (int i = 0; i < lechugas.size();i++) {
		      
			Lechuga lechu = lechugas.get(i);
			lechu.pintarLechuga();
		}
	}	
		
	public static ArrayList<Lechuga> obtenerLechugas() {
		
		return lechugas;
	}

}