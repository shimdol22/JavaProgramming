package Chap6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ó����� [1.Simulation 2.menu 3.1+2]
		System.out.println("[OOAD");
		
		Car k7 = new Car();
		System.out.println("�ְ�ӵ�: "+k7.getHighestSpeed());
		
		int n = k7.Navi.find_shortest_path();
		k7.Navi.monitor();
		
		System.out.println("\n---------------------speedgun monitor---------------------");
		
		for(int i=0; i<n; i++) {
			Road road = new Road();
			Speedgun police = new Speedgun();
			
			System.out.println("Road"+i+"\t");
			police.shot(k7);
			police.monitor(road);
		}
		
		/*Navi Test
		Navigator iNavi = new Navigator();
		iNavi.find_shortest_path();
		iNavi.monitor(); */
		
		/*
		Car k7 = new Car();
		System.out.println("�ְ�ӵ�: "+k7.getHighestSpeed());
		System.out.println("����ӵ�: "+k7.current_speed());
		k7.Navi.find_shortest_path();
		k7.Navi.monitor(); */
	}

}
