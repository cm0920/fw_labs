//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("fancyword.dat"));
		int size = file.nextInt();
		file.nextLine();

		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			FancyWord fw = new FancyWord(word);
			System.out.println(fw.toString());
	   }
	}
}