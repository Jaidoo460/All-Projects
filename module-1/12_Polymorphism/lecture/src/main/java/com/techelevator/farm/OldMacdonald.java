package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {


		List<SingAboutable> farmSingables = new ArrayList<>();

		farmSingables.add(new Cow());
		farmSingables.add(new Chicken());
		farmSingables.add(new Tractor( "Big Green", "Vrooooom"));

		for (SingAboutable singableThing : farmSingables) {
			System.out.println("------------------");
			System.out.println(singableThing.getClass());



			//IF I CAN INSPECT THE TYPE OF THE OBJECT, I CAN CAST IT TO
			//ITS BASE TYPE AND TREAT IT AS IF IT WERE THAT BASE TYPE
			if(singableThing instanceof Tractor){
				((Tractor)singableThing).hitchTiller();

			}

			System.out.println("------------------");
			singOMD(singableThing);

		}

		List<Sellable> sellables = new ArrayList<>();

		sellables.add(new Cow());
		sellables.add(new Egg());

		for(Sellable sellableThing : sellables){
			System.out.println("------------------------");

			System.out.println("Stop right up! Get your " + sellableThing);
			System.out.println("Today only, just: $" + sellableThing.getPrice());

			System.out.println("------------------------");
		}

	}

	public static void singOMD(SingAboutable singableThing){

		String name = singableThing.getName();
		String sound = singableThing.getSound();
		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();
	}
}