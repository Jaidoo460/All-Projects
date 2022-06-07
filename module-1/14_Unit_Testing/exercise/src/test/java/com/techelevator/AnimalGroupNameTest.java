package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AnimalGroupNameTest {


    AnimalGroupName animals;


    @Before
    public void setup() {
        animals = new AnimalGroupName();
    }

    @Test
    public void when_given_mappedAnimal_in_lowerCase() {
        Map<String, String> animalsTest = new HashMap<>();
        String animalName = "rhino";
        String animalGroup = "Crash";
        animalsTest.put(animalName, animalGroup);
        String animalGroupTest = animalsTest.get(animalName.toLowerCase());
        String actual = animals.getHerd(animalName);
        Assert.assertEquals("If animal located in AnimalGroupName and given in lowercase return groupName", animalGroupTest, actual);

    }

    @Test
    public void when_given_mappedAnimal_in_upperCase() {
        Map<String, String> animalsTest = new HashMap<>();
        String animalName = "RHINO";
        String animalGroup = "Crash";
        animalsTest.put(animalName.toLowerCase(), animalGroup);
        String animalGroupTest = animalsTest.get(animalName.toLowerCase());
        String actual = animals.getHerd(animalName);
        Assert.assertEquals("If animal located in AnimalGroupName and given in uppercase return groupName", animalGroupTest, actual);

    }

    @Test
    public void when_given_animal_not_mapped_in_AnimalGroupName(){
        String animalGroupTest = "unknown";
        String unknownAnimal = "Monica";
        String actual = animals.getHerd(unknownAnimal);
        Assert.assertEquals("If animal not located in AnimalGroupName return unknown", "unknown",actual);
    }
}
