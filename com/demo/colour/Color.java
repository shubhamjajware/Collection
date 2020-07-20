package com.demo.colour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<String> color=new ArrayList<>();
		System.out.println("Enter colour");
			color.add(scanner.next());
	
		
		Collections.sort(color);
		
		for(String i:color) {
			System.out.print(i+" ");
		}
		
		for(int i=0;i<color.size();i++) {
			if(color.get(i).equalsIgnoreCase("pink"))
			    color.add(i, "february");
		}
		
			System.out.println(color);
		
			if(color.contains("red")) {
				System.out.println("\nred found ");
			}
			else
				System.out.println("not found");
		
		List<String> month=new ArrayList<>(12);
		System.out.println("Enter the month range");
		int range=scanner.nextInt();
		if(range<12 || range>12) 
			System.out.println("Invalid input::input must be 12");
		
		else
			for(int i=0;i<range;i++) {
				month.add(scanner.next());
			}
		
		month.addAll(color);
		System.out.print(month+" ");
		System.out.println("\n"+month.size());
		
		
		
		
		
		scanner.close();
		
	}

}
