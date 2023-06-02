package GUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cell extends JButton implements ActionListener {
	public Cell() {
		super();
		this.setBackground(Color.WHITE); 
		this.addActionListener(this);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}



