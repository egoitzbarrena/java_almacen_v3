package almacen;
public class Cliente {
//propiedades

private String nombre;
private String apellidos;
private String DNI;
private Direccion direccion;
private Integer num_socio;
private Double dto;

//métodos getter y setter

public String getNombre(){

return nombre;
}


public void setNombre (String nom){

nombre=nom;

}

public String getApellidos(){

return apellidos;
}


public void setApellidos (String ape){

apellidos=ape;

}

public Direccion getDireccion(){

return direccion;
}


public void setDireccion (Direccion direc){

direccion=direc;

}

public String getDNI(){

return DNI;
}


public void setDNI (String dni){

DNI=dni;

}

public Integer getNum_socio(){

return num_socio;
}


public void setNum_socio (Integer nso){

num_socio=nso;

}

public Double getDto(){

return dto;
}


public void setDto (Double dt){

dto=dt;

}



}
