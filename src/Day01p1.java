import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day01p1 {
	/*
	"C:\\Users\\skwir\\Documents\\eclipse-workspace\\"
	+ "Advent of Code 2019\\input\\input01p1.txt"
	*/	
	public static int calcMass(String path) throws IOException,FileNotFoundException{
		BufferedReader br;
		try {
			int total_mass = 0;
			br = new BufferedReader(new FileReader(path));
			for(String line; (line = br.readLine()) != null;) {
				int temp = Integer.parseInt(line);
				total_mass += calcFuel(temp);
			}
			br.close();
			return total_mass;
		}catch(FileNotFoundException e) {
			throw new FileNotFoundException("File not found");
		}
	}
	public static int calcFuel(int mass) {
		int fuel = (mass/3)-2;
		if(fuel > 0) {
			fuel += calcFuel(fuel);
			return fuel;
		} else {
			return 0;
		}
		
	}
}
