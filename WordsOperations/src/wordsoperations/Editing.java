package wordsoperations;

public class Editing {

	public static void subEditing(String wordtoEdit) {
		                //buscador
	  
	  Operations.print("Substring from 3: ");
	  Operations.print("wordtoEdit.substring(3)");
	  Operations.linebreak();
	  
	  Operations.print("Substring from 3 to 6: ");
	  Operations.print("wordtoEdit.substring(3, 6)");
	  Operations.linebreak();
	  
	  Operations.print("Position @: ");
	  Operations.print("wordtoEdit.idexOf(@)");
	  Operations.linebreak();
	  
	  Operations.print("Domain: ");
	  Operations.print("wordtoEdit.substring(wordtoEdit.idexOf(@ + 1))");
	  Operations.linebreak();

	}

}
