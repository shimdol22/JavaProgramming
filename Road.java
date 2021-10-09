package Chap6;

public class Road {
	private int speedLimit;
	Road()	{
		int a = (int)(Math.random()*5+1);
		
		switch(a) {
		case 1:
			speedLimit = 60;
			break;
		case 2:
			speedLimit = 70;
			break;
		case 3:
			speedLimit = 80;
			break;
		case 4:
			speedLimit = 100;
			break;
		case 5:
			speedLimit = 110;
			break;
		}
	}
	int getSpeedLimit() {
		return speedLimit;
	}
}
