package UI;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import tabuleiro.Lig4;

public class GameLig4 extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		String[][] str = new String[7][15];
		Lig4 game = new Lig4();
		str = game.criarTabuleiro();
		game.mostrarTabuleiro(str);
		
		while (game.verificarVitoria(str) == null) {
			game.jogada(str);
			game.mostrarTabuleiro(str);
		}	
	}

}
