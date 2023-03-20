/**
 * 	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int dir;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        dir = 0;
        turn();
        turn();
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
		if(dir < 3) {
			if (steps < sideLength && canMove())
			{
				move();
				steps++;
			}
			else
			{
				steps = 0;
				dir++;
				if(dir == 1) {turn(); turn(); turn();}
				else if(dir == 2) {turn(); turn(); turn(); turn(); turn();}
			}
		}
    }
}
