import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day03p1 {
	BufferedReader br;
	Scanner sFirst;
	Scanner sSecond;
	public void readData(String path) throws FileNotFoundException {
		try {
			br = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String firstWire = "";
		String secondWire = "";
		try {
			firstWire = br.readLine();
			secondWire = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sFirst = new Scanner(firstWire).useDelimiter("(\\p{javaWhitespace}|,)+");
		sSecond = new Scanner(secondWire).useDelimiter("(\\p{javaWhitespace}|,)+");
		


		
	}
}
