/**
 * 	@author Anirudh Cherukuri
 */

//~ package info.gridworld.actor;

import info.gridworld.actor.Flower;

import java.awt.Color;

/**
 * A <code>Flower</code> is an actor that darkens over time. Some actors drop
 * flowers as they move. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */

public class Blossom extends Flower
{
    //~ private static final double DARKENING_FACTOR = 0.05;
    private int lifetime;

    // lose 5% of color value in each step

    /**
     * Constructs a pink flower.
     */
    public Blossom()
    {
        setColor(Color.GREEN);
        lifetime = 10;
    }

    /**
     * Constructs a flower of a given color.
     * @param initialColor the initial color of this flower
     */
    public Blossom(int lifetimeIn)
    {
		setColor(Color.GREEN);
        lifetime = lifetimeIn;
    }

    /**
     * Causes the color of this flower to darken.
     */
    public void act()
    {
		super.act();
        lifetime--;
        if(lifetime == 0) removeSelfFromGrid();
    }
}

