/**
 * 
 */
package es.alberto.api.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jamartin
 *
 */
public class MiniDeviceDisplay implements DisplayElements, Observer {

	private float temp;
	private Observable datosTiempo;
	
	public MiniDeviceDisplay(Observable datosTiempo) {
		this.datosTiempo = datosTiempo;
		this.datosTiempo.addObserver(this);
	}	
	
	@Override
	public void display() {
		System.out.format("La temperatura es: %.1f \n", temp);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof DatosTiempo) {
			DatosTiempo d = (DatosTiempo) arg;
			temp = d.getTemperatura();
			display();
		}
	}

}
