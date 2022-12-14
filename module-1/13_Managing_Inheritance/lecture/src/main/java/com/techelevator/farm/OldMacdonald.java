package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {


		List<FarmAnimal> farmAnimals = new ArrayList<>();

		farmAnimals.add(new Cow());
		farmAnimals.add(new Chicken());
		farmAnimals.add(new Pig());
		farmAnimals.add(new BarnCat("Fluffy", "GRRowlll"));
		//farmAnimals.add(new FarmAnimal("Barn", "Creak"));

		(farmAnimals.get(1)).nap(true);
		(farmAnimals.get(3)).nap(true);
		//(farmAnimals.get(4)).nap(true);

		List<Singable> singables = new ArrayList<>();

		singables.addAll(farmAnimals);
		singables.add(new Tractor());


		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}