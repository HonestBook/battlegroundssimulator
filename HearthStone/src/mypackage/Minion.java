package mypackage;
import java.lang.Math;

public class Minion {
	private int atk;
	
	// private int maxHP;
	
	private int currentHP;
	
	private boolean alive;
	
	private String name;
	
	/**
	 * Create an instance of Minion.
	 * @param name
	 * @param attack
	 * @param health
	 */
	public Minion(String name, int attack, int health) {
		this.name = name;
		atk = attack;
		currentHP = health;
		alive = true;
	}
	
	/**
	 * Return the name of this minion.
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the attack of this minion.
	 * @return
	 */
	public int getAttack() {
		return atk;
	}
	
	
	/**
	 * Return the health of this minion.
	 * @return
	 */
	public int getHealth() {
		return currentHP;
	}

	
	public void loseHP(int damage) {
		currentHP = Math.max(currentHP - damage, 0);
		if (currentHP == 0) {
			alive = false;
		}
	}
	
	public boolean isAlive() {
		return alive;
	}
}
