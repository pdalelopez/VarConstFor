import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startLeapYear = 1948;
		boolean leapYear;
		
		// enter your birth's year
		
		System.out.println("indique su año de nacimiento");
		Scanner input = new Scanner(System.in);
		int birthYear = input.nextInt();
		
		// for loop, printing leap years
		
		int dif = birthYear-startLeapYear;
		for (int i = 0; i <= dif; i++ ) {
			if ((i%4==0) || ((startLeapYear+i)==birthYear) ){
			System.out.println(startLeapYear+i);
			}	
		}
		
		String yesLeap = "tu año de nacimiento es bisiesto";
		String noLeap = "tu año de nacimiento NO es bisiesto";
		
		if ((dif)%4 == 0) {
			leapYear = true;
			System.out.println(yesLeap);
			
		}else {
			leapYear = false;
			System.out.println(noLeap);
			
		}
		
	}

}
