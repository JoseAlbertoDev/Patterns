/**
 * 
 */
package es.alberto.strategy.behaviors;

import es.alberto.strategy.FlyBehavior;

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
