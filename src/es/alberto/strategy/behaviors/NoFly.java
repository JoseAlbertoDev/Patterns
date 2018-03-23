/**
 * 
 */
package es.alberto.strategy.behaviors;

import es.alberto.strategy.FlyBehavior;

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
