package tabuleiro;

import java.util.Scanner;

public class Lig4 extends Tabuleiro{
	
	public Lig4() {
	}

	@Override
	public void jogada(String[][] tabuleiro) {
		Scanner sc = new Scanner(System.in);
		int c = 2 * sc.nextInt() + 1;

		for (int i = 5; i >= 0; i--) {
			if (tabuleiro[i][c] == " ") {
				tabuleiro[i][c] = jogador;
				break;
			}
		}
		verificarVitoria(tabuleiro);
		nextTurn();
	}

}
