/**
 * 
 */
package es.alberto.strategy.behaviors;

import es.alberto.strategy.QuackBehavior;

/**
 * @author jamartin
 *
 */
public class QuackByACow implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Muuuuu");
	}

}
