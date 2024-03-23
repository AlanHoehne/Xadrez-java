package application;

import java.util.Locale;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		
	Position pos = new Position(2, 3);
	
	System.out.println(pos);
	}

}
