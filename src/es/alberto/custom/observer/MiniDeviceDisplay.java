/**
 * 
 */
package es.alberto.custom.observer;

/**
 * @author jamartin
 *
 */
public class MiniDeviceDisplay implements DisplayElements, Observer {

	private float temp;
	private Subject datosTiempo;
	
	public MiniDeviceDisplay(Subject datosTiempo) {
		this.datosTiempo = datosTiempo;
		this.datosTiempo.registrarObserver(this);
	}
	
	
	@Override
	public void update(float temp, float humedad, float presion) {
		this.temp = temp;
		display();
	}

	
	@Override
	public void display() {
		System.out.format("La temperatura es: %.1f \n", temp);
	}

}
