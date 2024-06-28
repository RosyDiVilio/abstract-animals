package org.lessons.java.abstractanimals;

public class Aquila extends Animale implements Vola{

	@Override
	public void verso() {
		System.out.println("Verso: Grido");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia: Conigli selvatici");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
