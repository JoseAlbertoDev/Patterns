/**
 * 
 */
package es.alberto.delegate.behaviors;

import es.alberto.delegate.FlyBehavior;

/**
 * @author jamartin
 *
 */
public class FlyWithWinds implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Batiendo alas!");
	}

}
