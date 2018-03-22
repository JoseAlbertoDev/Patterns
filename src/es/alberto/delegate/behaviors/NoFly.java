/**
 * 
 */
package es.alberto.delegate.behaviors;

import es.alberto.delegate.FlyBehavior;

/**
 * @author jamartin
 *
 */
public class NoFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly!");
	}

}
