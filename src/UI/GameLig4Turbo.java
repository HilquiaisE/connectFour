package UI;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import tabuleiro.Lig4Turbo;

public class GameLig4Turbo extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		String[][] str = new String[7][15];
		Lig4Turbo game = new Lig4Turbo();
		str = game.criarTabuleiro();
		game.mostrarTabuleiro(str);
		
		while (game.verificarVitoria(str) == null) {
			game.jogada(str);
			game.mostrarTabuleiro(str);
		}
		
	}
}
