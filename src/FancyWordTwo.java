//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwo
{
	private String[][] mat;

   public FancyWordTwo(String s)
	{
		//size the matrix
		mat = new String[s.length()][s.length()];

		//use Arrays.fill() to fill in the matrix with spaces
		for(String[] str: mat){
			Arrays.fill(str, " ");
		}

		//use a for loop to load in the letters into the matrix
		for(int i = 0; i < s.length(); i++){
			mat[0][i] = "" + s.charAt(i);
			mat[i][0] = "" + s.charAt(i);
			mat[i][s.length()-1] = "" + s.charAt(s.length()-i-1);
			mat[s.length()-1][i] = "" + s.charAt(s.length()-i-1);
		}

	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				output += mat[i][j];
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}