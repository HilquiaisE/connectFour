package game;

import tabuleiro.Lig4Turbo;
import tabuleiro.Tabuleiro;

public class Jogo {

	public static void main(String[] args) {
		String[][] str = new String[7][15];
		Tabuleiro game = new Tabuleiro();
		Lig4Turbo game2 = new Lig4Turbo();
		str = game.criarTabuleiro();
		game.mostrarTabuleiro(str);

		while (true) {
			game2.jogada(str);
			game2.mostrarTabuleiro(str);
		}
	}
}
