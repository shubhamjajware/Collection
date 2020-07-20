package com.store.month;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		LinkedHashMap<String,Integer> month=new LinkedHashMap<>();
		System.out.println("ENter the range");
		Integer range=scanner.nextInt();
		if(range>12 || range<12){
			System.out.println("Invalid input::Input must be 12");
		}
		else
		{
		System.out.println("ENter the month and its value");
		for(int i=0;i<range;i++) {
			month.put(scanner.next(), scanner.nextInt());
		}
		for(Map.Entry<String, Integer> a:month.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
			
		}
		
		if(month.containsKey("september"))
			System.out.println(month.get("september"));
		else
			System.out.println("september not present");
		
		if(month.containsKey("march")) 
			month.remove("march");
		else
			System.out.println("march not present");
		
		/*Iterator<Map.Entry<String, Integer>> iterate=month.entrySet().iterator();
		while(iterate.hasNext()) {
			Map.Entry<String, Integer> entry=iterate.next();
			if(month.containsKey("september"))
				System.out.println(entry.getValue());
			
		}*/
		System.out.println("map is: "+month);
		
		
		
		}
		scanner.close();
		}
	}
	
