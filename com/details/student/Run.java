package com.details.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Student> student=new ArrayList<>(10);
		for(int i=0;i<10;i++) {
			student.add(new Student(scanner.nextInt(),scanner.next(),scanner.next()));
			
		}
		Comparator<Student> com=new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				return(s1.getName().compareTo(s2.getName()));
					
			}
		};
	
		Collections.sort(student,com);
		
		for(Student st:student) {
			System.out.println(st);
		}
		scanner.close();
		
	}

}
