package org.lessons.java.abstractanimals;

public class Passerotto extends Animale{

	@Override
	public void verso() {
		System.out.println("Verso: Cip Cip!!");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia: Cereali");
	}

}
