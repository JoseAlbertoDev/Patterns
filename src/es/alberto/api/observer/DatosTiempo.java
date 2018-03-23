/**
 * 
 */
package es.alberto.api.observer;

import java.util.Observable;

/**
 * @author jamartin
 *
 */
public final class DatosTiempo extends Observable {

	private float temperatura;
	private float presion;
	private float humedad;
	
	public DatosTiempo() {
	}

	public float getTemperatura() {
		return temperatura;
	}

	public float getPresion() {
		return presion;
	}

	public float getHumedad() {
		return humedad;
	}
	
	// Método notify con push del objeto
	public void setDatos(float temperatura, float presion, float humedad) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad = humedad;
		this.setChanged();
		this.notifyObservers(this);
	}
	
	// Método notify para hacer un pull del objeto
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
		this.setChanged();
		this.notifyObservers();
	}
	
}
