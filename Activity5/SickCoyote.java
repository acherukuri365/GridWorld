/**
 * 	@author	Anirudh Cherukuri
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.awt.Color;

public class SickCoyote extends Actor {
	private static final int LIFETIME_THRESHOLD = 10;
	private int lifetime;
	
	public SickCoyote() {
		setColor(null);
		lifetime = LIFETIME_THRESHOLD;
	}
	
	public SickCoyote(int life) {
		setColor(null);
		lifetime = life;
	}
	
	public void act() {
		if(lifetime > 0)
			lifetime--;
		else {
			Location loc = getLocation();
			Coyote c = new Coyote();
			c.putSelfInGrid(getGrid(), loc);
		}
	}
}
