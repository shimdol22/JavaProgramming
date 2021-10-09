package Chap6;

public class Speedgun {
	private int theSpeed;	//차량 현재속도 위반 여부를 위해
	
	private void ticketing(int limit) {
		if(theSpeed > limit) {
			System.out.println("\t\ticketed by"+(theSpeed-limit)+"km over");
		}
	}
	void shot(Car car) {	//Message Passing
		theSpeed = car.current_speed();
	}
	
	void monitor(Road road) {
		int limit = road.getSpeedLimit();
		System.out.println("current speed: "+theSpeed+"km\t");
		System.out.println("speed limit: "+limit+"km\t");
		//블랙박스화(캡슐화를 구현하기 위한 기능)
		
		ticketing(limit);
	}
	
	
}
