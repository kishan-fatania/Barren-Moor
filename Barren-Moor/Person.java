import java.util.Scanner;

public class Person {

	private int xAxis = 0;
	private int yAxis = 0;

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

	public int movePlayer() {

		boolean notAtTreasure = true;

		while (notAtTreasure) {

			Scanner sc1 = new Scanner(System.in);
			String move = sc1.nextLine();

			switch (move) {

			case "a":
				System.out.println("Your player moved west");
				return xAxis - 1;

			case "w":
				System.out.println("Your player moved north");
				return yAxis + 1;

			case "d":
				System.out.println("Your player moved east");
				return xAxis + 1;

			case "s":
				System.out.println("Your player moved south");
				return yAxis - 1;

			}
			if (xAxis == 4 && yAxis == 4) {
				notAtTreasure = false;
				return 0;
			}

			if (notAtTreasure = false) {
				System.out.println("Congratulations you win");
			}
		}
		return -1;
	}
}