package Chap6;

public class Car {
	private int highestSpeed;
	//备己包拌
	Navigator Navi;		// 积己磊俊辑 按眉积己
	Car(){
		//弥绊加档
		highestSpeed = 140 + 10*((int)(Math.random()*8));		//140~210
		//匙厚积己
		Navi = new Navigator();
	}
	int getHighestSpeed() {
		return highestSpeed;
	}
	int current_speed() {
		return (int)(Math.random()*highestSpeed + 1);
	}
}
