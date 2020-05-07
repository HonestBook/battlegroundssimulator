package mypackage;

public class Main {
	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		
		simulator.addMinion(new Minion("±¨±¨B1", 3, 3, 2), Player.pB);
		simulator.addMinion(new Minion("±¨±¨B2", 2, 2, 2), Player.pB);
		simulator.addMinion(new Minion("¥∆¿œª¢", 1, 1, 1), Player.pB);
		simulator.addMinion(new Minion("±¨±¨A1", 2, 2, 2), Player.pA);
		simulator.addMinion(new Minion("∑≠±∂¡˙", 2, 4, 2), Player.pA);
		simulator.addMinion(new Minion("’–≥±”„", 3, 2, 1), Player.pA);
		simulator.addMinion(new Minion(" ØÃ¡”„", 2, 3, 1), Player.pA);
		simulator.addMinion(new Minion("¿œ Û", 2, 2, 2), Player.pA);
		
//		simulator.addMinion(new Minion("◊”À√", 2, 2, 2), Player.pB);
//		simulator.addMinion(new Minion("’–≥±”„B1", 3, 2, 1), Player.pB);
//		simulator.addMinion(new Minion("’–≥±”„B2", 2, 1, 1), Player.pB);
//		simulator.addMinion(new Minion("–°”„»À", 1, 1, 1), Player.pB);
//		simulator.addMinion(new Minion("≥∞∑Ì¡˙", 3, 4, 1), Player.pB);
//		simulator.addMinion(new Minion("π‹¿Ì‘±", 3, 3, 2), Player.pB);
//		simulator.addMinion(new Minion("±¨±¨", 4, 6, 2), Player.pA);
//		simulator.addMinion(new Minion("ª˙–µ±™", 4, 3, 2), Player.pA);	
//		simulator.addMinion(new Minion("ø÷¿«", 2, 2, 1), Player.pA);	
//		simulator.addMinion(new Minion("¿œ Û", 3, 2, 2), Player.pA);	
		simulator.Simulate(1000);
	}
}
