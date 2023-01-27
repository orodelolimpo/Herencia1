package claseInmueble;

import java.util.Objects;

public abstract class Inmueble { //abstract es una clase en la que no puedo crear objetos =new Inm
		
		public static final double coefUrbano=0.85;
		public static final double coefRustico=0.45;
	
	
		protected String referencia;
		protected int superficie;
		protected double valor;
		protected String descripcion;
		protected double precioM2;
		
		//constructor sin parámetros: (para qué se hace si no podemos hacer new porque voy a hacer piso que extiende a inmueble y voy a llamar a piso a través de super()
		
		public Inmueble () {
			this.referencia="";
			this.superficie=0;
			this.valor=0;
			this.descripcion="";
			this.precioM2=0;
	
		}

		public Inmueble(String referencia, int metros, double valor, String descripcion, double 						precioM2) {
			//super();//si lo pongo estoy invocando a la clase objetc//se puede marcar
			this.referencia = referencia;
			this.setSuperficie(metros);
			this.valor = valor;
			this.descripcion = descripcion;
			this.setPrecioM2(precioM2);
		}
		//constructor de copia  sirve para crear un objeto en base a otro
		public Inmueble(Inmueble i) {
			//super();//si lo pongo estoy invocando a la clase objetc//se puede marcar
			this.referencia = i.referencia;
			this.setSuperficie ()= i.superficie;
			this.valor = i.valor;
			this.descripcion = i.descripcion;
			this.precioM2 = i.precioM2;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public int getSuperficie() {
			return superficie;
		}

		public void setSuperficie(int superficie) {
			if (superficie>0) {
			this.superficie = superficie;
			}
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public double getPrecioM2() {
			return precioM2;
		}

		public void setPrecioM2(double precioM2) {
			if (precioM2>0) {
				this.precioM2 = precioM2;	
			}
			
		}

		@Override
		public String toString() {
			return "Inmueble [referencia=" + referencia + ", superficie=" + superficie + ", valor=" + valor
					+ ", descripcion=" + descripcion + ", precioM2=" + precioM2 + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(referencia);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Inmueble other = (Inmueble) obj;
			return Objects.equals(referencia, other.referencia);
		}
		public abstract double calcularIBI();
		public abstract double calculaPrecioVenta();
}
