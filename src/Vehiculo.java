
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
		System.out.println("Hola");
		System.out.println("Prueba 2: uso de git que no es lo mismo que GitHub");
		System.out.println("Prueba 3: Ya me deja hacer el checkout, ¿y ahora qué?");
		System.out.println("Prueba 4: Ahora si vamos a subir los cambios GitHub");
		System.out.println("Prueba 5: ¿Veo estos cambios en GitHub?");
		return permitido;		
	}
}