package almacen;
public class Distribuidor {
	
	private String nombre;
	private String CIF;
	private Direccion direccion;
	private Contacto personaContacto;


public String getNombre(){

	return nombre;

}


public void setNombre (String n){


	nombre=n;

}


public String getCIF (){

	return CIF;

}

public void setCIF (String ci){

	CIF=ci;

}


public Direccion getDireccion (){

	return direccion;
}

public void setDireccion (Direccion d){

	direccion=d;
}

public Contacto getPersonaContacto(){

	return personaContacto;
}

public void setPersonaContacto (Contacto pc) {

	personaContacto=pc;

}


}
