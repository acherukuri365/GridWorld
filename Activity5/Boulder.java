/**
 *	@author Anirudh Cherukuri
 */

import info.gridworld.actor.actor;

public class Boulder extends Actor {
	private static final int LIFETIME_THRESHOLD = 3;
	private int lifetime;
	
	public Boulder() {
		setColor(null);
		lifetime = (int)Math.random() * 200 + 1
	}
	
	public Boulder(int lifeIn) {
		setColor(null);
		lifetime = lifeIn;
	}
	
	public void act() {
		if(lifetime >= LIFETIME_THRESHOLD) lifetime--;
		else if(lifetime == 0) {
			removeSelfFromGrid();
		}
		else setColor(red);
	}
}
