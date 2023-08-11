package game;

import tabuleiro.Lig4;

public class Jogo {

	public static void main(String[] args) {
		String[][] str = new String[7][15];
		Lig4 game2 = new Lig4();
		str = game2.criarTabuleiro();
		game2.mostrarTabuleiro(str);

		while (game2.verificarVitoria(str) == null || game2.getTurn() < 42) {
			game2.jogada(str);
			game2.mostrarTabuleiro(str);
		}
		System.out.println("Fim de jogo!");
	}
}
