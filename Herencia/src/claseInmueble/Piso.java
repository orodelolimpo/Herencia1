package claseInmueble;

public class Piso extends Inmueble {

	// variables
	private int numHabitaciones;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;
	
	public Piso() {
		super();
		this.numHabitaciones=0;
		this.vpo=false;
		this.atico=false;
		this.antiguedad=0;
	}
	
	

	public Piso(String referencia, int metros, double valor, String descripcion, double precioM2, int numHabitaciones,
			boolean vpo, boolean atico, int antiguedad) {
		super(referencia, metros, valor, descripcion, precioM2);
		this.numHabitaciones = numHabitaciones;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}

////creo constructor de copia a mano
	
	public Piso(Piso p) {
		super(p);
		this.numHabitaciones = p.numHabitaciones;
		this.vpo = p.vpo;
		this.atico = p.atico;
		this.antiguedad = p.antiguedad;
	
	}

	public Piso(Inmueble i) {
		super(i);
		// TODO Esbozo de constructor generado automáticamente
	}

	public Piso(String referencia, int metros, double valor, String descripcion, double precioM2) {
		super(referencia, metros, valor, descripcion, precioM2);
		// TODO Esbozo de constructor generado automáticamente
	}
	//getters setters
	


	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isVpo() {
		return vpo;
	}

	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}

	public boolean isAtico() {
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
//////
	
	
	
	

	@Override
	public String getDescripcion() {
		
		return "Descripcion: "+ super.getDescripcion();//refinamiento llamo al padre igual y meto palabra para que haga algo más 
	}

	@Override
	public double calcularIBI() {
		
		double  ibi = this.getValor()*coefUrbano;
		if (this.vpo) {
			ibi=ibi-ibi*0.5;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precio= this.precioM2*this.superficie;
		if (isAtico()) {
			precio=precio+precio*0.06;
		}
		if (isVpo()&& this.antiguedad <25) {
			precio=0;
		}
		return 0;
	}



	@Override
	public String toString() {
		return "Piso [referencia=" + referencia + ", superficie=" + superficie + ", valor=" + valor + ", descripcion="
				+ descripcion + ", precioM2=" + precioM2 + ", numHabitaciones=" + numHabitaciones + ", vpo=" + vpo
				+ ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
	}

	
}
