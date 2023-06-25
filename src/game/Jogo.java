package game;

import game.tabuleiro.*;
public class Jogo {

	public static void main(String[] args) {
		String[][] str = new String[7][15];
		Tabuleiro game = new Tabuleiro();
		str = game.criarTabuleiro();
		game.mostrarTabuleiro(str);
	}

}
