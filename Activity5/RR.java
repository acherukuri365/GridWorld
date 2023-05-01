/**
 *	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Critter;

import java.awt.Color;

public class RR extends Critter {
	public RR() {
		setColor(null);
		setDirection(0);
	}
	
	public void act() {
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location one = loc.getAdjacentLocation(getDirection());
        Location two = one.getAdjacentLocation(getDirection());
        Location three = two.getAdjacentLocation(getDirection());
        
        
        if(gr.isValid(one))
			moveTo(next);
        else
            removeSelfFromGrid();
        Blossom flower = new Blossom();
        flower.putSelfInGrid(gr, loc);
	}
}
