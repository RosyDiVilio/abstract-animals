package org.lessons.java.abstractanimals;

public class main {

	public static void main(String[] args) {
		
		Cane rex = new Cane();
		System.out.println("Cane =");
		System.out.println("Mangia: " + rex.mangia());
		System.out.println("Verso: " + rex.dormi());
		System.out.println("------------");
		
		Passerotto titti = new Passerotto();
		System.out.println("Passerotto =");
		System.out.println("Mangia: " + titti.mangia());
		System.out.println("Verso: " + titti.dormi());
		System.out.println("------------");
		
		Aquila america = new Aquila();
		System.out.println("Aquila =");
		System.out.println("Mangia: " + america.mangia());
		System.out.println("Verso: " + america.dormi());
		System.out.println("------------");
		
		Delfino flipper = new Delfino();
		System.out.println("Delfino =");
		System.out.println("Mangia: " + flipper.mangia());
		System.out.println("Verso: " + flipper.dormi());
		System.out.println("------------");
	
	}

}
