package org.lessons.java.abstractanimals;

public class Passerotto extends Animale implements Vola{

	@Override
	public void verso() {
		System.out.println("Verso: Cip Cip!!");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia: Cereali");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
