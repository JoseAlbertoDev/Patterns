/**
 * 
 */
package es.alberto.strategy;

import es.alberto.strategy.behaviors.FlyWithWinds;
import es.alberto.strategy.behaviors.QuackByACow;

/**
 * @author jamartin
 *
 */
public class RareDuck extends Duck {

	public RareDuck() {
		this.flyBehavior = new FlyWithWinds();
		this.quackBehavior = new QuackByACow();
	}

	@Override
	public void display() {
		System.out.println("RareDuck");
	}
	
}
