package com.unique.number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class SortedOrder {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashSet<String> str=new HashSet<>();
		System.out.println("Enter the range");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			str.add(scanner.next());
		}
		
		Iterator<String> iterate=str.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		scanner.close();
	}

}
