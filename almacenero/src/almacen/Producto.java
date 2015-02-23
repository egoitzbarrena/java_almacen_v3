package almacen;

public abstract class Producto {
	
	private String tipo;
	private String procedencia;
	private Integer cod_barras;
	private Distribuidor distribuidor;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public Integer getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(Integer cod_barras) {
		this.cod_barras = cod_barras;
	}

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}

}
