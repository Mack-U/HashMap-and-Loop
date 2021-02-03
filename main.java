package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class main {

	
	public main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);		
		HashMap<String, String> car = new HashMap<>();
		car.put( "Fit","Honda");
		car.put("Corvette", "Chevrolet");
		car.put("Escape", "Ford");
		car.put("X5", "BMW");		
		System.out.println("What kind of car are you looking for?");
		String customerCar = userInput.nextLine();
				
			if (car.containsKey(customerCar) == true)
			{
				System.out.println("We have just what you're looking for.");
			}
			else {
				System.out.println("Check with us next week, maybe we can find that vehicle for you.");				
			}
		}
	
		}


