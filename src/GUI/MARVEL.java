package GUI;
import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import model.world.Champion;

import java.awt.event.*;
import java.util.*;
import java.awt.Point;

import engine.Player;


public class MARVEL implements ActionListener{
	public String  FirstChamp1;
	public String  FirstChamp2;
	public String  FirstChamp3;
	public String  SecondChamp1;
	public String  SecondChamp2;
	public String  SecondChamp3;
	public JFrame frame;public JPanel button_panel;
	public JButton ii;
	public JButton z;
	public JButton jj;
	public JPanel down;public JPanel left;
	public JPanel start;
	public JPanel up;public JPanel right;
	public JPanel move;
	public JPanel attack;
	public JLabel movejl;
	public JLabel attackjl;
	public JPanel abilityd;
	public JLabel abilitydjl;
	public JPanel p1;public JPanel p2;
    public JLabel pp1;public JLabel pp2;
	public TextField t;public TextField t1;public TextField t2;
	public JPanel CenterDown;public JPanel championphotopanel;
	public JPanel abilities;public JPanel abilitiesbuttons;public JPanel abilitiespanel;
	public JLabel press;
	public JLabel H1;public JLabel V1;public JLabel AH1;
	public JLabel H2;public JLabel V2;public JLabel AH2;
	public JButton startmusic;public JButton stopmusic;
	public int i=0;int j=0;public TextField player1leader;public TextField player2leader;
	public JMenuBar menuBar;public JMenu movemenu;public JMenu attackmenu;
	public JMenuItem UP;public JMenuItem DOWN;public JMenuItem RIGHT;public JMenuItem LEFT;
	public JMenuItem UP2;public JMenuItem DOWN2;public JMenuItem RIGHT2;public JMenuItem LEFT2;
	public TextField player1;public TextField player2;
	public JLabel chmName11;public JLabel chmName12;public JLabel chmName13;
	public JLabel chmName21;public JLabel chmName22;public JLabel chmName23;
	public JLabel PH11;public JLabel PH12;public JLabel PH13;
	public JLabel PH21;public JLabel PH22;public JLabel PH23;
	public JLabel firstName;JLabel secondName;
	public JPanel a1;public JPanel a2;public JPanel a3;public JPanel a4;public JPanel a5;public JPanel a6;
	public JLabel mana11;JLabel mana12;JLabel mana13;
	public JLabel mana21;JLabel mana22;JLabel mana23;
	public JLabel actions11;JLabel actions12;JLabel actions13;
	public JLabel actions21;JLabel actions22;JLabel actions23;
	public JLabel speed11;JLabel speed12;JLabel speed13;
	public JLabel speed21;JLabel speed22;JLabel speed23;
	public JLabel attackRange11;JLabel attackRange12;JLabel attackRange13;
	public JLabel attackRange21;JLabel attackRange22;JLabel attackRange23;
	public JLabel attackDamage11;JLabel attackDamage12;JLabel attackDamage13;
	public JLabel attackDamage21;JLabel attackDamage22;JLabel attackDamage23;
	public JLabel appliedeffects11;JLabel appliedeffects12;JLabel appliedeffects13;
	public JLabel appliedeffects21;JLabel appliedeffects22;JLabel appliedeffects23;
	public JLabel type11;JLabel type12;JLabel type13;JLabel type21;JLabel type22;JLabel type23;
	public JPanel ability;	public JPanel ab1;public JPanel ab2;public JPanel ab3;
	public JLabel abilityjl;
	public JPanel GameOver;
	public JPanel p;
	public JPanel panel;
	public JPanel h1;
	public JPanel h2;
	public JPanel h3;
	public JPanel h4;
	public JPanel h5;
	public JPanel h6;
	public JPanel h7;
	public JPanel h8;
	public JPanel pp;
	public JPanel ppp;
	public JLabel ll;
	public JLabel lll;
	public JLabel d;
	public JLabel CurrChm; public JLabel NextCurrChm;
	public JPanel gehad1;
	public JPanel gehad2;
	public JPanel gehad3;
	public JPanel gehad4;
	public JPanel gehad5;
	public JPanel gehad6;
	public JLabel mohamed1;public JLabel mohamed2;public JLabel mohamed3;
	public JLabel mohamed4;public JLabel mohamed5;public JLabel mohamed6;
	 public JPanel leadera;

	public MARVEL(){
		
		
		leadera=new JPanel();
		gehad1=new JPanel();
		gehad1.setPreferredSize(new Dimension(195,78));
		gehad1.setBackground(Color.green);
		gehad2=new JPanel();
		gehad2.setPreferredSize(new Dimension(195,78));
		gehad2.setBackground(Color.WHITE);
		gehad3=new JPanel();
		gehad3.setPreferredSize(new Dimension(195,78));
		gehad3.setBackground(Color.WHITE);
		gehad4=new JPanel();
		gehad4.setPreferredSize(new Dimension(195,78));
		gehad4.setBackground(Color.WHITE);
		gehad5=new JPanel();
		gehad5.setPreferredSize(new Dimension(195,78));
		gehad5.setBackground(Color.WHITE);
		gehad6=new JPanel();
		gehad6.setPreferredSize(new Dimension(195,78));
		gehad6.setBackground(Color.WHITE);
		
		mohamed1=new JLabel();mohamed2=new JLabel();mohamed3=new JLabel();
		mohamed4=new JLabel();mohamed5=new JLabel();mohamed6=new JLabel();
		gehad1.add(mohamed1);
		gehad2.add(mohamed2);
		gehad3.add(mohamed3);
		gehad4.add(mohamed4);
		gehad5.add(mohamed5);
		gehad6.add(mohamed6);
		//gameover
		ll=new JLabel();
		ll.setIcon(new ImageIcon("5 (1).jpg"));
		pp=new JPanel();
		pp.setPreferredSize(new Dimension(1500,700));
		pp.setBackground(Color.black);
		pp.add(ll);
		ppp=new JPanel();
		ppp.setPreferredSize(new Dimension(1500,600));
		ppp.setBackground(Color.black);
		lll=new JLabel();
		lll.setFont(new Font("arial",Font.BOLD,30));
		lll.setForeground(Color.white);	
		ppp.add(lll);
		ppp.setVisible(false);
		pp.setVisible(false);
		
		//set game frame
		frame=new JFrame();  
		start= new JPanel();
		start.setBackground(new Color(16, 73, 123));
		move=new JPanel();
		move.setBackground(Color.white);
		movejl=new JLabel();
		movejl.setText("Move");
		movejl.setFont(new Font("arial",Font.BOLD,20));
		movejl.setForeground(Color.BLACK);
		movejl.setLayout(new FlowLayout(FlowLayout.LEADING));
		attack=new JPanel();
			attackjl=new JLabel();
			attackjl.setText("Attack");
			attackjl.setBackground(Color.WHITE);
			attackjl.setFont(new Font("arial",Font.BOLD,20));
			attackjl.setForeground(Color.black);
			attackjl.setSize(300, 70);
			attackjl.setLayout(new FlowLayout(FlowLayout.LEADING));
	        ability=new JPanel();
			abilityjl=new JLabel();
			abilityjl.setText("Ability");
			abilityjl.setBackground(Color.WHITE);
			abilityjl.setFont(new Font("arial",Font.BOLD,20));
			abilityjl.setForeground(Color.black);
			abilityjl.setSize(300, 70);
			abilityjl.setLayout(new FlowLayout(FlowLayout.LEADING));
			abilityd=new JPanel();
			abilitydjl=new JLabel();
			abilitydjl.setText("Ability");
			abilitydjl.setBackground(Color.WHITE);
			abilitydjl.setFont(new Font("arial",Font.BOLD,20));
			abilitydjl.setForeground(Color.black);
			abilitydjl.setSize(300, 70);
			abilitydjl.setLayout(new FlowLayout(FlowLayout.LEADING));
		p= new JPanel();
		frame.add(p,BorderLayout.NORTH);
		p.setPreferredSize(new Dimension(100,150));
		p.setBackground(Color.BLACK);
		panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setBackground(Color.BLACK);
		frame.add(pp,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.SOUTH);
		frame.add(ppp,BorderLayout.SOUTH);
		panel.setPreferredSize(new Dimension(100,150));
		player1=new TextField();
		player1.setPreferredSize(new Dimension(185,25));
		player1.setBackground(Color.WHITE);
		player1.setFont(new Font("Arial",Font.BOLD,15));
		player1.setForeground(Color.black);
		player1.setText("Player 1");
		ii=new JButton("Done");
		jj=new JButton("Done");
		ii.setBackground(Color.WHITE);
		jj.setBackground(Color.WHITE);
		player2=new TextField();
	    player2.setPreferredSize(new Dimension(185,25));
		player2.setBackground(Color.WHITE);
		player2.setFont(new Font("Arial",Font.BOLD,15));
		player2.setForeground(Color.black);
		player2.setText("Player 2");
		d=new JLabel();
		d.setIcon(new ImageIcon("5 (1).jpg"));
		d.setLayout(null);
		panel.add(player1);
		panel.add(ii);
		panel.add(player2);
		panel.add(jj);
		panel.add(d);
		p.setVisible(false);
		panel.setVisible(false);
		frame.add(panel);
		frame.add(p);
		button_panel=new JPanel();
		ImageIcon image=new ImageIcon("11.png"); 
		frame.setTitle("MARVEL");
		frame.setIconImage(image.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1500,1000);
		frame.setResizable(true);
		frame.getContentPane().setBackground(new Color(218,252,249));
		frame.validate();
		up=new JPanel();
		left=new JPanel();
		right=new JPanel();
		down=new JPanel();
		CenterDown=new JPanel();
	
		
		
		p1=new JPanel();
		p1.setPreferredSize(new Dimension(350,50));
		p1.setBackground(Color.BLACK);
		left.add(p1);
		pp1=new JLabel("player 1 select");
		pp1.setForeground(Color.WHITE);
		pp1.setFont(new Font("Arial",Font.BOLD,25));
		p1.add(pp1);
		p2=new JPanel();
		p2.setPreferredSize(new Dimension(350,50));
		p2.setBackground(Color.BLACK);
		right.add(p2);
		pp2=new JLabel("player 2 select");
		pp2.setForeground(Color.WHITE);
		pp2.setFont(new Font("Arial",Font.BOLD,25));
		p2.add(pp2);
		//set main 5 panels of the game
		up.setBackground(new Color(16, 73, 123));
		left.setBackground(new Color(16, 73, 123));
		right.setBackground(new Color(16, 73, 123));
		down.setBackground(new Color(16, 73, 123));
		button_panel.setBackground(Color.WHITE);
		up.setPreferredSize(new Dimension(100,140));
		up.setLayout(new FlowLayout(FlowLayout.CENTER));
		left.setPreferredSize(new Dimension(350,500));
		left.setLayout(new FlowLayout(FlowLayout.CENTER));
		right.setPreferredSize(new Dimension(350,100));
		right.setLayout(new FlowLayout(FlowLayout.CENTER));
		down.setPreferredSize(new Dimension(100,150));
		down.setLayout(new FlowLayout(FlowLayout.CENTER));
		h1=new JPanel();
		h1.setBackground(Color.BLACK);
		h1.setPreferredSize(new Dimension(300,500));
		h2=new JPanel();
		h2.setBackground(Color.BLACK);
		h2.setPreferredSize(new Dimension(300,500));
		h3=new JPanel();
		h3.setBackground(new Color(0, 226, 236 ));
		h3.setPreferredSize(new Dimension(300,165));
		h4=new JPanel();
		h4.setBackground(new Color(0, 226, 236 ));
		h4.setPreferredSize(new Dimension(300,165));
		h5=new JPanel();
		h5.setBackground(new Color(0, 226, 236 ));
		h5.setPreferredSize(new Dimension(300,165));
		h6=new JPanel();
		h6.setBackground(new Color(0, 226, 236 ));
		h6.setPreferredSize(new Dimension(300,165));
		h7=new JPanel();
		h7.setBackground(new Color(0, 226, 236 ));
		h7.setPreferredSize(new Dimension(300,165));
		h8=new JPanel();
		h8.setBackground(new Color(0, 226, 236 ));
		h8.setPreferredSize(new Dimension(300,165));
		
		
	    
	    //center panel for showing champions ability
		abilities=new JPanel();
		abilities.setBackground(new Color(184, 72, 50));
		abilities.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.add(abilities,BorderLayout.CENTER);
		//buttons for players
		abilitiesbuttons=new JPanel();
		abilitiesbuttons.setBackground(Color.black);
		abilitiesbuttons.setPreferredSize(new Dimension(850,500));
		abilities.add(abilitiesbuttons);
		//abilities showing panel
		abilitiespanel=new JPanel();
		abilitiespanel.setBackground(new Color(184, 72, 50));
		abilitiespanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		abilitiespanel.setPreferredSize(new Dimension(1300,210));
		abilities.add(abilitiespanel);
		//textField to show champion abilities
		t=new TextField();
		t.setEditable(false);
		t.setPreferredSize(new Dimension(850,40));
		t.setBackground(new Color(213, 213, 213 ));
		t.setForeground(Color.BLACK);
		t.setFont(new Font("Arial",Font.BOLD,15));	
		abilitiespanel.add(t);
		t1=new TextField();
		t1.setEditable(false);
		t1.setPreferredSize(new Dimension(850,40));
		t1.setBackground(new Color(213, 213, 213 ));
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("Arial",Font.BOLD,15));	
		abilitiespanel.add(t1);
		t2=new TextField();
		t2.setEditable(false);
		t2.setPreferredSize(new Dimension(850,40));
		t2.setBackground(new Color(213, 213, 213 ));
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("Arial",Font.BOLD,15));	
		abilitiespanel.add(t2);
	   
                	
							firstName=new JLabel();
							firstName.setForeground(Color.WHITE);
							firstName.setFont(new Font("arial",Font.BOLD,25));
							down.add(firstName);
							secondName=new JLabel();
							secondName.setForeground(Color.WHITE);
							secondName.setFont(new Font("arial",Font.BOLD,25));
							up.add(secondName);
							firstName.setVisible(false);
							secondName.setVisible(false);
							
				
				
				
				
				a1=new JPanel();
				a1.setPreferredSize(new Dimension(340,150));
				a1.setBackground(Color.WHITE);
				down.add(a1);
				a2=new JPanel();
				a2.setPreferredSize(new Dimension(340,150));
				a2.setBackground(Color.WHITE);
				down.add(a2);
				a3=new JPanel();
				a3.setPreferredSize(new Dimension(340,150));
				a3.setBackground(Color.WHITE);
				down.add(a3);
				a1.setVisible(false);a2.setVisible(false);a3.setVisible(false);
				a4=new JPanel();
				a4.setLayout(new FlowLayout(FlowLayout.CENTER));
				a4.setPreferredSize(new Dimension(340,150));
				a4.setBackground(Color.WHITE);
				up.add(a4);
				a5=new JPanel();
				a5.setLayout(new FlowLayout(FlowLayout.CENTER));
				a5.setPreferredSize(new Dimension(340,150));
				a5.setBackground(Color.WHITE);
				up.add(a5);
				a6=new JPanel();
				a6.setLayout(new FlowLayout(FlowLayout.CENTER));
				a6.setPreferredSize(new Dimension(340,150));
				a6.setBackground(Color.WHITE);
				up.add(a6);
				a4.setVisible(false);a5.setVisible(false);a6.setVisible(false);
				ab1=new JPanel();
				ab1.setPreferredSize(new Dimension(340,150));
				ab1.setBackground(Color.WHITE);
				left.add(ab1);
				ab2=new JPanel();
				ab2.setPreferredSize(new Dimension(340,150));
				ab2.setBackground(Color.WHITE);
				left.add(ab2);
				ab3=new JPanel();
				ab3.setPreferredSize(new Dimension(340,150));
				ab3.setBackground(Color.WHITE);
				left.add(ab3);
				ab1.setVisible(false);ab2.setVisible(false);ab3.setVisible(false);
				
				PH11=new JLabel();
				PH12=new JLabel();
				PH13=new JLabel();
				PH21=new JLabel();
				PH22=new JLabel();
				PH23=new JLabel();
				
				PH11.setFont(new Font("arial",Font.BOLD,17));
				PH12.setFont(new Font("arial",Font.BOLD,17));
				PH13.setFont(new Font("arial",Font.BOLD,17));
				PH21.setFont(new Font("arial",Font.BOLD,17));
				PH22.setFont(new Font("arial",Font.BOLD,17));
				PH23.setFont(new Font("arial",Font.BOLD,17));
				
			    
			    press=new JLabel();
			    press.setText("Press anywhere to start");
			    press.setForeground(Color.white);
			    press.setFont(new Font("arial",Font.ROMAN_BASELINE,100));
			    press.setBackground(Color.WHITE);
				ImageIcon image3=new ImageIcon("cr7.jpg"); 
				z=new JButton();
				z.setIcon(image3);
				start.add(z);
				start.add(press);
				//adding panels in frame
				frame.add(start);
				frame.setVisible(true);
				frame.validate();
				chmName11=new JLabel();chmName12=new JLabel();chmName13=new JLabel();
				chmName21=new JLabel();chmName22=new JLabel();chmName23=new JLabel();
				chmName11.setFont(new Font("arial",Font.BOLD,15));
				chmName12.setFont(new Font("arial",Font.BOLD,15));
				chmName13.setFont(new Font("arial",Font.BOLD,15));
				chmName21.setFont(new Font("arial",Font.BOLD,15));
				chmName22.setFont(new Font("arial",Font.BOLD,15));
				chmName23.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects11=new JLabel();appliedeffects12=new JLabel();appliedeffects13=new JLabel();
				appliedeffects21=new JLabel();appliedeffects22=new JLabel();appliedeffects23=new JLabel();
				appliedeffects11.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects12.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects13.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects21.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects22.setFont(new Font("arial",Font.BOLD,15));
				appliedeffects23.setFont(new Font("arial",Font.BOLD,15));
			
				mana11=new JLabel();mana12=new JLabel();mana13=new JLabel();
				mana21=new JLabel();mana22=new JLabel();mana23=new JLabel();
				mana11.setFont(new Font("arial",Font.BOLD,15));mana12.setFont(new Font("arial",Font.BOLD,15));
				mana13.setFont(new Font("arial",Font.BOLD,15));mana21.setFont(new Font("arial",Font.BOLD,15));
				mana22.setFont(new Font("arial",Font.BOLD,15));mana23.setFont(new Font("arial",Font.BOLD,15));
				
				actions11=new JLabel();actions12=new JLabel();actions13=new JLabel();
				actions21=new JLabel();actions22=new JLabel();actions23=new JLabel();
				actions11.setFont(new Font("arial",Font.BOLD,15));actions12.setFont(new Font("arial",Font.BOLD,15));
				actions13.setFont(new Font("arial",Font.BOLD,15));actions21.setFont(new Font("arial",Font.BOLD,15));
				actions22.setFont(new Font("arial",Font.BOLD,15));actions23.setFont(new Font("arial",Font.BOLD,15));
				
				speed11=new JLabel();speed12=new JLabel();speed13=new JLabel();speed21=new JLabel();speed22=new JLabel();speed23=new JLabel();
				speed11.setFont(new Font("arial",Font.BOLD,15));speed12.setFont(new Font("arial",Font.BOLD,15));
				speed13.setFont(new Font("arial",Font.BOLD,15));speed21.setFont(new Font("arial",Font.BOLD,15));
				speed22.setFont(new Font("arial",Font.BOLD,15));speed23.setFont(new Font("arial",Font.BOLD,15));
				
				attackRange11=new JLabel();attackRange12=new JLabel();attackRange13=new JLabel();
				attackRange21=new JLabel();attackRange22=new JLabel();attackRange23=new JLabel();
				attackRange11.setFont(new Font("arial",Font.BOLD,15));attackRange12.setFont(new Font("arial",Font.BOLD,15));
				attackRange13.setFont(new Font("arial",Font.BOLD,15));attackRange21.setFont(new Font("arial",Font.BOLD,15));
				attackRange22.setFont(new Font("arial",Font.BOLD,15));attackRange23.setFont(new Font("arial",Font.BOLD,15));
				
				attackDamage11=new JLabel();attackDamage12=new JLabel();attackDamage13=new JLabel();
				attackDamage21=new JLabel();attackDamage22=new JLabel();attackDamage23=new JLabel();
				attackDamage11.setFont(new Font("arial",Font.BOLD,15));attackDamage12.setFont(new Font("arial",Font.BOLD,15));
				attackDamage13.setFont(new Font("arial",Font.BOLD,15));attackDamage21.setFont(new Font("arial",Font.BOLD,15));
				attackDamage22.setFont(new Font("arial",Font.BOLD,15));attackDamage23.setFont(new Font("arial",Font.BOLD,15));
				
				CurrChm=new JLabel();CurrChm.setForeground(Color.white);NextCurrChm=new JLabel();NextCurrChm.setForeground(Color.white);
				CurrChm.setFont(new Font("arial",Font.BOLD,26));NextCurrChm.setFont(new Font("arial",Font.BOLD,26));
				type11=new JLabel();type12=new JLabel();type13=new JLabel();
				type21=new JLabel();type22=new JLabel();type23=new JLabel();
				type11.setFont(new Font("arial",Font.BOLD,15));type12.setFont(new Font("arial",Font.BOLD,15));
				type13.setFont(new Font("arial",Font.BOLD,15));type21.setFont(new Font("arial",Font.BOLD,15));
				type22.setFont(new Font("arial",Font.BOLD,15));type23.setFont(new Font("arial",Font.BOLD,15));
		
		
		start.add(z);
		start.add(press);
		//adding panels in frame
		frame.add(start);
		frame.setVisible(true);
		frame.validate();
		
		
	}
	public String Champ1(){
		return FirstChamp1;
	}
	public String Champ2(){
		return FirstChamp1;
	}
	public String Champ3(){
		return FirstChamp1;
	}
	public String SChamp1(){
		return SecondChamp1;
	}
	public String SChamp2(){
		return SecondChamp2;
	}
	public String SChamp3(){
		return SecondChamp3;
	}
	

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==startmusic){
			MUSIC.Runmusic("500.wav");
			startmusic.setEnabled(false);
		}
		if(e.getSource()==stopmusic){
			MUSIC.stopmusic();
			startmusic.setEnabled(true);
		}
		
		
}
	
}