package mypackage;

public class Simulator {

	public static void main(String[] args) {
		Battleground ground = new Battleground();
//		ground.addMinion(new Minion("����B1", 3, 3), Player.pB);
//		ground.addMinion(new Minion("����B2", 2, 2), Player.pB);
//		ground.addMinion(new Minion("���ϻ�", 1, 1), Player.pB);
//		ground.addMinion(new Minion("����A1", 2, 2), Player.pA);
//		ground.addMinion(new Minion("������", 2, 4), Player.pA);
//		ground.addMinion(new Minion("�г���", 3, 2), Player.pA);
//		ground.addMinion(new Minion("ʯ����", 2, 3), Player.pA);
//		ground.addMinion(new Minion("����", 2, 2), Player.pA);
		ground.addMinion(new Minion("����", 2, 2, 2), Player.pB);
		ground.addMinion(new Minion("�г���B1", 3, 2, 1), Player.pB);
		ground.addMinion(new Minion("�г���B2", 2, 1, 1), Player.pB);
		ground.addMinion(new Minion("С����", 1, 1, 1), Player.pB);
		ground.addMinion(new Minion("������", 3, 4, 1), Player.pB);
		ground.addMinion(new Minion("����Ա", 3, 3, 2), Player.pB);
		ground.addMinion(new Minion("����", 4, 6, 2), Player.pA);
		ground.addMinion(new Minion("��е��", 4, 3, 2), Player.pA);	
		ground.addMinion(new Minion("����", 2, 2, 1), Player.pA);	
		ground.addMinion(new Minion("����", 3, 2, 2), Player.pA);	
		ground.combat();
	}
}
