package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;

	public String getName( ) {
		return name;
	}

	public final String getSound( ) {

		if(isAsleep) {
			return "ZZZZZZZ zzzzzz";
		}
		return sound;
	}

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public void nap(boolean isAsleep){
		this.isAsleep = isAsleep;

	}

}