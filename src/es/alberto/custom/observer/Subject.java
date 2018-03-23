/**
 * 
 */
package es.alberto.custom.observer;

/**
 * @author jamartin
 *
 */
public interface Subject {
	
	void registrarObserver(Observer o);
	
	void desregistrarObserver(Observer o);

	void notificarObservers();
	
}
