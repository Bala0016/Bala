package org.task;

import java.util.LinkedList;
import java.util.List;

public class User {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<Integer>();
		li.add(2);
		li.add(1);
		li.add(4);
		li.add(3);
		li.add(5);
		
		for (int i = 0; i < li.size(); i = i + 2) {
				for (int j = 0; j < li.size();j=j+2) {
					
					System.out.println(li.get(i));
					System.out.println(li.get(j));
					System.out.println(li.get(i));
					System.out.println(li.get(i));
				}}
					System.out.println("bala");
					System.out.println("vela");
					
					System.out.println("bala");
					System.out.println("Prasanth");


			


}}