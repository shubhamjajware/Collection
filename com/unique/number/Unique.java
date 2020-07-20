package com.unique.number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Unique {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		HashSet<Integer> hashset=new HashSet<Integer>();
		System.out.println("Enter the range");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			hashset.add(scanner.nextInt());
		}
		
		Iterator<Integer> itr=hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		scanner.close();
	}

}
