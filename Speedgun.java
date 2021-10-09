package Chap6;

public class Speedgun {
	private int theSpeed;	//���� ����ӵ� ���� ���θ� ����
	
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
		//���ڽ�ȭ(ĸ��ȭ�� �����ϱ� ���� ���)
		
		ticketing(limit);
	}
	
	
}
