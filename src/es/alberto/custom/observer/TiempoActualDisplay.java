/**
 * 
 */
package es.alberto.custom.observer;

/**
 * @author jamartin
 *
 */
public class TiempoActualDisplay implements DisplayElements, Observer {

	private float temp;
	private float humedad;
	private float presion;
	private String nombreDelDispositivo;
	private Subject datosTiempo;
	
	public TiempoActualDisplay(Subject datosTiempo, String nombreDelDispositivo) {
		this.datosTiempo = datosTiempo;
		this.nombreDelDispositivo = nombreDelDispositivo;
		this.datosTiempo.registrarObserver(this);
	}	
	
	@Override
	public void update(float temp, float humedad, float presion) {
		this.temp = temp;
		this.humedad = humedad;
		this.presion = presion;
		display();
	}
	
	@Override
	public void display() {
		System.out.format("Estado actual en el dispositivo %s : T - %.1f H - %.1f P - %.1f \n", nombreDelDispositivo, temp, humedad, presion);
	}

	
	public static void main(String[] args) {
		DatosTiempo d = new DatosTiempo();
		new TiempoActualDisplay(d, "Android");
		new MiniDeviceDisplay(d);
		for (int i = 0; i < 10; i++) {
			try {
				float d1 = (float)(Math.random() * 10);
				float d2 = (float)(Math.random() * 10);
				float d3 = (float)(Math.random() * 10);
				d.setDatos(d1, d2, d3);
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.exit(0);
	}
}
