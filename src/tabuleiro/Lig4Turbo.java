package tabuleiro;

import java.util.Scanner;

import Exception.JogadaException;

public class Lig4Turbo extends Tabuleiro implements Jogada {

	public Lig4Turbo() {
	}

	@Override
	public void jogada(String[][] tabuleiro) {
		Scanner sc = new Scanner(System.in);
		int c = 2 * sc.nextInt() + 1;

		if (c < 1 || c > 13) {
			throw new JogadaException("Posição não pertence ao tabuleiro!");
		}

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
		verificarVitoria(tabuleiro);
		nextTurn();
	}
}
