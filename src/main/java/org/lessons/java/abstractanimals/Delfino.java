package org.lessons.java.abstractanimals;

public class Delfino extends Animale implements Nuota {

	@Override
	public void verso() {
		System.out.println("Verso: Biosonar");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia: Pesci");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
		
	}

}
