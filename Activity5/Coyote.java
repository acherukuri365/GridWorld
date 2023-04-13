/**
 *	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Critter;

import java.awt.Color;

public class Coyote extends Critter {
	private int steps;
	private boolean sleep;
	private boolean hitWall;
	public Coyote() {
		setColor(null);
		int mult = (int)(Math.random() * 7);
		int dir = mult * 45;
		setDirection(dir);
		steps = 0;
		sleep = false;
		hitWall = false;
	}
	
	public void act() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		if(sleep) {
			if(steps == 5) {
				int mult = (int)(Math.random() * 7);
				int dir = mult * 45;
				setDirection(dir);
				
				if(!hitWall) {
					Location loc = getLocation();
					while(gr.isValid(loc) && gr.get(loc) != null) {
						mult = (int)(Math.random() * 7);
						dir = mult * 45;
						loc = getLocation().getAdjacentLocation(dir);
					}
					
					Stone stone = new Stone();
					if(gr.isValid(loc) && !getLocation().equals(loc))
						stone.putSelfInGrid(gr, loc);
				}
				else hitWall = false;
				sleep = false;
				steps = 0;
			}
			else steps++;
		}
		else if(steps < 5) {
			if(!sleep) {
				Location loc = getLocation();
				Location next = loc.getAdjacentLocation(getDirection());
				
				
				if(gr.isValid(next) && gr.get(next) == null)
					makeMove(next);
				else if(gr.isValid(next) && gr.get(next) instanceof Boulder){
					Kaboom k = new Kaboom();
					k.putSelfInGrid(getGrid(), next);
				}
				else {
					sleep = true;
					hitWall = true;
					steps = 0;
				}
			}
			
			steps++;
		}
		else {
			//~ Location loc = getLocation();
			//~ while(gr.isValid(loc) && gr.get(loc) != null) {
				//~ int mult = (int)(Math.random() * 7);
				//~ int dir = mult * 45;
					//~ loc = getLocation().getAdjacentLocation(dir);
			//~ }
			
			//~ Stone stone = new Stone();
			//~ if(gr.isValid(loc) && !getLocation().equals(loc))
				//~ stone.putSelfInGrid(gr, loc);
			
			//~ int mult = (int)(Math.random() * 7);
			//~ int dir = mult * 45;
			//~ setDirection(dir);
			
			sleep = true;
			steps = 0;
		}
	}
}
