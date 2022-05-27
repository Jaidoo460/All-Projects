package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<Integer>myInts = new ArrayList<>();//HOW TO CREATE AN ARRAY
		myInts.add(1);//autoboxinf (wrapping it automatic)
		myInts.add(4);//autoboxinf (wrapping it automatic)
		myInts.add(3);//autoboxinf (wrapping it automatic)
		myInts.add(2);//autoboxinf (wrapping it automatic)


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		myInts.add(4);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		myInts.add(1,4);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		myInts.remove(3);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println(myInts.contains(4));
		System.out.println(myInts.contains(9));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int first = myInts.indexOf(4);
		System.out.println(first);
		int last = myInts.lastIndexOf(4);
		System.out.println(last);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		Integer[] myArray = myInts.toArray(new Integer[0]);
		for(int index = 0; index < myArray.length; index++){
			System.out.println(myArray[index]);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(myInts);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(myInts);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		for(Integer anint : myInts) { //same as the one on top
			System.out.println("next item");
			System.out.println(anint);
		}

	}
}
