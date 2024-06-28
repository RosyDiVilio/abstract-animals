package org.lessons.java.abstractanimals;

public class main {

	public static void main(String[] args) {
		
		Cane rex = new Cane();
		System.out.println("Cane =");
		rex.mangia();
		rex.verso();
		rex.dormi();
		System.out.println("------------");
		
		Passerotto titti = new Passerotto();
		System.out.println("Passerotto =");
		titti.mangia();
		titti.verso();
		titti.dormi();
		titti.vola();
		System.out.println("------------");
		
		Aquila america = new Aquila();
		System.out.println("Aquila =");
		america.mangia();
		america.verso();
	    america.dormi();
	    america.vola();
		System.out.println("------------");
		
		Delfino flipper = new Delfino();
		System.out.println("Delfino =");
		flipper.mangia();
		flipper.verso();
		flipper.dormi();
		flipper.nuota();
		System.out.println("------------");
	
	}

}
