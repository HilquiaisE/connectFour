package tabuleiro;

import java.util.Scanner;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private String[][] tabuleiro;
	private String jogador;

	public Tabuleiro() {
		linha = 7;
		coluna = 15;
		jogador = "R";
	}

	public String getJogador() {
		return jogador;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String[][] criarTabuleiro() {
		String[][] tabuleiro = new String[linha][coluna];

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (j % 2 == 0) {
					tabuleiro[i][j] = "|";
				} else {
					tabuleiro[i][j] = " ";
				}

				if (i == 6)
					tabuleiro[i][j] = "-";
			}

		}
		return tabuleiro;
	}

	public void mostrarTabuleiro(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println();
		}
	}

	private void nextTurn() {
		if (jogador == "R") {
			jogador = "B";
		} else {
			jogador = "R";
		}
	}

	public void jogada(String[][] tabuleiro) {
		Scanner sc = new Scanner(System.in);
		int c = 2 * sc.nextInt() + 1;

		for (int i = 5; i >= 0; i--) {
			if (tabuleiro[i][c] == " ") {
				tabuleiro[i][c] = jogador;
				break;
			}
		}
		nextTurn();
	}
}