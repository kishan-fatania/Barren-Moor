import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Intro beginning = new Intro();
	beginning.introduction();
	
	Person p = new Person();
	p.movePlayer();
	
	Map creator = new Map();
	creator.createMap(p);
	
	}

}
