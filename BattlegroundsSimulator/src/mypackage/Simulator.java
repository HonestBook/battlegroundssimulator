package mypackage;

public class Simulator {

	public static void main(String[] args) {
		Battleground ground = new Battleground();
		ground.addMinionA("SubjectA1", 2, 6);
		ground.addMinionA("SubjectA2", 3, 3);
		ground.addMinionA("SubjectA3", 6, 4);
		ground.addMinionB("SubjectB1", 3, 3);
		ground.addMinionB("SubjectB2", 7, 3);
		ground.addMinionB("SubjectB3", 3, 3);
		ground.battle();
	}
}
