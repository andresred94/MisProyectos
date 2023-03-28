
public class Vehiculo {

	private boolean residente;
	private String etiqueta;

	public Vehiculo(boolean residente, String etiqueta) {
		this.residente = residente;
		this.etiqueta = etiqueta;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public boolean isResidente() {
		return residente;
	}

	public void setResidente(boolean residente) {
		this.residente = residente;
	}

	public boolean permitidoM30() {

		boolean permitido;

		if (etiqueta.equals("0") || etiqueta.equals("ECO") || residente==true) {
			permitido = true;
		} else {
			permitido = false;
		}

		return permitido;
		
		System.out.println("Hola");
		
	}
}