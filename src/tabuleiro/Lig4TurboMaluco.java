package tabuleiro;

import java.util.Random;
import java.util.Scanner;

import Exception.JogadaException;

public class Lig4TurboMaluco extends Tabuleiro implements Jogada {

	public Lig4TurboMaluco() {
	}

	@Override
	public void jogada(String[][] tabuleiro) {
		Scanner sc = new Scanner(System.in);
		Random posicao = new Random();
		int c = 2 * sc.nextInt() + 1;

		if (c < 1 || c > 13) {
			throw new JogadaException("Posição não pertence ao tabuleiro!");
		}

		for (int i = 5; i >= 0; i--) {
			if (tabuleiro[i][c] == " ") {
				tabuleiro[i][c] = jogador;

				switch (posicao.nextInt(7)) {

				case 0:
					if (c > 2) {
						if (tabuleiro[i][c - 2] != " ") {
							if (tabuleiro[i][c - 2] != jogador) {
								tabuleiro[i][c - 2] = jogador;
							}
						}
					}
					break;

				case 1:
					if (c < 12) {
						if (tabuleiro[i][c + 2] != " ") {
							if (tabuleiro[i][c + 2] != jogador) {
								tabuleiro[i][c + 2] = jogador;
							}
						}
					}
					break;

				case 2:
					if (i < 4) {
						if (tabuleiro[i + 1][c] != " ") {
							if (tabuleiro[i + 1][c] != jogador) {
								tabuleiro[i + 1][c] = jogador;
							}
						}
					}
					break;

				case 3:
					if (i > 1 && i < 4 && c < 12) {
						if (tabuleiro[i - 1][c + 2] != " ") {
							if (tabuleiro[i - 1][c + 2] != jogador) {
								tabuleiro[i - 1][c + 2] = jogador;
							}
						}
					}
					break;

				case 4:
					if (i > 1 && i < 4 && c > 2) {
						if (tabuleiro[i - 1][c - 2] != " ") {
							if (tabuleiro[i - 1][c - 2] != jogador) {
								tabuleiro[i - 1][c - 2] = jogador;
							}
						}
					}
					break;

				case 5:
					if (i > 1 && i < 4 && c < 12) {
						if (tabuleiro[i + 1][c + 2] != " ") {
							if (tabuleiro[i + 1][c + 2] != jogador) {
								tabuleiro[i + 1][c + 2] = jogador;
							}
						}
					}
					break;

				default:
					if (i > 1 && i < 4 && c > 2) {
						if (tabuleiro[i + 1][c - 2] != " ") {
							if (tabuleiro[i + 1][c - 2] != jogador) {
								tabuleiro[i + 1][c - 2] = jogador;
							}
						}
					}
					break;
				}
				break;
			}
		}
		verificarVitoria(tabuleiro);
		nextTurn();
	}

}