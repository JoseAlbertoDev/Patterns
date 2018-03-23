/**
 * 
 */
package es.alberto.custom.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamartin
 *
 */
public final class DatosTiempo implements Subject{

	private List<Observer> observers;
	private float temperatura;
	private float presion;
	private float humedad;
	
	public DatosTiempo() {
		this.observers = new ArrayList<>();
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

	@Override
	public void registrarObserver(Observer o) {
		System.out.println("Nuevo observer");
		observers.add(o);
	}

	@Override
	public void desregistrarObserver(Observer o) {
		observers.remove(o);
		System.out.println("Observer desconectado");
	}

	@Override
	public void notificarObservers() {
		for (Observer o : observers) {
			o.update(temperatura, humedad, presion);
		}
	}
	
	public void setDatos(float temperatura, float presion, float humedad) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad = humedad;
		notificarObservers();
	}
	
}
