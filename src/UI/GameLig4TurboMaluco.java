package UI;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import tabuleiro.Lig4TurboMaluco;

public class GameLig4TurboMaluco extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		String[][] str = new String[7][15];
		Lig4TurboMaluco game2 = new Lig4TurboMaluco();
		str = game2.criarTabuleiro();
		game2.mostrarTabuleiro(str);
		
		while (game2.verificarVitoria(str) == null) {
			game2.jogada(str);
			game2.mostrarTabuleiro(str);
		}
		
	}

}
