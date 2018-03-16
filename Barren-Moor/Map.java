public class Map {

	public void createMap(Person p) {

		int rows = 5;
		int cols = 5;
		String[][] map = new String[rows][cols];

		for (int i = 0; i < rows; i++) { // creating the map
			for (int j = 0; j < cols; j++) {

				int xAxis = 0;
				int yAxis = 0;

				map[i][j] = " ";
				map[4][4] = "?";
				map[p.getxAxis()][p.getyAxis()] = "P";

				System.out.print("[" + map[i][j] + "]");

			}
			System.out.println();
		}

	}

}