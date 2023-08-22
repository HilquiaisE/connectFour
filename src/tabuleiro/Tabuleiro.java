package tabuleiro;

public abstract class Tabuleiro {

	private int linha;
	private int coluna;
	private String[][] tabuleiro;
	protected String jogador;
	private int turn;

	public Tabuleiro() {
		linha = 7;
		coluna = 15;
		jogador = "R";
		turn = 0;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
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

	public int getTurn() {
		return turn;
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
		System.out.println(" 0 1 2 3 4 5 6");

		System.out.println();
		System.out.println("Ecolha uma casa de 0-6: ");
	}

	public void nextTurn() {
		if (jogador == "R") {
			jogador = "B";
		} else {
			jogador = "R";
		}

		turn++;
	}

	public String verificarVitoria(String[][] tabuleiro) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j += 2) {
				if ((tabuleiro[i][j + 1] != " ") && (tabuleiro[i][j + 3] != " ") && (tabuleiro[i][j + 5] != " ")
						&& (tabuleiro[i][j + 7] != " ")
						&& ((tabuleiro[i][j + 1] == tabuleiro[i][j + 3]) && (tabuleiro[i][j + 3] == tabuleiro[i][j + 5])
								&& (tabuleiro[i][j + 5] == tabuleiro[i][j + 7])))

					return tabuleiro[i][j + 1];
			}
		}

		for (int i = 1; i < 15; i += 2) {
			for (int j = 0; j < 3; j++) {
				if ((tabuleiro[j][i] != " ") && (tabuleiro[j + 1][i] != " ") && (tabuleiro[j + 2][i] != " ")
						&& (tabuleiro[j + 3][i] != " ")
						&& ((tabuleiro[j][i] == tabuleiro[j + 1][i]) && (tabuleiro[j + 1][i] == tabuleiro[j + 2][i])
								&& (tabuleiro[j + 2][i] == tabuleiro[j + 3][i])))
					return tabuleiro[j][i];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 9; j += 2) {
				if ((tabuleiro[i][j] != " ") && (tabuleiro[i + 1][j + 2] != " ") && (tabuleiro[i + 2][j + 4] != " ")
						&& (tabuleiro[i + 3][j + 6] != " ")
						&& ((tabuleiro[i][j] == tabuleiro[i + 1][j + 2])
								&& (tabuleiro[i + 1][j + 2] == tabuleiro[i + 2][j + 4])
								&& (tabuleiro[i + 2][j + 4] == tabuleiro[i + 3][j + 6])))
					return tabuleiro[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 7; j < 15; j += 2) {
				if ((tabuleiro[i][j] != " ") && (tabuleiro[i + 1][j - 2] != " ") && (tabuleiro[i + 2][j - 4] != " ")
						&& (tabuleiro[i + 3][j - 6] != " ")
						&& ((tabuleiro[i][j] == tabuleiro[i + 1][j - 2])
								&& (tabuleiro[i + 1][j - 2] == tabuleiro[i + 2][j - 4])
								&& (tabuleiro[i + 2][j - 4] == tabuleiro[i + 3][j - 6])))
					return tabuleiro[i][j];
			}
		}
		return null;
	}
}
