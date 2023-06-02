package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sun.glass.events.KeyEvent;

import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.abilities.CrowdControlAbility;
import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.effects.Disarm;
import model.effects.Dodge;
import model.effects.Effect;
import model.effects.EffectType;
import model.effects.Embrace;
import model.effects.PowerUp;
import model.effects.Root;
import model.effects.Shield;
import model.effects.Shock;
import model.effects.Silence;
import model.effects.SpeedUp;
import model.effects.Stun;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Cover;
import model.world.Damageable;
import model.world.Direction;
import model.world.Hero;
import model.world.Villain;
import engine.Game;
import engine.GameListener;
import engine.Player;
import engine.PriorityQueue;
import exceptions.AbilityUseException;
import exceptions.ChampionDisarmedException;
import exceptions.InvalidTargetException;
import exceptions.LeaderAbilityAlreadyUsedException;
import exceptions.LeaderNotCurrentException;
import exceptions.NotEnoughResourcesException;
import exceptions.UnallowedMovementException;

public class main implements ActionListener, GameListener{
	
public	PriorityQueue t=new PriorityQueue(6);
static MUSIC music;
static  MARVEL marvel=new MARVEL();
static Player p11=new Player("S");
static Player p22=new Player("ss");
static Game  game=new Game(p11,p22);
public boolean flagStartGame=true;
public JLabel Exception=new JLabel();
boolean flagfinish=false;
boolean flagfinish1=false;
public JButton finish;
public ImageIcon image;
public JLabel endgame =new JLabel();
public JButton o1;public JButton o2;public JButton o3;public JButton o4;public JButton o5;public JButton o6;
public JButton k1;public JButton k4;public JButton k7;public JButton k10;public JButton k13;
public JButton k2;public JButton k5;public JButton k8;private JButton k11;public JButton k14;
public JButton k3;public JButton k6;public JButton k9;private JButton k12;public JButton k15;
public JButton finish1;
public JButton button1;public JButton button2;
public JButton plz;public JLabel l1;public JLabel l2;
public JButton pl;JButton currbutt;
public JButton moveup;
public JButton moveright;
public JButton moveleft;
public JButton movedown;
public JButton attackup;
public JButton attackright;
public JButton attackleft;
public JButton attackdown;
public JButton ability1;
public JButton ability2;
public JButton ability3;
public JButton abilitydup;
public JButton abilitydright;
public JButton abilitydleft;
public JButton abilityddown;
public JLabel Player11;
public JLabel Player12;
public JLabel champ1;
public JLabel champ2;
public JLabel champ11;
public JLabel champ12;JLabel champ13;JLabel champ21;JLabel champ22;JLabel champ23;
public JLabel sh3 ,sh4,sh5,sh6,sh7,sh8;
ArrayList<JLabel> ab11=new ArrayList<JLabel>() ;
public JLabel HP11;
JLabel Player1;
JLabel Player2;
public JButton select=new JButton();
int xLoc=5;
int yLoc=5;
JLabel selevtt=new JLabel();
JButton endTurn;
String dir=null; 
public JButton select1;public JButton select2;
public JButton exit;
JButton leaderab;

Cell[][] map = new Cell[5][5];
int i=0;
int j=0;
int k=0;


//Start d=new Start();
boolean flagn=false;
boolean flagn1=false;

public static ArrayList<Champion> availableChampisons;
public static ArrayList<Ability> availableAbilitiess;
public main() throws IOException{
	
	
	//marvel=new MARVEL();
	//enter=new PlayerName();
	//Start d=new Start();
	ImageIcon image2=new ImageIcon("TOjpg"); 
	pl=new JButton();
	pl.setIcon(image2);
	marvel.z.addActionListener(this);
	pl.addActionListener(this);
	HP11=new JLabel();
	HP11.setBackground(Color.GREEN); 
	game.loadAbilities("Abilities.csv");
    game.loadChampions("Champions.csv");
}


	public static void main(String[]args) throws IOException {
	
		 
		
		main s = new main();
	
	}

	public void names(){
		marvel.ii.addActionListener(this);
		marvel.jj.addActionListener(this);
				
				
	}
	
	public void marveld(){
		marvel.button_panel.setLayout(new GridLayout(5, 5));
		for(int i=4;i>=0;i--){
			   for (int j = 0; j < map[i].length; j++) {
					map[i][j] = new Cell();
					marvel.button_panel.add(map[i][j]); // adds cell to the world panel 		
				    map[i][j].addActionListener(this); 
				    //map[i][j].addActionListener(map[i][j]);
						}
					
			 } 
	
		for(int i=0;i<3;i++){
			ab11.add(new JLabel());
		}
		sh3=new JLabel();sh4=new JLabel();sh5=new JLabel();sh6=new JLabel();sh7=new JLabel();sh8=new JLabel();
		endTurn=new JButton("ENDTURN");
		endTurn.addActionListener(this);
	    
		
		leaderab=new JButton("Use LeaderAbilty");
		leaderab.addActionListener(this);
		moveup =new JButton("UP");
		
		moveup.setFont(new Font("arial",Font.BOLD,10));
		movedown =new JButton("DOWN");
		movedown.setBounds(150, 150, 30, 5);
		movedown.setFont(new Font("arial",Font.BOLD,10));
		moveright =new JButton("RIGHT");
		moveright.setBounds(220, 90, 30, 20);
		moveright.setFont(new Font("arial",Font.BOLD,10));
		moveleft =new JButton("LEFT");
		moveleft.setBounds(80, 90, 30, 20);
		moveleft.setFont(new Font("arial",Font.BOLD,10));
		movedown.addActionListener(this);
		moveup.addActionListener(this);
		moveright.addActionListener(this);
		moveleft.addActionListener(this);
		marvel.movejl.setBounds(150, 0, 30, 30);
		attackup =new JButton("UP");
		attackdown =new JButton("DOWN");
		attackright =new JButton("RIGHT");
		attackleft =new JButton("LEFT");
		attackdown.addActionListener(this);
		attackup.addActionListener(this);
		attackright.addActionListener(this);
		attackleft.addActionListener(this);
		ability1 =new JButton("Ability1");
		ability2 =new JButton("Ability2");
		ability3 =new JButton("Ability3");
		abilitydup =new JButton("UP");
		abilityddown =new JButton("DOWN");
		abilitydright =new JButton("RIGHT");
		abilitydleft =new JButton("LEFT");
		abilityddown.addActionListener(this);
		abilitydup.addActionListener(this);
		abilitydright.addActionListener(this);
		abilitydleft.addActionListener(this);
		ability1.addActionListener(this);
		ability2.addActionListener(this);
		ability3.addActionListener(this);
		
		//Show abilities champions buttons
		k1=new JButton("Quicksilver");
		k2=new JButton("Captain America");
		k3=new JButton("Electro");
		k4=new JButton("Hulk");
		k5=new JButton("Loki");
		k6=new JButton("Thor");
		k7=new JButton("Deadpool");
		k8=new JButton("Ghost Rider");
		k9=new JButton("Iceman");
		k10=new JButton("Venom");
		k11=new JButton("Dr Strange");
		k12=new JButton("Hela");
	    k13=new JButton("Ironman");
		k14=new JButton("Spiderman");
		k15=new JButton("Yellow Jacket");
		k1.setFont(new Font("Arial",Font.BOLD,30));k8.setFont(new Font("Arial",Font.BOLD,30));
		k2.setFont(new Font("Arial",Font.BOLD,30));k9.setFont(new Font("Arial",Font.BOLD,30));
		k3.setFont(new Font("Arial",Font.BOLD,30));k10.setFont(new Font("Arial",Font.BOLD,30));
		k4.setFont(new Font("Arial",Font.BOLD,30));k11.setFont(new Font("Arial",Font.BOLD,30));
		k5.setFont(new Font("Arial",Font.BOLD,30));k12.setFont(new Font("Arial",Font.BOLD,30));
		k6.setFont(new Font("Arial",Font.BOLD,30));k13.setFont(new Font("Arial",Font.BOLD,30));
		k7.setFont(new Font("Arial",Font.BOLD,30));k14.setFont(new Font("Arial",Font.BOLD,30));
		k15.setFont(new Font("Arial",Font.BOLD,30));
		k1.setBackground(new Color(46, 169, 226 ));k2.setBackground(new Color(46, 169, 226 ));
		k3.setBackground(new Color(46, 169, 226 ));k4.setBackground(new Color(46, 169, 226 ));
		k5.setBackground(new Color(46, 169, 226 ));k6.setBackground(new Color(46, 169, 226 ));
		k7.setBackground(new Color(46, 169, 226 ));k8.setBackground(new Color(46, 169, 226 ));
		k9.setBackground(new Color(46, 169, 226 ));k10.setBackground(new Color(46, 169, 226 ));
		k11.setBackground(new Color(46, 169, 226 ));k12.setBackground(new Color(46, 169, 226 ));
		k13.setBackground(new Color(46, 169, 226 ));k14.setBackground(new Color(46, 169, 226 ));
		k15.setBackground(new Color(46, 169, 226 ));marvel.abilitiesbuttons.setLayout(new GridLayout(5, 5));
		marvel.abilitiesbuttons.add(k1);marvel.abilitiesbuttons.add(k6);marvel.abilitiesbuttons.add(k11);
		marvel.abilitiesbuttons.add(k2);marvel.abilitiesbuttons.add(k7);marvel.abilitiesbuttons.add(k12);
		marvel.abilitiesbuttons.add(k3);marvel.abilitiesbuttons.add(k8);marvel.abilitiesbuttons.add(k13);
		marvel.abilitiesbuttons.add(k4);marvel.abilitiesbuttons.add(k9);marvel.abilitiesbuttons.add(k14);
		marvel.abilitiesbuttons.add(k5);marvel.abilitiesbuttons.add(k10);marvel.abilitiesbuttons.add(k15);
		k1.addActionListener(this);k6.addActionListener(this);k11.addActionListener(this);
		k2.addActionListener(this);k7.addActionListener(this);k12.addActionListener(this);
		k3.addActionListener(this);k8.addActionListener(this);k13.addActionListener(this);
		k4.addActionListener(this);k9.addActionListener(this);k14.addActionListener(this);
		k5.addActionListener(this);k10.addActionListener(this);k15.addActionListener(this);
		
		
		exit =new JButton("EXIT");
		exit.addActionListener(this);
		exit.setBackground(Color.WHITE);
		marvel.ppp.add(exit);
		
		select1=new JButton();
		select1.setText("Select");
		select1.setBackground(Color.white);
		select1.setFont(new Font("Arial",Font.BOLD,20));
		select1.setForeground(Color.black);
		select1.setEnabled(false);
		marvel.left.add(select1);
		select2=new JButton();
		select2.setText("Select");
		select2.setBackground(Color.white);
		select2.setFont(new Font("Arial",Font.BOLD,20));
		select2.setForeground(Color.black);
		select2.setEnabled(false);
		marvel.right.add(select2);
		finish=new JButton("Finish");
		finish.setFont(new Font("Arial",Font.BOLD,20));
		finish.setBackground(Color.WHITE);
		finish.setForeground(Color.black);
		finish.setLayout(null);
		marvel.down.add(finish);
		finish.setVisible(false);
		finish.addActionListener(this);
		
		
		//
		marvel.left.add(marvel.h1);
		marvel.right.add(marvel.h2);
		marvel.h1.add(marvel.h3);
		marvel.h1.add(marvel.h4);
		marvel.h1.add(marvel.h5);
		marvel.h2.add(marvel.h6);
		marvel.h2.add(marvel.h7);
		marvel.h2.add(marvel.h8);
		//
		currbutt=new JButton();
		currbutt.setText("Current champion choosen");
		currbutt.setForeground(Color.BLACK);
		currbutt.setBackground(Color.WHITE);
        currbutt.setFont(new Font("Arial",Font.BOLD,25));
		marvel.down.add(currbutt);
		currbutt.addActionListener(this);
		select1.addActionListener(this);
		select2.addActionListener(this);
		
		l1=new JLabel("Player 1 choose leader ");
		l1.setFont(new Font("arial",Font.BOLD,25));
		l1.setForeground(Color.WHITE);
		o1=new JButton();o2=new JButton();o3=new JButton();
		o1.setBackground(Color.WHITE);o2.setBackground(Color.WHITE);o3.setBackground(Color.WHITE);
		o1.setVisible(false);o2.setVisible(false);o3.setVisible(false);
		l1.setVisible(false);
		l2=new JLabel("Player 2 choose leader ");
		l2.setFont(new Font("arial",Font.BOLD,25));
		l2.setForeground(Color.WHITE);
		o4=new JButton();o5=new JButton();o6=new JButton();
		o4.setBackground(Color.WHITE);o5.setBackground(Color.WHITE);o6.setBackground(Color.WHITE);
		o4.setVisible(false);o5.setVisible(false);o6.setVisible(false);
		l2.setVisible(false);
		
		marvel.down.add(l1);
		marvel.down.add(o1);marvel.down.add(o2);marvel.down.add(o3);
		marvel.down.add(l2);
		marvel.down.add(o4);marvel.down.add(o5);marvel.down.add(o6);
		
		o1.addActionListener(this);o2.addActionListener(this);o3.addActionListener(this);
		o4.addActionListener(this);o5.addActionListener(this);o6.addActionListener(this);
		
	}
	public void showAbilities(Champion c){
		for(int i=0;i<c.getAbilities().size();i++){
			String s="";
			String s1="";
			Ability a=c.getAbilities().get(i);
			JLabel aa= ab11.get(i);
			if(a instanceof DamagingAbility){
				s += " Type :DamagingAbility ";
				DamagingAbility a1=(DamagingAbility) a;
				s1=" DamageAmount : " + a1.getDamageAmount();
			}
			if(a instanceof HealingAbility){
				s += "Type : HealingAbility ";
				HealingAbility a1=(HealingAbility) a;
				s1=" HealAmount : " + a1.getHealAmount();
			}
			if(a instanceof CrowdControlAbility){
				s += "Type : CrowdControlAbility ";
				CrowdControlAbility a1=(CrowdControlAbility) a;
				s1=" Effect : " + a1.getEffect().getName() + " Effect Duration : " + a1.getEffect().getDuration();
			}
		   s +=  "Name : " +a.getName() + " CastRange : " + a.getCastRange()  +  " ManaCost : " + a.getManaCost() + " AreaOfEffect : " + getAreaofEffectName(a.getCastArea()) +  " ActionPointsCost : " + a.getRequiredActionPoints() + " CurrentCoolDown : " + a.getCurrentCooldown() + " BaseCoolDown : " + a.getBaseCooldown() + s1;
		   aa.setText("<html><p style=\"width:200px\">"+s + "</p></html>");
		   
		   
		}
		
	}
	public String getAreaofEffectName(AreaOfEffect a){
		if(a==AreaOfEffect.DIRECTIONAL){
			return"DIRECTIONAL";
		}
		else if(a==AreaOfEffect.SELFTARGET){
			return"SELFTARGET";
		}
		else if(a==AreaOfEffect.SURROUND){
			return"SURROUND";
		}
		else if(a==AreaOfEffect.SINGLETARGET){
			return"SINGLETARGET";
		}
		else
			return"TEAMTARGET";
		
	}
	public String  Abi(Champion c){
		String s;
		s="Applied Effects : ";
		for(int i=0;i<c.getAppliedEffects().size();i++){
			s +=  "Name :" +c.getAppliedEffects().get(i).getName() + " Duration :" + c.getAppliedEffects().get(i).getDuration() + "\n";
		}
		return s;
	}
	public  static  Champion findC(String s) throws IOException{
		for(Champion c: game.getAvailableChampions()){
			if(c.getName().equals(s)){
				return c;
		}
		}
		return null;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==leaderab){
	    	   leaderability();
	       }
		if(e.getSource()==finish &&  flagStartGame){
			flagStartGame=false;
			game =new Game(p11,p22);
			ImageIcon Cover=new ImageIcon("cover (2).jpg");
			for(int i=4;i>=0;i--){
				for (int j = 0; j <=4; j++){
					JLabel HP11 =new JLabel();
					
					if(game.getBoard()[i][j] instanceof Cover){
						Damageable r=(Damageable)game.getBoard()[i][j];
						HP11.setText(String.valueOf(r.getCurrentHP()));
						map[i][j].setIcon(Cover);  
						map[i][j].add(HP11);
					}
					if(game.getBoard()[i][j] instanceof Champion){
						Damageable r=(Damageable)game.getBoard()[i][j];
						Champion c=(Champion) r;
						map[i][j].setIcon(c.getImage());
						HP11.setText(String.valueOf(r.getCurrentHP()));
						HP11.setForeground(Color.GREEN);
						map[i][j].add(HP11);
						if(i==4 && j==1){
							c.setNumber(21);
						}
						else if(i==4 && j==2){
							c.setNumber(22);
						}
						else if(i==4 && j==1){
							c.setNumber(21);
						}
						else if(i==4 && j==3){
							c.setNumber(23);
						}
						else if(i==0 && j==1){
							c.setNumber(11);
						}
						else if(i==0 && j==2){
							c.setNumber(12);
						}
						else if(i==0 && j==3){
							c.setNumber(13);
						}
					
					}
				}
			}
				 marvel.left.remove(marvel.h1);
				 marvel.right.remove(marvel.h2);
				 marvel.move.add(moveup);
				 marvel.move.add(movedown);
				 marvel.move.add(moveright);
				 marvel.move.add(moveleft);
				  marvel.move.add(marvel.movejl);
				 marvel.attack.add(attackup);
				 marvel.attack.add(attackdown);
				 marvel.attack.add(attackright);
				 marvel.attack.add(attackleft);
				
				 marvel.ability.add(ability1);
				 marvel.ability.add(ability2);
				 marvel.ability.add(ability3);
				 marvel.abilityd.add(abilitydup);
				 marvel.abilityd.add(abilityddown);
				 marvel.abilityd.add(abilitydright);
				 marvel.abilityd.add(abilitydleft);
				 
				 marvel.leadera.add(leaderab);
				 marvel.right.add(marvel.leadera);
				 marvel.right.add(marvel.move);
				 marvel.attack.add(marvel.attackjl);
				 marvel.right.add(marvel.attack);
				 marvel.abilityd.add(marvel.abilitydjl);
				 marvel.right.add(marvel.abilityd);
				 marvel.ability.add(marvel.abilityjl);
				 marvel.right.add(marvel.ability);
				
				 marvel.down.add(endTurn);
				 for(int i=0;i<game.getFirstPlayer().getTeam().size();i++){
					 Champion c1=game.getFirstPlayer().getTeam().get(i);
					 String api= Abi(game.getFirstPlayer().getTeam().get(i));;
					
					 String type;
					 if(game.getFirstPlayer().getTeam().get(i) instanceof Hero)
						 type="Hero";
					 else if(game.getFirstPlayer().getTeam().get(i) instanceof Villain)
						 type="Villain";
					 else
						 type="AntiHero";
					 if(i==0){
						 marvel.chmName11.setText("<html><p style=\"width:250px\">" +c1.getName()+"," + "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
						
						 
					 }
					 else if(i==1){
						 marvel.chmName12.setText("<html><p style=\"width:250px\">" +c1.getName()+"," + "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
						 
					 }
					 else{
						 marvel.chmName13.setText("<html><p style=\"width:250px\">" +c1.getName()+"," + "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
					
					 }
					 
				 }
				 for(int i=0;i<game.getSecondPlayer().getTeam().size();i++){
					 String api= Abi(game.getSecondPlayer().getTeam().get(i));;
					 Champion c1=game.getSecondPlayer().getTeam().get(i);
					 String type;
					 if(game.getSecondPlayer().getTeam().get(i) instanceof Hero)
						 type="Hero";
					 else if(game.getSecondPlayer().getTeam().get(i) instanceof Villain)
						 type="Villain";
					 else
						 type="AntiHero";
					 if(i==0){
						 marvel.chmName21.setText("<html><p style=\"width:250px\">" +c1.getName()+"," + "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
						 
						 
					 }
					 else if(i==1){
						 marvel.chmName22.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +  "type is:"+type +"mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
						
					 }
					 else{
						 marvel.chmName23.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +  "type is:"+type +"mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
						 
					 }
				 }
				//type

				 //appiliedeffect
				 
				 marvel.CurrChm.setText("<html><p style=\"width:250px\">" +"Current Champion is:"+game.getCurrentChampion().getName()+ "</p></html>");
				 //marvel.NextCurrChm.setText("<html><p style=\"width:200px\">" + "Next Champion is:"+game.getNextCurrentChampion().getName() + "</p></html>");
				 marvel.left.add(marvel.CurrChm);marvel.left.add(marvel.NextCurrChm);
						
                   marvel.left.add(selevtt);
				 marvel.frame.add(marvel.button_panel,BorderLayout.CENTER);
				marvel.a1.add(marvel.chmName11);
				marvel.a2.add(marvel.chmName12);
				marvel.a3.add(marvel.chmName13);
				marvel.a4.add(marvel.chmName21);
				marvel.a5.add(marvel.chmName22);
				marvel.a6.add(marvel.chmName23);
				marvel.a1.add(marvel.type11);marvel.a2.add(marvel.type12);marvel.a3.add(marvel.type13);
			 	marvel.a4.add(marvel.type21);marvel.a5.add(marvel.type22);marvel.a6.add(marvel.type23);
				marvel.a1.add(marvel.PH11);
				marvel.a2.add(marvel.PH12);
				marvel.a3.add(marvel.PH13);
			 	marvel.a4.add(marvel.PH21);
			 	marvel.a5.add(marvel.PH22);
			 	marvel.a6.add(marvel.PH23);
			 	marvel.a1.add(marvel.mana11);marvel.a2.add(marvel.mana12);marvel.a3.add(marvel.mana13);
			 	marvel.a4.add(marvel.mana21);marvel.a5.add(marvel.mana22);marvel.a6.add(marvel.mana23);
			 	marvel.a1.add(marvel.actions11);marvel.a2.add(marvel.actions12);marvel.a3.add(marvel.actions13);
			 	marvel.a4.add(marvel.actions21);marvel.a5.add(marvel.actions22);marvel.a6.add(marvel.actions23);
			 	marvel.a1.add(marvel.speed11);marvel.a2.add(marvel.speed12);marvel.a3.add(marvel.speed13);
			 	marvel.a4.add(marvel.speed21);marvel.a5.add(marvel.speed22);marvel.a6.add(marvel.speed23);
			 	marvel.a1.add(marvel.attackRange11);marvel.a2.add(marvel.attackRange12);marvel.a3.add(marvel.attackRange13);
			 	marvel.a4.add(marvel.attackRange21);marvel.a5.add(marvel.attackRange22);marvel.a6.add(marvel.attackRange23);
			 	marvel.a1.add(marvel.appliedeffects11);marvel.a2.add(marvel.appliedeffects12);marvel.a3.add(marvel.appliedeffects13);
			 	marvel.a4.add(marvel.appliedeffects21);marvel.a5.add(marvel.appliedeffects22);marvel.a6.add(marvel.appliedeffects23);
			 	int f=0;
			 	PriorityQueue tmp=new PriorityQueue(6);
				PriorityQueue tmp2=new PriorityQueue(6);
			 	while(!game.getTurnOrder().isEmpty()){
					tmp.insert(game.getTurnOrder().peekMin());
					tmp2.insert(game.getTurnOrder().remove());
				}
			 while(!tmp.isEmpty()){
				 Champion cc=(Champion) tmp.peekMin();
				 if(f==0){
					 marvel.mohamed1.setIcon(cc.resize());
				 }
				 else if(f==1){
					 marvel.mohamed2.setIcon(cc.resize());
				 }
				 else if(f==2){
					 marvel.mohamed3.setIcon(cc.resize());
				 }
				 else if(f==3){
					 marvel.mohamed4.setIcon(cc.resize());
				 }
				 else if(f==4){
					 marvel.mohamed5.setIcon(cc.resize());
				 }
				 else{
					 marvel.mohamed6.setIcon(cc.resize());
				 }
				 f++;
				 tmp.remove();
			 }
			
		     while(!tmp2.isEmpty()){
		    	 game.getTurnOrder().insert(tmp2.remove());
		     }
			 	marvel.firstName.setText(marvel.player1.getText());
			 	marvel.secondName.setText(marvel.player2.getText());
				 marvel.firstName.setVisible(true);
				 marvel.secondName.setVisible(true);
				 marvel.a1.setVisible(true);
				 marvel.a2.setVisible(true);
				 marvel.a3.setVisible(true);
				 marvel.a4.setVisible(true);
				 marvel.a5.setVisible(true);
				 marvel.a6.setVisible(true);
				 marvel.ab1.setVisible(true);
				 marvel.ab2.setVisible(true);
				 marvel.ab3.setVisible(true);
				 marvel.t.setVisible(false);
				 marvel.t1.setVisible(false);
				 marvel.t2.setVisible(false);
				 marvel.abilities.setVisible(false);
				 showAbilities((Champion)game.getTurnOrder().peekMin());
				 marvel.ab1.add(ab11.get(0));
				 marvel.ab2.add(ab11.get(1));
				 marvel.ab3.add(ab11.get(2));
				 marvel.p1.setVisible(false);
				 marvel.pp1.setVisible(false);
				 marvel.p2.setVisible(false);
				 marvel.pp2.setVisible(false);
				 marvel.right.add(marvel.gehad1);
				 marvel.right.add(marvel.gehad2);
				 marvel.right.add(marvel.gehad3);
				 marvel.right.add(marvel.gehad4);
				 marvel.right.add(marvel.gehad5);
				 marvel.right.add(marvel.gehad6);

				 marvel.frame.repaint();
				 marvel.frame.revalidate();
				 finish.setVisible(false);
				 

			 
		}
		if(e.getSource()==select1 &&i<4){
			select1.setEnabled(false);
			select2.setEnabled(false);
			
			i++;
			if(i==1){
				
				 try {
						p11.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
			    try {
					sh3.setIcon(findC(currbutt.getText()).getImage());
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			    marvel.h3.add(sh3);
				o1.setText(currbutt.getText());
				for(int p=0;p<15;p++)
					     if(currbutt.getText().equals(k1.getText())){
					    	 k1.setEnabled(false);k1.setBackground(new Color(32, 52, 226 ));}
					else if(currbutt.getText().equals(k2.getText())){
						k2.setEnabled(false);k2.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k3.getText())){
						k3.setEnabled(false);k3.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k4.getText())){
						k4.setEnabled(false);k4.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k5.getText())){
						k5.setEnabled(false);k5.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k6.getText())){
						k6.setEnabled(false);k6.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k7.getText())){
						k7.setEnabled(false);k7.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k8.getText())){
						k8.setEnabled(false);k8.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k9.getText())){
						k9.setEnabled(false);k9.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k10.getText())){
						k10.setEnabled(false);k10.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k11.getText())){
						k11.setEnabled(false);k11.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k12.getText())){
						k12.setEnabled(false);k12.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k13.getText())){
						k13.setEnabled(false);k13.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k14.getText())){
						k14.setEnabled(false);k14.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k15.getText())){
						k15.setEnabled(false);k15.setBackground(new Color(32, 52, 226 ));
					}
		}else if(i==2){
				 try {
						p11.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
				 try {
					 sh4.setIcon(findC(currbutt.getText()).getImage());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				    marvel.h4.add(sh4);
				o2.setText(currbutt.getText());
				for(int p=0;p<15;p++)
					     if(currbutt.getText().equals(k1.getText())){
					    	 k1.setEnabled(false);k1.setBackground(new Color(32, 52, 226 ));}
					else if(currbutt.getText().equals(k2.getText())){
						k2.setEnabled(false);k2.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k3.getText())){
						k3.setEnabled(false);k3.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k4.getText())){
						k4.setEnabled(false);k4.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k5.getText())){
						k5.setEnabled(false);k5.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k6.getText())){
						k6.setEnabled(false);k6.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k7.getText())){
						k7.setEnabled(false);k7.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k8.getText())){
						k8.setEnabled(false);k8.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k9.getText())){
						k9.setEnabled(false);k9.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k10.getText())){
						k10.setEnabled(false);k10.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k11.getText())){
						k11.setEnabled(false);k11.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k12.getText())){
						k12.setEnabled(false);k12.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k13.getText())){
						k13.setEnabled(false);k13.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k14.getText())){
						k14.setEnabled(false);k14.setBackground(new Color(32, 52, 226 ));
					}
					else if(currbutt.getText().equals(k15.getText())){
						k15.setEnabled(false);k15.setBackground(new Color(32, 52, 226 ));
					}
	   		}else if (i==3){
				 try {
						p11.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
				 try {
					 sh5.setIcon(findC(currbutt.getText()).getImage());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				    marvel.h5.add(sh5);
				 for(int p=0;p<15;p++)
					 if(currbutt.getText().equals(k1.getText())){
				    	 k1.setEnabled(false);k1.setBackground(new Color(32, 52, 226 ));}
				else if(currbutt.getText().equals(k2.getText())){
					k2.setEnabled(false);k2.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k3.getText())){
					k3.setEnabled(false);k3.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k4.getText())){
					k4.setEnabled(false);k4.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k5.getText())){
					k5.setEnabled(false);k5.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k6.getText())){
					k6.setEnabled(false);k6.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k7.getText())){
					k7.setEnabled(false);k7.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k8.getText())){
					k8.setEnabled(false);k8.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k9.getText())){
					k9.setEnabled(false);k9.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k10.getText())){
					k10.setEnabled(false);k10.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k11.getText())){
					k11.setEnabled(false);k11.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k12.getText())){
					k12.setEnabled(false);k12.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k13.getText())){
					k13.setEnabled(false);k13.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k14.getText())){
					k14.setEnabled(false);k14.setBackground(new Color(32, 52, 226 ));
				}
				else if(currbutt.getText().equals(k15.getText())){
					k15.setEnabled(false);k15.setBackground(new Color(32, 52, 226 ));
				}
				 if(j==3){
					    game=new Game(p11,p22);
						o3.setText(currbutt.getText());
						select1.setVisible(false);
						currbutt.setVisible(false);
						l2.setVisible(true);
						o1.setVisible(true);o2.setVisible(true);o3.setVisible(true);
						l1.setVisible(true);
						o4.setVisible(true);o5.setVisible(true);o6.setVisible(true);
				 }else{
					 
						o3.setText(currbutt.getText());
						select1.setVisible(false);
				 }
				
			
	   		
	   		}
			
		}
	   if(e.getSource()==select2 &&j<4){
		   select2.setEnabled(false);
		   select1.setEnabled(false);
			j++;
			if(j==1){
				
				 try {
						p22.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
				 try {
						sh6.setIcon(findC(currbutt.getText()).getImage());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				    marvel.h6.add(sh6);
				o4.setText(currbutt.getText());
				for(int l=0;l<15;l++)
					     if(currbutt.getText().equals(k1.getText())){
					    	 k1.setEnabled(false);k1.setBackground(new Color(255, 44, 44 ));}
					else if(currbutt.getText().equals(k2.getText())){
						k2.setEnabled(false);k2.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k3.getText())){
						k3.setEnabled(false);k3.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k4.getText())){
						k4.setEnabled(false);k4.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k5.getText())){
						k5.setEnabled(false);k5.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k6.getText())){
						k6.setEnabled(false);k6.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k7.getText())){
						k7.setEnabled(false);k7.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k8.getText())){
						k8.setEnabled(false);k8.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k9.getText())){
						k9.setEnabled(false);k9.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k10.getText())){
						k10.setEnabled(false);k10.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k11.getText())){
						k11.setEnabled(false);k11.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k12.getText())){
						k12.setEnabled(false);k12.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k13.getText())){
						k13.setEnabled(false);k13.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k14.getText())){
						k14.setEnabled(false);k14.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k15.getText())){
						k15.setEnabled(false);k15.setBackground(new Color(255, 44, 44 ));
					}
		}else if(j==2){
				 try {
						p22.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
				 try {
					 sh7.setIcon(findC(currbutt.getText()).getImage());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				    marvel.h7.add(sh7);
				o5.setText(currbutt.getText());
				for(int l=0;l<15;l++)
					     if(currbutt.getText().equals(k1.getText())){
					    	 k1.setEnabled(false);k1.setBackground(new Color(255, 44, 44 ));}
					else if(currbutt.getText().equals(k2.getText())){
						k2.setEnabled(false);k2.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k3.getText())){
						k3.setEnabled(false);k3.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k4.getText())){
						k4.setEnabled(false);k4.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k5.getText())){
						k5.setEnabled(false);k5.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k6.getText())){
						k6.setEnabled(false);k6.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k7.getText())){
						k7.setEnabled(false);k7.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k8.getText())){
						k8.setEnabled(false);k8.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k9.getText())){
						k9.setEnabled(false);k9.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k10.getText())){
						k10.setEnabled(false);k10.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k11.getText())){
						k11.setEnabled(false);k11.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k12.getText())){
						k12.setEnabled(false);k12.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k13.getText())){
						k13.setEnabled(false);k13.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k14.getText())){
						k14.setEnabled(false);k14.setBackground(new Color(255, 44, 44 ));
					}
					else if(currbutt.getText().equals(k15.getText())){
						k15.setEnabled(false);k15.setBackground(new Color(255, 44, 44 ));
					}
	   		}else{
				 try {
						p22.getTeam().add(findC(currbutt.getText()));
					   } catch (IOException e1) {
						e1.printStackTrace();
					   }
				 try {
					 sh8.setIcon(findC(currbutt.getText()).getImage());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				    marvel.h8.add(sh8);
				 for(int l=0;l<15;l++)
					 if(currbutt.getText().equals(k1.getText())){
				    	 k1.setEnabled(false);k1.setBackground(new Color(255, 44, 44 ));}
				else if(currbutt.getText().equals(k2.getText())){
					k2.setEnabled(false);k2.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k3.getText())){
					k3.setEnabled(false);k3.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k4.getText())){
					k4.setEnabled(false);k4.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k5.getText())){
					k5.setEnabled(false);k5.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k6.getText())){
					k6.setEnabled(false);k6.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k7.getText())){
					k7.setEnabled(false);k7.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k8.getText())){
					k8.setEnabled(false);k8.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k9.getText())){
					k9.setEnabled(false);k9.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k10.getText())){
					k10.setEnabled(false);k10.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k11.getText())){
					k11.setEnabled(false);k11.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k12.getText())){
					k12.setEnabled(false);k12.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k13.getText())){
					k13.setEnabled(false);k13.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k14.getText())){
					k14.setEnabled(false);k14.setBackground(new Color(255, 44, 44 ));
				}
				else if(currbutt.getText().equals(k15.getText())){
					k15.setEnabled(false);k15.setBackground(new Color(255, 44, 44 ));
				}
				 if(i==3){
					    game=new Game(p11,p22);
						
						o6.setText(currbutt.getText());
						select2.setVisible(false);
						currbutt.setVisible(false);
						l2.setVisible(true);
						o1.setVisible(true);o2.setVisible(true);o3.setVisible(true);
						l1.setVisible(true);
						o4.setVisible(true);o5.setVisible(true);o6.setVisible(true);
				 }else {
					 
						o6.setText(currbutt.getText());
						select2.setVisible(false);
						
				 }
				 
				
			}
		
	
		}
		
		
		
		      
		
		if(e.getSource()==attackup){
	     	onAttack(Direction.UP);
	        }
	        if(e.getSource()==attackdown){
	     	   onAttack(Direction.DOWN);
	       }
	       if(e.getSource()==attackright){
	     	   onAttack(Direction.RIGHT);
	        }
	       if(e.getSource()==attackleft){
	           onAttack(Direction.LEFT);
	       }
	       for(int i=4;i>=0;i--){
				for(int j=0;j<=4;j++){
					if(e.getSource()==map[i][j]){
						marvel.left.remove(selevtt);
					 if(game.getBoard()[i][j]!=null){	
						Damageable g=(Damageable)game.getBoard()[i][j];
						if(g instanceof Cover){
							selevtt.setText("Cover" + " " + g.getCurrentHP());
						}
						else{
							Champion ff=(Champion) g;
							selevtt.setText(ff.getName() + " " );
						}
						xLoc=i;
						yLoc=j;
						
					}
					 else{
						 selevtt.setText("null");
					 }
					 marvel.left.add(selevtt);
					}
				}
			}
	       if(e.getSource()==endTurn){
	    	   endTurn();
	       }
	       if(e.getSource()==abilitydup){
				dir="u";
			}
			 if(e.getSource()==abilitydleft){
				 dir="l";
			}
			if(e.getSource()==abilitydright){
				dir="r";
			}
			if(e.getSource()==abilityddown){
				dir="d";
			}
			if(e.getSource()==exit){
				System.exit(0);
			}
			if(e.getSource()==ability3){
				Champion c=game.getCurrentChampion();
				Ability a=c.getAbilities().get(2);
				if(a.getCastArea()==AreaOfEffect.SELFTARGET || a.getCastArea()==AreaOfEffect.TEAMTARGET  || a.getCastArea()==AreaOfEffect.SURROUND){
					onAbility(a);
				}
				if(a.getCastArea()==AreaOfEffect.SINGLETARGET){
					onAbility(a,xLoc,yLoc);
				}
				if(a.getCastArea()==AreaOfEffect.DIRECTIONAL){
					if(dir=="u"){
						onAbility(a,Direction.UP);
					}
					else if(dir=="l"){
						onAbility(a,Direction.LEFT);
					}
					else if(dir=="r"){
						onAbility(a,Direction.RIGHT);
					}
					else if(dir=="d"){
						onAbility(a,Direction.DOWN);
					}
					else
						JOptionPane.showMessageDialog(marvel.frame,"Choose a Direction First");
					
				}
			}
			if(e.getSource()==ability2){
				Champion c=game.getCurrentChampion();
				Ability a=c.getAbilities().get(1);
				if(a.getCastArea()==AreaOfEffect.SELFTARGET || a.getCastArea()==AreaOfEffect.TEAMTARGET  || a.getCastArea()==AreaOfEffect.SURROUND){
					onAbility(a);
				}
				if(a.getCastArea()==AreaOfEffect.SINGLETARGET ){
					onAbility(a,xLoc,yLoc);
				}
				if(a.getCastArea()==AreaOfEffect.DIRECTIONAL){
					if(dir=="u"){
						onAbility(a,Direction.UP);
					}
					else if(dir=="l"){
						onAbility(a,Direction.LEFT);
					}
					else if(dir=="r"){
						onAbility(a,Direction.RIGHT);
					}
					else if(dir=="d"){
						onAbility(a,Direction.DOWN);
					}
					else
						JOptionPane.showMessageDialog(marvel.frame,"Choose a Direction First");
					
				}
			}
			if(e.getSource()==ability1){
				Champion c=game.getCurrentChampion();
				Ability a=c.getAbilities().get(0);
				if(a.getCastArea()==AreaOfEffect.SELFTARGET || a.getCastArea()==AreaOfEffect.TEAMTARGET  || a.getCastArea()==AreaOfEffect.SURROUND){
					onAbility(a);
				}
				if(a.getCastArea()==AreaOfEffect.SINGLETARGET){
					onAbility(a,xLoc,yLoc);
				}
				if(a.getCastArea()==AreaOfEffect.DIRECTIONAL){
					if(dir=="u"){
						onAbility(a,Direction.UP);
					}
					else if(dir=="l"){
						onAbility(a,Direction.LEFT);
					}
					else if(dir=="r"){
						onAbility(a,Direction.RIGHT);
					}
					else if(dir=="d"){
						onAbility(a,Direction.DOWN);
					}
					else
						JOptionPane.showMessageDialog(marvel.frame,"Choose a Direction First");
					
				}
				
			}
			
		
			 	if(e.getSource()==o1){
				    game.getSecondPlayer().setLeader(game.getSecondPlayer().getTeam().get(0));
					marvel.a4.setBackground(new Color(132, 255, 102));
					l1.setVisible(false);
					o1.setVisible(false);
					o2.setVisible(false);
					o3.setVisible(false);
				
			    }
			 	if(e.getSource()==o2){
					  game.getSecondPlayer().setLeader(game.getSecondPlayer().getTeam().get(1));
					marvel.a5.setBackground(new Color(132, 255, 102));
					l1.setVisible(false);
					o1.setVisible(false);
					o2.setVisible(false);
					o3.setVisible(false);
				}
				if(e.getSource()==o3){
					  game.getSecondPlayer().setLeader(game.getSecondPlayer().getTeam().get(2));
					marvel.a6.setBackground(new Color(132, 255, 102));
					l1.setVisible(false);
					o1.setVisible(false);
					o2.setVisible(false);
					o3.setVisible(false);
				}
				if(e.getSource()==o4){
					game.getFirstPlayer().setLeader(game.getFirstPlayer().getTeam().get(0));
					marvel.a1.setBackground(new Color(132, 255, 102));
					l2.setVisible(false);
					o4.setVisible(false);
					o5.setVisible(false);
					o6.setVisible(false);
					finish.setVisible(true);
				}
				if(e.getSource()==o5){
					marvel.a2.setBackground(new Color(132, 255, 102));
					game.getFirstPlayer().setLeader(game.getFirstPlayer().getTeam().get(1));
					l2.setVisible(false);
					o4.setVisible(false);
					o5.setVisible(false);
					o6.setVisible(false);
					finish.setVisible(true);
				}
				if(e.getSource()==o6){
					marvel.a3.setBackground(new Color(132, 255, 102));
					game.getFirstPlayer().setLeader(game.getFirstPlayer().getTeam().get(2));
					l2.setVisible(false);
					o4.setVisible(false);
					o5.setVisible(false);
					o6.setVisible(false);
					finish.setVisible(true);
				
				}
		if(e.getSource()==k1){
        try {
				select1.setEnabled(true);
				select2.setEnabled(true);
			
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k1.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k1.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
				
		}
		if(e.getSource()==k2){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k2.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k2.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==k3){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k3.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k3.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k4){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k4.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k4.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k5){
			try {
				select1.setEnabled(true);
				select2.setEnabled(true);
				
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k5.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k5.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k6){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k6.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());currbutt.setText(k6.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k7){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k7.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k7.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k8){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k8.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k8.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k9){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k9.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k9.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k10){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k10.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k10.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k11){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k11.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k11.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k12){
			try {
				
				select1.setEnabled(true);
				select2.setEnabled(true);
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k12.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k12.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==k13){
			try {
				select1.setEnabled(true);
				select2.setEnabled(true);
				
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k13.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());currbutt.setText(k13.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}if(e.getSource()==k14){
			try {
				select1.setEnabled(true);
				select2.setEnabled(true);
				
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k14.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());currbutt.setText(k14.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==k15){
			try {
				select1.setEnabled(true);
				select2.setEnabled(true);
				
				marvel.t.setText(null);
				marvel.t1.setText(null);
				marvel.t2.setText(null);
				Champion c=(Champion)findC(k15.getText());
				marvel.t.setText(c.toString());
				marvel.t1.setText(c.r());
				marvel.t2.setText(c.r1());
				currbutt.setText(k15.getText());
			    
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
		if(e.getSource()==marvel.z){
			marvel.z.setVisible(false);
			marvel.frame.remove(marvel.start);
			marvel.p.setVisible(true);marvel.panel.setVisible(true);
			marvel.frame.add(marvel.p);
			marvel.frame.add(marvel.panel);
			
			names();
			
		}
		if(e.getSource()==marvel.ii){
			flagn=true;
			p11=new Player(marvel.player1.getText());
			marvel.ii.setVisible(false);
			marvel.player1.setVisible(false);
			marvel.firstName.setText(marvel.player2.getText()+"  "+ "Champion is");
			marvel.pp1.setText(marvel.player1.getText());

			if(flagn1){
				
				marvel.frame.remove(marvel.p);
				marvel.frame.remove(marvel.panel);
				marvel.frame.add(marvel.up,BorderLayout.NORTH);
				marvel.frame.add(marvel.left,BorderLayout.WEST);
				marvel.frame.add(marvel.right,BorderLayout.EAST);
				marvel.frame.add(marvel.down,BorderLayout.SOUTH);
				marvel.frame.add(marvel.abilities,BorderLayout.CENTER);
				marvel.frame.revalidate();
				marvel.frame.repaint();
				marveld();
			}
		}
		if(e.getSource()==marvel.jj){
			flagn1=true;
			p22=new Player(marvel.player2.getText());
			marvel.jj.setVisible(false);
			marvel.player2.setVisible(false);
			marvel.secondName.setText(marvel.player1.getText()+"  "+ "Champion is");
			marvel.pp2.setText(marvel.player2.getText());

			if(flagn){
				
	  		    marvel.frame.remove(marvel.p);
	  		    marvel.frame.remove(marvel.panel);
				marvel.frame.add(marvel.up,BorderLayout.NORTH);
				marvel.frame.add(marvel.left,BorderLayout.WEST);
				marvel.frame.add(marvel.right,BorderLayout.EAST);
				marvel.frame.add(marvel.down,BorderLayout.SOUTH);
				marvel.frame.add(marvel.abilities,BorderLayout.CENTER);
				marvel.frame.repaint();
				marvel.frame.revalidate();
				marveld();
			}
		
		}
		
	
        if(e.getSource()==moveup){
        	onMove(Direction.UP);
        }
        if(e.getSource()==movedown){
        	onMove(Direction.DOWN);
        	}
        if(e.getSource()==moveright){
        	onMove(Direction.RIGHT);
        	}
        if(e.getSource()==moveleft){
            onMove(Direction.LEFT);
            }
		

		
		  
	
	}
	
	public void onMove(Direction d) {
	 if(d==Direction.UP){	
		  try {
		  
			Champion c=(Champion) game.getTurnOrder().peekMin();
			System.out.println(c.getName());
			int x=c.getLocation().x;
			int y=c.getLocation().y;
			ImageIcon cc=(ImageIcon) map[x][y].getIcon();
			JLabel sj=(JLabel) map[x][y].getComponent(0);
			game.move(Direction.UP);
			setGraphics(c);
			map[x+1][y].setIcon(cc);
			map[x+1][y].add(sj);
			map[x][y].remove(sj);
			map[x][y].setIcon(null);
		  
			
		    
			
		  } 
		  catch (NotEnoughResourcesException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
			
		  } 
		  catch (UnallowedMovementException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			  e.printStackTrace();
			
		  }
	 }
	 else if(d==Direction.DOWN){
		  try {
			    Champion c=(Champion) game.getTurnOrder().peekMin();
				System.out.println(c.getName());
				int x=c.getLocation().x;
				int y=c.getLocation().y;
				ImageIcon cc=(ImageIcon) map[x][y].getIcon();
				JLabel sj=(JLabel) map[x][y].getComponent(0);
				game.move(Direction.DOWN);
				setGraphics(c);
				 map[x-1][y].setIcon(cc);
				 map[x-1][y].add(sj);
				 map[x][y].remove(sj);
				 map[x][y].setIcon(null);
		  }
		  catch (NotEnoughResourcesException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		
		  } 
		  catch (UnallowedMovementException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
			
		  }
	 }
	 else if(d==Direction.RIGHT){
		  try {
			  Champion c=(Champion) game.getTurnOrder().peekMin();
				System.out.println(c.getName());
				int x=c.getLocation().x;
				int y=c.getLocation().y;
				JLabel sj=(JLabel) map[x][y].getComponent(0);
				ImageIcon cc=(ImageIcon) map[x][y].getIcon();
		        game.move(Direction.RIGHT);
		        setGraphics(c);
				map[x][y+1].setIcon(cc);
				map[x][y+1].add(sj);
				map[x][y].remove(sj);
				map[x][y].setIcon(null);
		  }
		  catch (NotEnoughResourcesException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		  } 
		  catch (UnallowedMovementException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		  }
	 }
	 else{
		  try {
			  Champion c=(Champion) game.getTurnOrder().peekMin();
				System.out.println(c.getName());
				int x=c.getLocation().x;
				int y=c.getLocation().y;
				JLabel sj=(JLabel) map[x][y].getComponent(0);
				ImageIcon cc=(ImageIcon) map[x][y].getIcon();
				game.move(Direction.LEFT);
				setGraphics(c);
			    map[x][y-1].setIcon(cc);
				map[x][y-1].add(sj);
				map[x][y].remove(sj);
				map[x][y].setIcon(null);
		  } 
		  catch (NotEnoughResourcesException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		  }
		  catch (UnallowedMovementException e) {
			  JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		  }
	 }
		
		
	}


	@Override
	public void onAttack(Direction d) {
		ArrayList<Damageable> targets1=new ArrayList<Damageable>();
		Champion c=(Champion) game.getTurnOrder().peekMin();
		int range=c.getAttackRange();
		int x1=c.getLocation().x;
		int y1=c.getLocation().y;
		for (int i = 0; i < range; i++){
		 if(d==Direction.LEFT)
			 y1--;
		 if(d==Direction.RIGHT)
			 y1++;
		 if(d==Direction.UP)
			 x1++;
		 if(d==Direction.DOWN)
			 x1--;
			if(x1<0 || x1>4 || y1<0 || y1>4){
				break;
			}
			if(game.getBoard()[x1][y1]!=null){
				Damageable d1= (Damageable)game.getBoard()[x1][y1] ;
				if(game.getBoard()[x1][y1] instanceof Cover){
					
					targets1.add(d1);
					break;
				}
				if(game.getBoard()[x1][y1] instanceof Champion){
					Champion c1=(Champion) game.getBoard()[x1][y1];
					if(game.getFirstPlayer().getTeam().contains(c) && game.getFirstPlayer().getTeam().contains(c1)){
						continue;
					}
					else if(game.getSecondPlayer().getTeam().contains(c) && game.getSecondPlayer().getTeam().contains(c1)){
						continue;
					}
					else{
						targets1.add(d1);
						break;
					}
				}
			}
		}
		try {
			game.attack(d);
			AfterAbility(targets1);
			setGraphics(c);
			checkgameover();
		} catch (NotEnoughResourcesException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (ChampionDisarmedException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (InvalidTargetException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		}
		 
		
	}
    @Override
	public void onAbility(Ability a) {
		ArrayList<Damageable> targets1=new ArrayList<Damageable>();
		if(a.getCastArea()==AreaOfEffect.SELFTARGET){
			try {
				Champion c=(Champion) game.getTurnOrder().peekMin();
				int x=c.getLocation().x;
				int y=c.getLocation().y;
				game.castAbility(a);
				setGraphics(c);
				Damageable d1=(Damageable)(game.getBoard()[x][y]);
			     int hp=d1.getCurrentHP();
			     JLabel pla=(JLabel) map[x][y].getComponent(0);
			      pla.setText(String.valueOf(hp));
			      checkgameover();
			     
			} catch (NotEnoughResourcesException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (AbilityUseException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			}
		}
		else if(a.getCastArea()==AreaOfEffect.TEAMTARGET){
			
			Champion c=(Champion) game.getTurnOrder().peekMin();
			if(inFirst(c)){
					if(a instanceof DamagingAbility || (a instanceof CrowdControlAbility && ((CrowdControlAbility) a).getEffect().getType() == EffectType.DEBUFF ) )
						for(int i=0;i<game.getSecondPlayer().getTeam().size();i++){
							targets1.add(game.getSecondPlayer().getTeam().get(i));
						}
					else
						for(int i=0;i<game.getFirstPlayer().getTeam().size();i++){
							targets1.add(game.getFirstPlayer().getTeam().get(i));
						}
			}
			else{
				if(a instanceof DamagingAbility || (a instanceof CrowdControlAbility && ((CrowdControlAbility) a).getEffect().getType() == EffectType.DEBUFF ))
					for(int i=0;i<game.getFirstPlayer().getTeam().size();i++){
						targets1.add(game.getFirstPlayer().getTeam().get(i));
					}
				else
					for(int i=0;i<game.getSecondPlayer().getTeam().size();i++){
						targets1.add(game.getSecondPlayer().getTeam().get(i));
					}
			}
			try {
				game.castAbility(a);
				Champion c1=(Champion)targets1.get(1) ;
				System.out.println(c1.getName());
				AfterAbility(targets1);
				checkgameover();
					setGraphics(c);
			} catch (NotEnoughResourcesException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (AbilityUseException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			}
		}
		if(a.getCastArea()==AreaOfEffect.SURROUND){
			Champion c=(Champion) game.getTurnOrder().peekMin();
			int x=c.getLocation().x;
			int y=c.getLocation().y;
		    if(x<4 &&	y<4 ){
		    	if(game.getBoard()[x+1][y+1]!=null)
		    	   targets1.add((Damageable) game.getBoard()[x+1][y+1]);
		    }
		    if(x<4 && y>0){
		    	if(game.getBoard()[x+1][y-1]!=null)
		    	   targets1.add((Damageable) game.getBoard()[x+1][y-1]);
		    }
		    if(x<4){
		    	if(game.getBoard()[x+1][y]!=null)
		    	     targets1.add((Damageable) game.getBoard()[x+1][y]);
		    }
		    if(y<4 && x>0){
		    	if(game.getBoard()[x-1][y+1]!=null)
		    	     targets1.add((Damageable) game.getBoard()[x-1][y+1]);
		    }
		    if( y>0 && x>0){
		    	if(game.getBoard()[x-1][y-1]!=null)
		    	       targets1.add((Damageable) game.getBoard()[x-1][y-1]);
		    }
		    if( x>0){
		    	if(game.getBoard()[x-1][y]!=null)
		    	    targets1.add((Damageable) game.getBoard()[x-1][y]);
		    }
		    if(y<4){
		    	if(game.getBoard()[x][y+1]!=null)
		    	     targets1.add((Damageable) game.getBoard()[x][y+1]);
		    }
		    if(y>0){
		    	if(game.getBoard()[x][y-1]!=null)
		    	         targets1.add((Damageable) game.getBoard()[x][y-1]);
		    }
			try {
				for(int i=0;i<targets1.size();i++){
					 
					 
					 System.out.println("x" + targets1.get(i).getLocation().x + "   y" +targets1.get(i).getLocation().y);
				
					 
				 
			 }
				game.castAbility(a);
				
				AfterAbility(targets1);
				setGraphics(c);
				checkgameover();
			} catch (NotEnoughResourcesException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (AbilityUseException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			}
		}
		
	}

    public void setGraphics(Champion c1){
    	String api=Abi(c1);
    	String type="";
    	 if(c1 instanceof Hero)
			 type="Hero";
		 else if(c1 instanceof Villain)
			 type="Villain";
		 else
			 type="AntiHero";
     if(c1.getCurrentHP()==0){
    	 if(c1.getNumber()==11){
    		 marvel.chmName11.setVisible(false);
    		 marvel.a1.setVisible(false);
    		 marvel.down.remove(marvel.chmName11);
    	 }
         if(c1.getNumber()==12){
        	 marvel.chmName12.setVisible(false);
        	 marvel.a2.setVisible(false);
        	 marvel.down.remove(marvel.chmName12);
    	 }
         if(c1.getNumber()==13){
        	 marvel.chmName13.setVisible(false);
        	 marvel.a3.setVisible(false);
        	 marvel.down.remove(marvel.chmName13);
    	 }
         if(c1.getNumber()==21){
        	 marvel.chmName21.setVisible(false);
        	 marvel.a4.setVisible(false);
        	 marvel.up.remove(marvel.chmName21);
    	 }
        if(c1.getNumber()==22){
        	
        	 marvel.chmName22.setVisible(false);
        	 marvel.a5.setVisible(false);
        	 marvel.up.remove(marvel.chmName22);
    	 }
         if(c1.getNumber()==23){
        	 marvel.chmName23.setVisible(false);
        	 marvel.a6.setVisible(false);
        	 marvel.up.remove(marvel.chmName23);
    	 }
     }
     else{
    	if(c1.getNumber()==11){
    		
    		 marvel.chmName11.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +  "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
			
			 
 		}
 		else if(c1.getNumber()==12){
 			marvel.chmName12.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +  "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
 		}
 		else if(c1.getNumber()==13){
 			marvel.chmName13.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +   "type is:"+type +"mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
 		}
 		else if(c1.getNumber()==21){
 			marvel.chmName21.setText("<html><p style=\"width:250px\">" +c1.getName()+"," + "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
 		}
 		else if(c1.getNumber()==22){
 			marvel.chmName22.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +   "type is:"+type +"mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
 		}
 		else if(c1.getNumber()==23){
 			marvel.chmName23.setText("<html><p style=\"width:250px\">" +c1.getName()+"," +  "type is:"+type + "mana="+c1.getMana()+"," + "actionsPoint="+c1.getCurrentActionPoints()+"," + "speed="+c1.getSpeed()+"," + "attackRange="+c1.getAttackRange()+"," + "attackDamage="+c1.getAttackDamage()+"," + api+ "</p></html>");
 		}
     }
    }
	@Override
	public void onAbility(Ability a, Direction d){
		ArrayList<Damageable> targets1=new ArrayList<Damageable>();
				System.out.println("plz");
				Champion c=(Champion) game.getTurnOrder().peekMin();
				int range=a.getCastRange();
				//System.out.println(c.getName());
				int x1=c.getLocation().x;
				int y1=c.getLocation().y;
				for (int i = 0; i < range; i++){
				 if(d==Direction.LEFT)
					 y1--;
				 if(d==Direction.RIGHT)
					 y1++;
				 if(d==Direction.UP)
					 x1++;
				 if(d==Direction.DOWN)
					 x1--;
					if(x1<0 || x1>4 || y1<0 || y1>4){
						break;
					}
					if(game.getBoard()[x1][y1]!=null){
						Damageable d1=(Damageable)(game.getBoard()[x1][y1]);
					  if(a instanceof DamagingAbility ){
						  
						  if(game.getBoard()[x1][y1] instanceof Cover){
								targets1.add(d1);
							}
						  if(game.getBoard()[x1][y1] instanceof Champion){
								Champion c1=(Champion) game.getBoard()[x1][y1];
								if((inFirst(c) && inSecond(c1)) || (inFirst(c1) && inSecond(c)))
									targets1.add(d1);	
							}
					  }
					  else if(a instanceof HealingAbility || (a instanceof CrowdControlAbility && ((CrowdControlAbility) a).getEffect().getType() == EffectType.BUFF )) {
						  if(game.getBoard()[x1][y1] instanceof Champion){
								Champion c1=(Champion) game.getBoard()[x1][y1];
								if((inFirst(c) && inFirst(c1)) || (inSecond(c1) && inSecond(c)))
									targets1.add(d1);	
							}
					  }
					  else{
						  if(game.getBoard()[x1][y1] instanceof Champion){
								Champion c1=(Champion) game.getBoard()[x1][y1];
								if((inFirst(c) && inSecond(c1)) || (inFirst(c1) && inSecond(c)))
									targets1.add(d1);	
							}
					  }
						  
						
						
					}
				}
				
		   try {
			   
				game.castAbility(a,d);
				 AfterAbility(targets1);
				checkgameover();
				
				 setGraphics(c);
			} catch (NotEnoughResourcesException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (AbilityUseException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
				e.printStackTrace();
			}
			
		
		
	}

   public void AfterAbility(ArrayList<Damageable> targets1){
	   
	   for(int i=0;i<targets1.size();i++){
			Damageable d1=(Damageable)targets1.get(i);
             if(game.getBoard()[d1.getLocation().x][d1.getLocation().y]!=null){
			    
			     int hp=d1.getCurrentHP();
			     JLabel pla=(JLabel) map[d1.getLocation().x][d1.getLocation().y].getComponent(0);
			      pla.setText(String.valueOf(hp));
			     
				
				}
				else{
					if(map[d1.getLocation().x][d1.getLocation().y].getComponentCount()!=0){
					   if(map[d1.getLocation().x][d1.getLocation().y].getComponent(0)!=null){
						   map[d1.getLocation().x][d1.getLocation().y].remove(0);
					   }
					   map[d1.getLocation().x][d1.getLocation().y].setIcon(null);
					}
				}
             if(d1 instanceof Champion )
			      setGraphics((Champion)d1);
            
		    
		}
   }
	@Override
	public void onAbility(Ability a, int x, int y) {
		try {
			Champion c=(Champion) game.getTurnOrder().peekMin();
			int range=Math.abs(c.getLocation().x-x)+Math.abs(c.getLocation().y-y);
			game.castAbility(a, x, y);
			setGraphics(c);
              if(game.getBoard()[x][y]!=null){
            	  Damageable d1=(Damageable)(game.getBoard()[x][y]);
			   if(a instanceof DamagingAbility || a instanceof HealingAbility)	{
				   
				 	int hp=d1.getCurrentHP();
				     JLabel pla=(JLabel) map[x][y].getComponent(0);
				     pla.setText(String.valueOf(hp));
			   }
			 	
			 	
			 	if(d1 instanceof Champion){
			 		Champion c1=(Champion )d1;
			 		setGraphics(c1);
			 	
			 	}
			   
			      
				
				}
				else{
					if(map[x][y].getComponentCount()!=0){
					   if(map[x][y].getComponent(0)!=null){
						   map[x][y].remove(0);
					   }
					   map[x][y].setIcon(null);
					}
				}
              checkgameover();
			
			
		} catch (NotEnoughResourcesException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (AbilityUseException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (InvalidTargetException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		}
		
	}
	public boolean inFirst(Champion c){
		if(game.getFirstPlayer().getTeam().contains(c)){
			return true;
		}
		else 
			return false;
	}
	public boolean inSecond(Champion c){
		if(game.getSecondPlayer().getTeam().contains(c)){
			return true;
		}
		else 
			return false;
	}
	public void checkgameover(){
		if(game.checkGameOver()!=null){
			
			marvel.frame.setLayout(new FlowLayout(FlowLayout.CENTER));
			marvel.frame.getContentPane().setBackground(Color.BLACK);
			marvel.frame.remove(marvel.right);
			marvel.frame.remove(marvel.left);
			marvel.frame.remove(marvel.up);
			marvel.frame.remove(marvel.down);
			marvel.frame.remove(marvel.button_panel);
			marvel.ppp.setVisible(true);
			marvel.pp.setVisible(true);
			marvel.lll.setText("The winner is " + game.checkGameOver().getName());	
			marvel.frame.revalidate();
			marvel.frame.repaint();
			
			
			
		}
	}
	public void leaderability(){
		ArrayList<Damageable> targets1=new ArrayList<Damageable>();
		for(int i=4;i>=0;i--){
			   for (int j = 0; j <5; j++) {
					if(game.getBoard()[i][j]!=null){
						targets1.add((Damageable) game.getBoard()[i][j]);
					}
				}
					
			 } 
		try {
			game.useLeaderAbility();
			AfterAbility(targets1);
			setGraphics((Champion) game.getTurnOrder().peekMin());
			
		} catch (LeaderNotCurrentException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		} catch (LeaderAbilityAlreadyUsedException e) {
			JOptionPane.showMessageDialog(marvel.frame, e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void endTurn(){
		int f=0;
		Champion c=(Champion) game.getTurnOrder().peekMin();
		setGraphics(c);
		marvel.mohamed1.setIcon(null);
		marvel.mohamed2.setIcon(null);
		marvel.mohamed3.setIcon(null);
		marvel.mohamed4.setIcon(null);
		marvel.mohamed5.setIcon(null);
		marvel.mohamed6.setIcon(null);
		
		game.endTurn();
		PriorityQueue tmp=new PriorityQueue(6);
		PriorityQueue tmp2=new PriorityQueue(6);
		
		c=(Champion) game.getTurnOrder().peekMin();
		setGraphics(c);
		for(int i=0;i<3;i++){
			ab11.get(0).setText("");
		}
		showAbilities(c);
		 marvel.ab1.add(ab11.get(0));
		 marvel.ab2.add(ab11.get(1));
		 marvel.ab3.add(ab11.get(2));
		 marvel.CurrChm.setText("<html><p style=\"width:250px\">" +"Current Champion is:"+game.getCurrentChampion().getName()+ "</p></html>");
		 while(!game.getTurnOrder().isEmpty()){
				tmp.insert(game.getTurnOrder().peekMin());
				tmp2.insert(game.getTurnOrder().remove());
			}
		 while(!tmp.isEmpty()){
			 Champion cc=(Champion) tmp.peekMin();
			 if(f==0){
				 marvel.mohamed1.setIcon(cc.resize());
			 }
			 else if(f==1){
				 marvel.mohamed2.setIcon(cc.resize());
			 }
			 else if(f==2){
				 marvel.mohamed3.setIcon(cc.resize());
			 }
			 else if(f==3){
				 marvel.mohamed4.setIcon(cc.resize());
			 }
			 else if(f==4){
				 marvel.mohamed5.setIcon(cc.resize());
			 }
			 else{
				 marvel.mohamed6.setIcon(cc.resize());
			 }
			 f++;
			 tmp.remove();
		 }
		
	     while(!tmp2.isEmpty()){
	    	 game.getTurnOrder().insert(tmp2.remove());
	     }
		
		 
	
	}
}
