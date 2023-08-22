package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Jogar extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		novaTela();	
	}

	public void novaTela() {
		JFrame novaTela = new JFrame();
		novaTela.setSize(1280,720);
		novaTela.setVisible(true);
		novaTela.setDefaultCloseOperation(novaTela.EXIT_ON_CLOSE);
		novaTela.setResizable(false);
		novaTela.setLocationRelativeTo(null);
		
		novaTela.setLayout(null);
		
		JButton lig4 = new JButton(new GameLig4());
		lig4.setText("Lig4");
		lig4.setBounds(440, 150 , 400, 100);
		lig4.setFont(new Font("Arial", Font.BOLD, 18));
		lig4.setForeground(new Color(0, 0, 0));
		lig4.setBackground(new Color(32, 98, 149));
		
		novaTela.add(lig4);		

		JButton lig4Turbo = new JButton(new GameLig4Turbo());
		lig4Turbo.setText("Lig4 Turbo");
		lig4Turbo.setBounds(440, 300 , 400, 100);
		lig4Turbo.setFont(new Font("Arial", Font.BOLD, 18));
		lig4Turbo.setForeground(new Color(0, 0, 0));
		lig4Turbo.setBackground(new Color(32, 98, 149));
		
		novaTela.add(lig4Turbo);
		
		JButton lig4TurboMaluco = new JButton(new GameLig4TurboMaluco());
		lig4TurboMaluco.setText("Lig4 Turbo Maluco");
		lig4TurboMaluco.setBounds(440, 450 , 400, 100);
		lig4TurboMaluco.setFont(new Font("Arial", Font.BOLD, 18));
		lig4TurboMaluco.setForeground(new Color(0, 0, 0));
		lig4TurboMaluco.setBackground(new Color(32, 98, 149));
		
		novaTela.add(lig4TurboMaluco);
	}

	public void setVisible(boolean b) {
		b = true;
	}
}