/**
 * 
 */
package es.alberto.delegate;

import es.alberto.delegate.behaviors.FlyWithWinds;
import es.alberto.delegate.behaviors.QuackByACow;

/**
 * @author jamartin
 *
 */
public class RareDuck extends Duck {

	public RareDuck() {
		this.flyBehavior = new FlyWithWinds();
		this.quackBehavior = new QuackByACow();
	}
	
}
