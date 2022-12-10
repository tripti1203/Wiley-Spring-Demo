package assignment1;
/*
 * Here we have defined an abstract class Player and 3 sub-classes Bowler, Batsmen and WicketKeeper.
 *  We have added additional member variables and methods/functions in individual sub-classes. 
 * We have also created a constructor which initializes the member variables of the each player.
 *  The print method overrides the print method in the super-class Player and also add additional 
 *  details for Bowler, Batsman and WicketKeeper.Create an array of 11 players and initialized them 
 *  with either Batsman, Bowler and WicketKeeper and print their their details. 
 *  Please make sure, we have made the Player class abstract such that no instance of that class can be created.*/

import java.util.*;

abstract class Player{
	abstract void print();
}

class Batsman extends Player{
	private int run;
	private String batsmanName;
	public Batsman(int run, String batsmanName) {
		this.run = run;
		this.batsmanName = batsmanName;
	}
	@Override
	void print() {
		System.out.println("Total runs made by " + this.batsmanName + "  : " + this.run);
	}
	
}
class Bowlers extends Player{
	private int wickets;
	private String bowlerName;
	public Bowlers(int wickets, String bowlerName) {
		this.wickets = wickets;
		this.bowlerName = bowlerName;
	}
	@Override
	void print() {
		System.out.println("Total wickets taken by " + this.bowlerName + " : " + this.wickets);
	}
	
	
}
class WicketKeeper extends Player{
	private String keeperName;

	public WicketKeeper(String keeperName) {
		this.keeperName = keeperName;
	}

	@Override
	void print() {
		System.out.println("Name of the wicketKeeper : " + this.keeperName);
	}
	
}

public class AbstractAssignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Batsman[] man = new Batsman[11];
		for(int i=0 ; i<man.length ; i++) {
			int run = scan.nextInt();
			String name = scan.next();
			man[i] = new Batsman(run,name);
		}
		
		for(int i=0 ; i<man.length ; i++) {
			man[i].print();
		}
		scan.close();
	}

}
