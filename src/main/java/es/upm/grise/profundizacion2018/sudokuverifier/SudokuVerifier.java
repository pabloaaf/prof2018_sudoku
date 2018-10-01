package es.upm.grise.profundizacion2018.sudokuverifier;

public class SudokuVerifier {
	public static int lengthSudoku = 9;
	public static String[] numbersSudoku = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// Leo el sudoku
		verify(sc.next());
		sc.close();
	}

	public static int verify(String candidateSolution) {
		if (candidateSolution.contains("-") || candidateSolution.contains(".") || candidateSolution.contains(",")
				|| candidateSolution.contains("0")) {
			return -1;
		}
		if (candidateSolution.length() != 81) {
			return -5;
		}

		String subcadena = "";
		int x = 0;
		int y = 0;
		// error 2 ==> numero igual en subgrid
		while (y < lengthSudoku) {
			while (x < lengthSudoku) {
				for (int i = x; i < x + (lengthSudoku / 3); i++) {
					for (int j = y; j < y + (lengthSudoku / 3); j++) {
						subcadena = subcadena.concat(candidateSolution.substring(i * 9 + j, i * 9 + j + 1));
					}
				}
				for (int i = 0; i < lengthSudoku; i++) {
					if (subcadena.indexOf(numbersSudoku[i]) != subcadena.lastIndexOf(numbersSudoku[i])) {
						System.out.println(subcadena);
						return -2;
					}
				}
				subcadena = "";
				x += 3;
			}
			x = 0;
			y += 3;
		}

		// error 3 ==> numero igual en columna
		for (int j = 0; j < lengthSudoku; j++) {
			for (int i = 0; i < lengthSudoku; i++) {
				subcadena = subcadena.concat(candidateSolution.substring(i * 9 + j, i * 9 + j + 1));
			}
			for (int i = 0; i < lengthSudoku; i++) {
				if (subcadena.indexOf(numbersSudoku[i]) != subcadena.lastIndexOf(numbersSudoku[i]))
					return -3;
			}
			subcadena = "";
		}

		// error 4 ==> numero igual en columna
		for (int i = 0; i < lengthSudoku; i++) {
			for (int j = 0; j < lengthSudoku; j++) {

				subcadena = subcadena.concat(candidateSolution.substring(i * 9 + j, i * 9 + j + 1));
			}
			for (int j = 0; j < lengthSudoku; j++) {
				if (subcadena.indexOf(numbersSudoku[j]) != subcadena.lastIndexOf(numbersSudoku[j]))
					return -4;
			}
			subcadena = "";
		}

		return 0;
	}
}
