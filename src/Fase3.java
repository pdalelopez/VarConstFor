import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startLeapYear = 1948;
		
		boolean leapYear;
		
		Scanner input = new Scanner(System.in);
		
		int birthYear = input.nextInt();
		
		int dif = birthYear-startLeapYear;
		
		for (int i = 0; i <= dif; i++ ) {
			if ((((startLeapYear+i)-startLeapYear)%4==0) || ((startLeapYear+i)==birthYear) ){
			System.out.println(startLeapYear+i);
			}	
		}
		
		if ((birthYear-startLeapYear)%4 == 0) {
			
			leapYear = true;
			
		}else {
			leapYear = false;
			
		}
		
	}

}
