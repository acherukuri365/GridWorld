import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;

public class SickCoyoteRunner
{
    public static void main(String[] args)
    {
        BoundedGrid<Actor> mygrid = new BoundedGrid<Actor>(10,10);
        ActorWorld world = new ActorWorld(mygrid);
        
        world.add(new Location(1, 1), new SickCoyote(2));
        world.add(new Location(8, 8), new SickCoyote(4));
        world.add(new Location(1, 8), new SickCoyote(6));
        world.add(new Location(8, 1), new SickCoyote(8));
        
        world.show();
    }
}
