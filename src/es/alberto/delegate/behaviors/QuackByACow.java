/**
 * 
 */
package es.alberto.delegate.behaviors;

import es.alberto.delegate.QuackBehavior;

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
