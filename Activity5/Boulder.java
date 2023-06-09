/**
 *	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.awt.Color;

public class Boulder extends Actor {
	private static final int LIFETIME_THRESHOLD = 3;
	private int lifetime;
	
	public Boulder() {
		setColor(null);
		lifetime = (int)(Math.random() * 200 + 1);
	}
	
	public Boulder(int lifeIn) {
		setColor(null);
		lifetime = lifeIn;
	}
	
	public void act() {
		//~ if(lifetime >= LIFETIME_THRESHOLD) lifetime--;
		//~ else if(lifetime == 0) {
			//~ Location loc = getLocation();
			//~ removeSelfFromGrid();
			//~ Kaboom k = new Kaboom();
			//~ k.putSelfInGrid(getGrid(), loc);
		//~ }
		//~ else setColor(Color.RED);
		
		if(lifetime == 0) {
			Location loc = getLocation();
			//~ removeSelfFromGrid();
			Kaboom k = new Kaboom();
			k.putSelfInGrid(getGrid(), loc);
		}
		else if(lifetime < LIFETIME_THRESHOLD) setColor(Color.RED);
		
		lifetime--;
	}
}
