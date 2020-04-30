package mypackage;

import java.util.ArrayList;
import java.util.Random;
import java.lang.StringBuffer;

public class Battleground {
	private ArrayList<Minion> minionsA;
	private ArrayList<Minion> minionsB;

	Random random = new Random();

	public Battleground() {
		minionsA = new ArrayList<>();
		minionsB = new ArrayList<>();
	}

	public void battle() {
		printStartingPosition();
		battlePhase();
		printBattleResult();
	}

	/**
	 * Print the position at the start of battle.
	 */
	private void printStartingPosition() {
		System.out.println("Starting Position");
		StringBuffer bufferA = new StringBuffer("PlayerA: ");
		for (Minion minion : minionsA) {
			bufferA.append(minion.getAttack());
			bufferA.append("-");
			bufferA.append(minion.getHealth());
			bufferA.append("  ");
		}
		StringBuffer bufferB = new StringBuffer("PlayerB: ");
		for (Minion minion : minionsB) {
			bufferB.append(minion.getAttack());
			bufferB.append("-");
			bufferB.append(minion.getHealth());
			bufferB.append("  ");
		}
		System.out.println(bufferB.toString());
		System.out.println(bufferA.toString());
		System.out.println("Battle!");
	}

	/**
	 * The battle phase of a battle.
	 */
	private void battlePhase() {
		// A flag indicating whose turn to attack.
		// True if this is player A's turn to attack.
		boolean turn = true;
		// There is a fifty percent chance that player B starts first.
		if (random.nextInt(100) < 50) {
			turn = false;
		}

		// Count which minion of each player to attack.
		int atkCounterA = 0;
		int atkCounterB = 0;

		while (battleViable()) {
			Minion attacker = null;
			Minion defender = null;
			// If attacker is dead, set this to 1 to correct the attack counter.
			int counterAmender = 0;

			if (turn) {
				// If the last minion is killed when it is about to attack,
				// Set the attack counter to 0.
				if (atkCounterA >= minionsA.size()) {
					atkCounterA = 0;
				}
				// Get the attacker and the defender.
				attacker = minionsA.get(atkCounterA);
				int defenderIndex = random.nextInt(this.minionsB.size());
				defender = minionsB.get(defenderIndex);

				attack(attacker, defender);

				// Remove any dead minion from the lists.
				if (!attacker.isAlive()) {
					counterAmender = 1;
					System.out.println(attacker.getName() + " is dead.");
					minionsA.remove(atkCounterA);
				}
				if (!defender.isAlive()) {
					System.out.println(defender.getName() + " is dead.");
					minionsB.remove(defenderIndex);
				}
				// Increment the attack counter only if there exists minions of playerA.
				if (minionsA.size() > 0) {
					atkCounterA = (atkCounterA + 1 - counterAmender) % minionsA.size();
				}
			} else {
				// If the last minion is killed when it is about to attack,
				// Set the attack counter to 0.
				if (atkCounterB >= minionsB.size()) {
					atkCounterB = 0;
				}
				// Get the attacker and the defender.
				attacker = minionsB.get(atkCounterB);
				int defenderIndex = random.nextInt(minionsA.size());
				defender = minionsA.get(defenderIndex);
				attack(attacker, defender);
				// Remove any dead minion from the lists.
				if (!attacker.isAlive()) {
					counterAmender = 1;
					System.out.println(attacker.getName() + " is dead.");
					minionsB.remove(atkCounterA);
				}
				if (!defender.isAlive()) {
					System.out.println(defender.getName() + " is dead.");
					minionsA.remove(defenderIndex);
				}
				// Increment the attack counter only if there exists minions of playerB.
				if (minionsB.size() > 0) {
					atkCounterB = (atkCounterB + 1 - counterAmender) % minionsB.size();
				}
			}
			turn = !turn;
		}
	}

	/**
	 * Print the result of a battle.
	 */
	private void printBattleResult() {
		StringBuffer buffer = new StringBuffer("Result: ");
		if (minionsA.size() > 0) {
			buffer.append("PlayerA wins!");
		} else if (minionsB.size() > 0) {
			buffer.append("PlayerB wins!");
		} else {
			buffer.append("Draw!");
		}
		System.out.println(buffer.toString());
	}

	/**
	 * One attack in a battle. Both minions involved loses HP equivalent to the
	 * other's attack.
	 * 
	 * @param attacker
	 * @param defender
	 */
	public void attack(Minion attacker, Minion defender) {
		attacker.loseHP(defender.getAttack());
		defender.loseHP(attacker.getAttack());
		System.out.println(attacker.getName() + " attacked " + defender.getName() + ".");
	}

	/**
	 * Return a list of minions of player A.
	 * 
	 * @return
	 */
	public ArrayList<Minion> getMinionsA() {
		return minionsA;
	}

	/**
	 * Return a list of minions of player B.
	 * 
	 * @return
	 */
	public ArrayList<Minion> getMinionsB() {
		return minionsB;
	}

	/**
	 * Create a minion and add it to minions of player A.
	 * 
	 * @param name
	 * @param attack
	 * @param health
	 */
	public void addMinionA(String name, int attack, int health) {
		minionsA.add(new Minion(name, attack, health));
	}

	/**
	 * Create a minion and add it to minions of player B.
	 * 
	 * @param name
	 * @param attack
	 * @param health
	 */
	public void addMinionB(String name, int attack, int health) {
		minionsB.add(new Minion(name, attack, health));
	}

	/**
	 * Add an existing minion to player A.
	 * 
	 * @param newMinion
	 */
	public void addMinionA(Minion newMinion) {
		minionsA.add(newMinion);
	}

	/**
	 * Add an existing minion to player B.
	 * 
	 * @param newMinion
	 */
	public void addMinionB(Minion newMinion) {
		minionsB.add(newMinion);
	}

	/**
	 * Return if the battle will continue. The battle continues when both players
	 * have at least one minion.
	 * 
	 * @return
	 */
	public boolean battleViable() {
		return (minionsA.size() > 0 && minionsB.size() > 0);
	}
}
