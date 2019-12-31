import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
"C:\\Users\\skwir\\Documents\\eclipse-workspace\\"
+ "Advent of Code 2019\\input\\input02p1.txt"
*/	


public class Day02p1 {
	static int[] ram;
	Scanner s;
	public int[] getRam() {
		return ram;
	}
	
	@SuppressWarnings("resource")
	public void readAndInit(String path) throws FileNotFoundException{
		int temp=0;
		try {
			Scanner s = new Scanner(new FileReader(path)).useDelimiter("\\D");
			while(s.hasNextInt()) {
				s.nextInt();
				temp++;
			}
			ram = new int[temp];
			temp = 0;
			s.close();
			s = new Scanner(new FileReader(path)).useDelimiter("\\D");
			while(s.hasNext()) {
				ram[temp] = s.nextInt();
				temp++;
			}
			s.close();
		}catch(FileNotFoundException e) {
			throw new FileNotFoundException("File not found"); 
		}
	}
	
	public void executeProgram() throws IndexOutOfBoundsException{
		int registerA = 0;
		int registerB = 0;
		boolean flag = false;
		for(int i=0; i<ram.length && !flag; i+=4) {
			switch(ram[i]) {
				case 1:
					registerA = ram[(ram[(i+1)])];
					registerB = ram[(ram[(i+2)])];
					if(ram[i+3]>=ram.length) {
						throw new IndexOutOfBoundsException("Target index "
								+ "out of bounds");
					}
					ram[(ram[(i+3)])] = registerA+registerB;
					break;
				case 2:
					registerA = ram[(ram[(i+1)])];
					registerB = ram[(ram[(i+2)])];
					ram[(ram[(i+3)])] = registerA*registerB;
					break;
				case 99:
					flag = true;
					break;
				default:
					System.out.println("Unknown op code");
					flag = true;
					break;
			}
		}
	}
}