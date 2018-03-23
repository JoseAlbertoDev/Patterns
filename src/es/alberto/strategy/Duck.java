/**
 * 
 */
package es.alberto.strategy;

import es.alberto.strategy.behaviors.NoFly;

/**
 * @author jamartin
 *
 */
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim() {
		System.out.println("Casi todos flotan");
	}
	
	public static void main(String[] args) {
		RareDuck r = new RareDuck();
		r.performFly();
		r.setFlyBehavior(new NoFly());
		r.performFly();
	}

}
