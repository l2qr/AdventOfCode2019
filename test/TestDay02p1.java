import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class TestDay02p1 {

	@Test
	void test() {
		try {
			System.out.println("INPUT: ");
			Day02p1 day_2 = new Day02p1();
			day_2.readAndInit("C:\\Users\\skwir\\Documents\\eclipse-workspace\\"
					+ "Advent of Code 2019\\input\\test.txt");
			int temp = 0;
			int[] ram;
			ram = day_2.getRam();
			for(int i : ram) {
				if(temp%4 == 0) {
					System.out.println();
					System.out.print(temp +":	");
				}
			System.out.print(i + ",");
			temp++;
			}			
			System.out.println();
			System.out.println("OUTPUT: ");
			day_2.executeProgram();
			ram = day_2.getRam();
			temp = 0;
			for(int i : ram) {
				if(temp%4==0) {
					System.out.println();
					System.out.print(temp +":	");
				} 
				System.out.print(i + ",");
				temp++;
			}
		}catch(FileNotFoundException e){
			
		}

	}

}
