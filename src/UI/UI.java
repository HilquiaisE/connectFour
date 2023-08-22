package UI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class UI extends JFrame{

	public UI() {

		setVisible(true);
		setTitle("Lig 4");
		setSize(1280,720);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);		
		
		setLayout(null);
		
		JButton jogar = new JButton(new Jogar());
		jogar.setText("JOGAR");
		jogar.setBounds(440, 200 , 400, 100);
		jogar.setFont(new Font("Arial", Font.BOLD, 18));
		jogar.setForeground(new Color(0, 0, 0));
		jogar.setBackground(new Color(32, 98, 149));
		
		add(jogar);
		
		JButton sair = new JButton(new SairAction());
		sair.setText("SAIR");
		sair.setBounds(440, 350 , 400, 100);
		sair.setFont(new Font("Arial", Font.BOLD, 18));
		sair.setForeground(new Color(0, 0, 0));
		sair.setBackground(new Color(32, 98, 149));
		
		add(sair);		
	}
}
