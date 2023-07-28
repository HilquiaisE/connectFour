package game;

import tabuleiro.Tabuleiro;

public class Jogo {

	public static void main(String[] args) {
		String[][] str = new String[7][15];
		Tabuleiro game = new Tabuleiro();
		str = game.criarTabuleiro();
		game.mostrarTabuleiro(str);
		
		while(true) {
			game.jogada(str);
			game.mostrarTabuleiro(str);
		}
	}
}
