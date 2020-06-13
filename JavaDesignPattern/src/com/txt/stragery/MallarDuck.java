package com.txt.stragery;

public class MallarDuck extends Duck {

	public MallarDuck() {
	}

	public MallarDuck(QuackBehavior inQuackBehavior, FlyBehavior inFlyBehavior) {
		super(inQuackBehavior, inFlyBehavior);
	}

	@Override
	public void display() {
		System.out.println("Look like a MallarDuck");
	}
}