package Chap6;

public class Car {
	private int highestSpeed;
	//��������
	Navigator Navi;		// �����ڿ��� ��ü����
	Car(){
		//�ְ�ӵ�
		highestSpeed = 140 + 10*((int)(Math.random()*8));		//140~210
		//�׺����
		Navi = new Navigator();
	}
	int getHighestSpeed() {
		return highestSpeed;
	}
	int current_speed() {
		return (int)(Math.random()*highestSpeed + 1);
	}
}
