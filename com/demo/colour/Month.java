package com.demo.colour;

import java.util.ArrayList;
import java.util.List;

public class Month {
	public static void main(String[] args) {
		List<String> month=new ArrayList<>();
		month.add("January");
		month.add("february");
		month.add("march");
		month.add("april");
		
		for(String i:month) {
			System.out.print(i+" ");
		}
	}

}
