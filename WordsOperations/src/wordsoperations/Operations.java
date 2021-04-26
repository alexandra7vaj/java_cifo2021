package wordsoperations;

public class Operations {

	public static void print(String wordtoPrint) {

		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {

		System.out.print(chartoPrint);
	}

	public static void linebreak() {
		System.out.print("\n");
	}

	public static void printString(String wordtoPrint) {

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		while (i < sizeWordtoPrint) {
			print("loop number: " + (i + 1) + " - " );
			
			print("letter: " + wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;

		}

	}
	
	public static void printStringH(String wordtoPrint) {
		// Horizontal
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while(i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i));
			print(" ");
			
			i++; //i = i+1;
		}
		linebreak();
	}
	public static void printStringV(String wordtoPrint) {
		// Vertical
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while(i < sizeWordtoPrint) {
			linebreak();
			print(wordtoPrint.charAt(i));
			i++; //i = i+1
		}
		linebreak();
	}
	public static void printStringHDash(String wordtoPrint) {
		// Lineas
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while(i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i));
			print("_");
			
			i++; //i = i+1
		}
		linebreak();
	}
	public static void printStringDiagonal(String wordtoPrint) {
		// Lineas
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while(i < sizeWordtoPrint) {
			int j=0;
			while(j < i ) {
				print("*");
				j++;
			}
			print(wordtoPrint.charAt(i));
			linebreak();
			i++; //i = i+1
			}
		linebreak();
		}
	
	public static void printStringBackWards(String wordtoPrint) {
		
		linebreak();
		int i = wordtoPrint.length() -1;
		
		while (i > -1) {
			
			print( wordtoPrint.charAt(i));
			print(" ");
			linebreak();

			i--; // i = i -1;
		}
		
		linebreak();
	}
}


	