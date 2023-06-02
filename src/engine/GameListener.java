package engine;
import model.abilities.Ability;
import model.world.Direction;


public interface GameListener {
public void onAttack(Direction d);
public void onMove(Direction d);
public void  onAbility(Ability a);
public void  onAbility(Ability a,Direction d);
public void  onAbility(Ability a,int x, int y);


}
