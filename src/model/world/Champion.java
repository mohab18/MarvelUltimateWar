package model.world;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;




import javax.swing.ImageIcon;

import model.abilities.Ability;
import model.effects.Effect;

@SuppressWarnings("rawtypes")
public abstract class Champion implements Damageable,Comparable {
	private String name;
	private int maxHP;
	private int currentHP;
	private int mana;
	private int maxActionPointsPerTurn;
	private int currentActionPoints;
	private int attackRange;
	private int attackDamage;
	private int speed;
	private ArrayList<Ability> abilities;
	private ArrayList<Effect> appliedEffects;
	private Condition condition;
	private Point location;
	public int number;
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Champion(String name, int maxHP, int mana, int actions, int speed, int attackRange, int attackDamage) {
		this.name = name;
		this.maxHP = maxHP;
		this.mana = mana;
		this.currentHP = this.maxHP;
		this.maxActionPointsPerTurn = actions;
		this.speed = speed;
		this.attackRange = attackRange;
		this.attackDamage = attackDamage;
		this.condition = Condition.ACTIVE;
		this.abilities = new ArrayList<Ability>();
		this.appliedEffects = new ArrayList<Effect>();
		this.currentActionPoints=maxActionPointsPerTurn;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public String getName() {
		return name;
	}

	public void setCurrentHP(int hp) {

		if (hp <= 0) {
			currentHP = 0;
			condition=Condition.KNOCKEDOUT;
			
		} 
		else if (hp > maxHP)
			currentHP = maxHP;
		else
			currentHP = hp;

	}

	
	public int getCurrentHP() {

		return currentHP;
	}

	public ArrayList<Effect> getAppliedEffects() {
		return appliedEffects;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int currentSpeed) {
		if (currentSpeed < 0)
			this.speed = 0;
		else
			this.speed = currentSpeed;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point currentLocation) {
		this.location = currentLocation;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public ArrayList<Ability> getAbilities() {
		return abilities;
	}

	public int getCurrentActionPoints() {
		return currentActionPoints;
	}

	public void setCurrentActionPoints(int currentActionPoints) {
		if(currentActionPoints>maxActionPointsPerTurn)
			currentActionPoints=maxActionPointsPerTurn;
		else 
			if(currentActionPoints<0)
			currentActionPoints=0;
		this.currentActionPoints = currentActionPoints;
	}

	public int getMaxActionPointsPerTurn() {
		return maxActionPointsPerTurn;
	}

	public void setMaxActionPointsPerTurn(int maxActionPointsPerTurn) {
		this.maxActionPointsPerTurn = maxActionPointsPerTurn;
	}

	public int compareTo(Object o)
	{
		Champion c = (Champion)o;
		if(speed==c.speed)
			return name.compareTo(c.name);
		return -1 * (speed-c.speed);
	}
	public String toString(){
		return "Name:"+getName()+"  "+"maxhp:"+getMaxHP()+"  "+"mana:"+getMana()+"  "+"actions:"+getMaxActionPointsPerTurn()
				+"  "+"speed:"+getSpeed();
	}
	public String r(){
		return "attackRange:"+getAttackRange()+"  "+"AttackDamage:"+getAttackDamage()
				+"  "+"maxtionpoints:"+getMaxActionPointsPerTurn();
	}
	public String r1(){
		return " Ability 1: "+getAbilities().get(0).getName()+"  "+" Ability 2: "+getAbilities().get(1).getName()+"  "+
      					 " Ability 3: " +getAbilities().get(2).getName();
	}
	public ImageIcon getImage(){
        if(name.equals("Deadpool")){
        	ImageIcon icon = new ImageIcon("c (2).jpeg");
        	Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
        	return new ImageIcon(scaleImage);
        }
        else if (name.equals("Spiderman")){
        	ImageIcon icon = new ImageIcon("c (6).jpeg");
        	Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
        	return new ImageIcon(scaleImage);
        }
        else if (name.equals("Thor")){
        	ImageIcon icon = new ImageIcon("Thor.jpg");
        	Image scaleImage = icon.getImage().getScaledInstance(220, 220,Image.SCALE_DEFAULT);
        	return new ImageIcon(scaleImage);
        }
        else if (name.equals("Hulk")){
        	ImageIcon icon = new ImageIcon("Hulk.jpg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Captain America")){
        	ImageIcon icon = new ImageIcon("Am.jpg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Hela")){
        	ImageIcon icon = new ImageIcon("Hela.jpeg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Dr Strange")){
        	ImageIcon icon = new ImageIcon("Dr (3).png");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Ghost Rider")){
        	ImageIcon icon = new ImageIcon("rid.png");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Iceman")){
        	ImageIcon icon = new ImageIcon("26.jfif");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Venom")){
        	ImageIcon icon = new ImageIcon("Venom.JPG");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Electro")){
        	ImageIcon icon = new ImageIcon("m (3).jpeg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Quicksilver")){
        	ImageIcon icon = new ImageIcon("24.jfif");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Yellow Jacket")){
        	ImageIcon icon = new ImageIcon("m (7).jpeg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else if (name.equals("Loki")){
        	ImageIcon icon = new ImageIcon("m (1).jpeg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
        else{
        	ImageIcon icon = new ImageIcon("Iron.jpg");
    	    Image scaleImage = icon.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
    	   return new ImageIcon(scaleImage);
        }
	}
	public ImageIcon resize(){
		ImageIcon d=this.getImage();
		 Image scaleImage = d.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
		 return new ImageIcon(scaleImage);
	}
	
public abstract void useLeaderAbility(ArrayList<Champion> targets);
}
