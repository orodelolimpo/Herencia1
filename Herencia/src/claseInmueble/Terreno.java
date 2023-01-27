package claseInmueble;

public class Terreno extends Inmueble{
	
	private boolean rustico;
	private double superficieHa;
	private double precioHa;

	//constructor sin parámetros:
	
	public Terreno() {
		super();
		this.rustico=false;
		this.superficieHa=0;
		this.precioHa=0;
	}
	
	//constructor con parámetros:


	public Terreno(String referencia, int metros, double valor, String descripcion, double precioM2, boolean rustico,
			double superficieHa, double precioHa) {
		super(referencia, metros, valor, descripcion, precioM2);
		this.rustico = rustico;
		this.superficieHa = superficieHa;
		this.precioHa = precioHa;
	}

	
	//getters y setters


	public boolean isRustico() {
		return rustico;
	}

	public void setRustico(boolean rustico) {
		this.rustico = rustico;
	}

	public double getSuperficieHa() {
		return superficieHa;
	}

	public void setSuperficieHa(double superficieHa) {
		this.superficieHa = superficieHa;
	}

	public double getPrecioHa() {
		return precioHa;
	}

	public void setPrecioHa(double precioHa) {
		this.precioHa = precioHa;
	}
	
	////
	
	@Override
	public String toString() {
		return "Terreno [referencia=" + referencia + ", superficie=" + superficie + ", valor=" + valor
				+ ", descripcion=" + descripcion + ", precioM2=" + precioM2 + ", rustico=" + rustico + ", superficieHa="
				+ superficieHa + ", precioHa=" + precioHa + "]";
	}
	
	
	@Override
	public double calcularIBI() {
		double ibi= 0;
		if (rustico) {
			ibi=this.valor*coefRustico;
		}else {
			ibi=this.valor*coefUrbano;
		}
		return ibi;
	}
	@Override
	public double calculaPrecioVenta() {
		double precio = this.precioHa*this.superficieHa;
		if (!isRustico()) {
			precio=precio+this.superficie*this.precioM2;
		}
		return precio;
	}

}
