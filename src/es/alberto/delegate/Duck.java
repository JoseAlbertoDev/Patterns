/**
 * 
 */
package es.alberto.delegate;

import es.alberto.delegate.behaviors.NoFly;

/**
 * @author jamartin
 *
 */
public class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
		performFly();
	}
	
	public static void main(String[] args) {
		RareDuck r = new RareDuck();
		r.performFly();
		r.performQuack();
		r.setFlyBehavior(new NoFly());
	}

}
