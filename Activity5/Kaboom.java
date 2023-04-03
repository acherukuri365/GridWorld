/**
 *	@author Anirudh Cherukuri
 */

import info.gridworld.actor.actor;

public class Kaboom extends Actor {
	private static final int LIFETIME_THRESHOLD = 3;
	private int lifetime;
	
	public Kaboom() {
		setColor(null);
		lifetime = LIFETIME_THRESHOLD;
	}
	
	public void act() {
		if(lifetime > 0) lifetime--;
		else removeSelfFromGrid();
	}
}
