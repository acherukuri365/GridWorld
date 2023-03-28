/**
 * 	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter {
	private int courage;
    private static final double COLOR_FACTOR = 0.05;
	
	public BlusterCritter(int c) {
		courage = c;
	}
	
	public ArrayList<Actor> getActors()
    {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		
		Location loc = getLocation();
		for(int i = loc.getRow() - 2; i <= loc.getRow() + 2; i++) {
			for(int j = loc.getCol() - 2; j <= loc.getCol() + 2; j++) {
				Location location = new Location(i, j);
				if(getGrid().isValid(location)) {
					Actor actor = getGrid().get(location);
					if(actor != null && actor != this) {
						actors.add(actor);
					}
				}
			}
		}
		return actors;
    }
    
    public void processActors(ArrayList<Actor> actors)
    {
		int count = 0;
		for(Actor a: actors) {
			if(a instanceof Critter)
				count++;
		}
		
		if(count < courage)
			lighten();
		else
			darken();
    }
    
    public void darken() {
		Color c = getColor();
        int red = (int) (c.getRed() * (1 - COLOR_FACTOR) % 255);
        int green = (int) (c.getGreen() * (1 - COLOR_FACTOR) % 255);
        int blue = (int) (c.getBlue() * (1 - COLOR_FACTOR) % 255);

        setColor(new Color(red, green, blue));
	}
	
	public void lighten() {
		Color c = getColor();
        int red = (int) (c.getRed() * (1 + COLOR_FACTOR) % 255);
        int green = (int) (c.getGreen() * (1 + COLOR_FACTOR) % 255);
        int blue = (int) (c.getBlue() * (1 + COLOR_FACTOR) % 255);

        setColor(new Color(red, green, blue));
	}
}
