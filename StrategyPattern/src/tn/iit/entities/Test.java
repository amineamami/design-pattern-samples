package tn.iit.entities;

public class Test {
	
	
	public static void main(String[] args) {
		
		Individu chevalier = new Chevalier();
		Individu archer = new Archer();
		Individu reine = new Reine();
		chevalier.display();
		chevalier.combattre();
		archer.display();
		archer.combattre();
		reine.display();
		reine.combattre();
		
	}

}
