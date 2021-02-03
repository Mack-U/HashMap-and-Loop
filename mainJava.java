package DataStructureHmwSub;

//import java.lang.reflect.Array;
//
//public class mainJava {
//
//	public static void main(String[] args) {
//		Integer [] examples = {1, 4, 6, 3, 9};
//		Integer addedUp = 0;
//		for(Integer example : examples) {
//       addedUp += example;
//	}
//     System.out.printf("the sum is %d\n", addedUp);
//
//	
//	double[] exampleArray = {1,5,6,4,5,1};
//	double maximum = exampleArray[0];
//	int index = 0;
//			
//	for (int i =1; i<exampleArray.length; i++) {
//		double maximum1 = 0;
//		if (exampleArray[ i ] > maximum1) {
//			maximum1 = exampleArray[i];
//			index = i;
//		}
//	}
//	System.out.println(index);
//	
////	double base = 4;
////	double exp = 2;
////	System.out.println(toPower(base, exp));
////	
////	}
////	
////	public static double[] toPower(double size, double power) {
////		double [] frog = null;
////		for(double i = 0, i < size; i ++) {
////			double[] result;
////			result[(int)i] = Math.pow(i,  power);
////		frog[(int)i] = Math.pow(i,  power);
////		}
////	return frog;
//	
//	}
//	
//	
//	
//	
//	} 
//	

import java.util.*;

public class mainJava {
    public static void main(String args[]) {
        int count, max, min, i;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements");
         
        
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
   
        max = min = inputArray[0];
         
        for(i = 1; i < count; i++) {
            if(inputArray[i] > max)
                max = inputArray[i];
            else if (inputArray[i] < min)
                min = inputArray[i];
                
        }

        int total = sumOfElements(inputArray);
        System.out.println("The sum is" + total);
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }

	private static int sumOfElements(int[] inputArray) {
		int sum = 0; for (int i : inputArray) { sum = sum + i; } 
		return sum; }

	
	
}
