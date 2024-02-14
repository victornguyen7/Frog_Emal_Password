package Frog_Emal_Password;

import java.util.Scanner;

public class FrogSimulator {

	private int goalDistance;
	
	private int maxHops;
	
	private int max;
	
	private int min;
	
    public FrogSimulator(int dist, int numberHops, int maxHop, int minHop) {
        goalDistance = dist;
        maxHops = numberHops;
        max = maxHop;
        min = minHop;
    }

    private int hopDistance(int max, int min) {
        int distance = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println("The frog hopped " + distance + " inches.");
        return distance;
    }
	
	public boolean simulate() {
	
		int totalDistance = 0;
		
		for( int i = 1; i<= maxHops; i++) {
			
			totalDistance += hopDistance(max, min);
		
			if( totalDistance < 0) {
				System.out.println("Does not pass the goal");
				System.out.println();
				return false;
			}
			else if (totalDistance >= goalDistance) {
				System.out.println("Pass the goal");
				System.out.println();
				return true;
			}	
		}
		System.out.println("Does not pass the goal");
		System.out.println();
		return false;
	}
	
	public double runSimulations(int num) {
		int success = 0;
		
		int times = num;
		
		for(int i = 0; i < times; i++) {
			if(simulate() == true) {
				success++;
			}
		}
		System.out.println("Number of success: " + success);
		return (double) success / times;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total distances: ");
		
		int dist = input.nextInt();
		
		System.out.println("Enter the number of hops: ");
		
		int numHops = input.nextInt();
		
		System.out.println("Enter the maximum: ");
		
		int max = input.nextInt();
		
		System.out.println("Enter the minimum: ");
		
		int min = input.nextInt();
		
		FrogSimulator frog = new FrogSimulator(dist, numHops, max, min);
		
		System.out.println("First simulation result: " + (frog.simulate() ? "Pass" : "Fail"));
		
		System.out.println("Choose number of simulations: ");
		
		int num = input.nextInt();
		
		double proportion = frog.runSimulations(num);
		
		System.out.println("The proportion of the successful runs is :" + proportion);
	}
}
