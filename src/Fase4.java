
public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Pedro";
		String lastName = "Lopez";
		String secondLastName = "Muñoz";
		int day = 3;
		int month = 5;
		int year = 1990;
		
		String concatName = lastName +" "+ secondLastName+", "+ name;
		String concatBirth = day + "/"+month+"/"+year;
		System.out.println("Mi nombre es: "+concatName);
		System.out.println("Naci "+concatBirth);
		
		int startLeapYear = 1948;
		boolean leapYear;
		
		String yesLeap = "tu año de nacimiento es bisiesto";
		String noLeap = "tu año de nacimiento NO es bisiesto";
		
		if ((year-startLeapYear)%4 == 0) {
			leapYear = true;
			System.out.println(yesLeap);
			
		}else {
			leapYear = false;
			System.out.println(noLeap);
			
		}
	}

}
