package tabuleiro;

import java.util.Scanner;

public class Lig4Turbo extends Tabuleiro {

	public Lig4Turbo() {
	}

	public void jogada(String[][] tabuleiro) {
	//	Tabuleiro game = new Tabuleiro();
		Scanner sc = new Scanner(System.in);
		int c = 2 * sc.nextInt() + 1;

		for (int i = 5; i >= 0; i--) {
			if (tabuleiro[i][c] == " ") {
				tabuleiro[i][c] = jogador;
				if (c > 2) {
					if (tabuleiro[i][c - 2] != " ") {
						if (tabuleiro[i][c - 2] != jogador) {
							tabuleiro[i][c - 2] = jogador;
						}
					}
				}
				if (c < 12) {
					if (tabuleiro[i][c + 2] != " ") {
						if (tabuleiro[i][c + 2] != jogador) {
							tabuleiro[i][c + 2] = jogador;
						}
					}
				}
				break;
			}
		}
		nextTurn();
	}
}
