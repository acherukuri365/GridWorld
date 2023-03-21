/**	@author Anirudh Cherukuri
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    //~ private int steps;
    //~ private int sideLength;
    private int index;      //current array index
    private int numDances;  //number of times bug has finished the pattern (dance)
    private int[] turns;    //array of number of turns each step

    /**
     * Constructs a box bug that traces a square of a given side length
     */
    public DancingBug()
    {
        //~ steps = 0;
        //~ sideLength = length;
        index = 0;
        turns = new int[]{ 1, 0, 0, 0, 1, 0, 0, 3, 4, 4, 0, 0,
			1, 0, 3, 2, 0, 7, 0, 0, 0, 3, 2, 1 };
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if(numDances < 4) {
            for (int i = 0; i < turns[index]; i++) {
                turn();
            }
            move();
            index++;
            if(index == turns.length) { index = 0; numDances++; }
        }
    }
}
