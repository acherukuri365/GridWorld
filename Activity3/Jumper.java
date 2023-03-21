/**
 * 	@author Anirudh Cherukuri
 */

// package info.gridworld.actor;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * A <code>Bug</code> is an actor that can move and turn. It drops flowers as
 * it moves. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Jumper extends Bug
{
    /**
     * Constructs a blue bug.
     */
    public Jumper()
    {
        setColor(Color.BLUE);
    }

    /**
     * Moves if it can move, turns otherwise.
     */
    public void act()
    {
        super.act();
    }

    /**
     * Turns the bug 45 degrees to the right without changing its location.
     */
    public void turn()
    {
        super.turn();
    }

    /**
     * Moves the bug forward, putting a flower into the location it previously
     * occupied.
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location mid = loc.getAdjacentLocation(getDirection());
        Location next = mid.getAdjacentLocation(getDirection());
        
        if(gr.isValid(next))
			moveTo(next);
        else
            removeSelfFromGrid();
        Blossom flower = new Blossom();
        flower.putSelfInGrid(gr, loc);
    }

    /**
     * Tests whether this bug can move forward into a location that is empty or
     * contains a flower.
     * @return true if this bug can move.
     */
    public boolean canMove()
    {
        return super.canMove();
    }
}
