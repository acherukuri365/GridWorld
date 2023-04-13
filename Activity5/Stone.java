/**
 *	@author Anirudh Cherukuri
 */

//~ package info.gridworld.actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.awt.Color;

public class Stone extends Rock {
	private static final int LIFETIME_THRESHOLD = 3;
	private int lifetime;
	
	public Stone() {
		setColor(null);
		lifetime = (int)(Math.random() * 200 + 1);
	}
	
	public Stone(int lifeIn) {
		setColor(null);
		lifetime = lifeIn;
	}
	
	public void act() {
		//~ if(lifetime >= LIFETIME_THRESHOLD) lifetime--;
		//~ else if(lifetime == 0) {
			//~ Location loc = getLocation();
			//~ removeSelfFromGrid();
			//~ putSelfInGrid(new Boulder().getGrid(), loc);
		//~ }
		//~ else setColor(Color.GREEN);
		
		if(lifetime == 0) {
			Location loc = getLocation();
			//~ removeSelfFromGrid();
			Boulder b = new Boulder();
			b.putSelfInGrid(getGrid(), loc);
		}
		else if(lifetime < LIFETIME_THRESHOLD) setColor(Color.GREEN);
		
		lifetime--;
	}
}
