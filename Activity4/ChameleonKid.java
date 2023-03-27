import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {
	public ArrayList<Actor> getActors()
    {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		
		Actor actor = getGrid().get(getLocation().getAdjacentLocation(Location.NORTH));
		if(actor != null) actors.add(actor);
		
		actor = getGrid().get(getLocation().getAdjacentLocation(Location.SOUTH));
		if(actor != null) actors.add(actor);
		
        return actors;
    }
}
