package Chap6;

public class Navigator {
	private int shortestPath;
	int find_shortest_path() {
		shortestPath = 5 + (int)(Math.random()*6); 		//5~10
		return shortestPath;
	}
	void monitor() {
		System.out.println("\n------------------- navigator -----------------------");
		System.out.println(" NO. of roads in the shortest path:"+shortestPath);
		System.out.println("\n-----------------------------------------------------");
	
	}
}
