/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author ncc
 */
public class KillingList {
    HashMap<String, ArrayList> monster = new HashMap();

    private String [] killingList =
    {
    "John W. O'Connor" ,
    "The REAL John W. O'Connor" ,
    "Slime" ,
    "Big Slime" ,
    "Bigger Slime",
    "Biggest Slime",
    "Dire Biggest Slime",
    "Wolf",
    "Dire Wolf",
    "Boar",
    "Dire Boar",
    "Tiger",
    "Skeleton",
    "Void Skeleton",
    "Skeletor!",
    "Zombie",
    "Zombonie",
    "Thief",
    "Robber",
    "Highway Man",
    "Squire",
    "Knight",
    "Paladin",
    "Witch",
    "Sorcerer",
    "Wizard",
    "Warlock",
    "Arch-Mage",
    "Buggy Code",
    "Blue Screens and Crashes",
    "Registering for Classes",
    "Interviews",
    "Sauron",
    "Thanos",
    "Starlord's Dance Moves",
    "4GB of RAM",
    "Minimum Settings",
    "GPU Sag",
    "Vertical Graphics Card Mount",
    "Minion 1",
    "Minion 2",
    "Minion 4",
    "Spicy Noodle Challenge",
    "The Kardashians",
    "Polar Bear",
    "Penguin",
    "Blockbuster Employee",
    "Guy Stealing a TV",
    "Cashier",
    "An Binch",
    "Officer Trying to Arrest You",
    "Big Black Bear",
    "Senpai",
    "Murlocks",
    "Your Lost Lover",
    "Some Wood ;^)",
    "Dwarf",
    "The Legendary Bird, Moltres",
    "Yourself",
    "Pirates",
    "Da Booty",
    "Stranded People",
    "Tyranitar",
    "Solrock",
    "Shuckle",
    "Sudowoodo",
    "IPhones",
    "IMacs",
    "Apple Employee",
    "IPads",
    "Apple Watches",
    "Unsorted List",
    "Sorted List",
    "Algorithms",
    "Classes",
    "Hashmaps"
    };
    
    public void initializeMonsters()
    {
        ArrayList<String> viridianGym = new ArrayList();
        ArrayList<String> goToAlaska = new ArrayList();
        ArrayList<String> goBlackFridayShoppingAtWalmart = new ArrayList();
        ArrayList<String> stayHome = new ArrayList();
        ArrayList<String> goToForest = new ArrayList();
        ArrayList<String> goToARave = new ArrayList();
        ArrayList<String> landOnIsland = new ArrayList();
        ArrayList<String> exploreACave = new ArrayList();
        ArrayList<String> goToAppleStore = new ArrayList();
        ArrayList<String> goToJavaClass = new ArrayList();
        
        viridianGym.add("Tyranitar");
        viridianGym.add("Solrock");
        viridianGym.add("Shuckle");
        viridianGym.add("Sudowoodo");
        goToAlaska.add("Polar Bear");
        goToAlaska.add("Penguin");
        goToAlaska.add("Blockbuster Employee");
        goBlackFridayShoppingAtWalmart.add("Guy Stealing a TV");
        goBlackFridayShoppingAtWalmart.add("Cashier");
        goBlackFridayShoppingAtWalmart.add("An Binch");
        goBlackFridayShoppingAtWalmart.add("Officer Trying to Arrest You");
        stayHome.add("Relax");
        goToForest.add("Big Black Bear");
        goToForest.add("Senpai");
        goToForest.add("Murlocks");
        goToForest.add("Your Lost Lover");
        goToForest.add("Some Wood ;^)");
        goToARave.add(" ");
        landOnIsland.add("Pirates");
        landOnIsland.add("Da Booty");
        landOnIsland.add("Stranded People");
        exploreACave.add("Dwarf");
        exploreACave.add("The Legendary Bird, Moltres");
        exploreACave.add("Yourself");
        goToAppleStore.add("IPhones");
        goToAppleStore.add("IMacs");
        goToAppleStore.add("Apple Employee");
        goToAppleStore.add("IPads");
        goToAppleStore.add("Apple Watches");
        goToJavaClass.add("Unsorted List");
        goToJavaClass.add("Sorted List");
        goToJavaClass.add("Algorithms");
        goToJavaClass.add("Classes");
        goToJavaClass.add("Hashmaps");
        
        monster.put("Viridian Gym", viridianGym);
        
        monster.put("Alaska", goToAlaska);
        monster.put("Black Friday Shopping @ Walmart", goBlackFridayShoppingAtWalmart);
        monster.put("Home", stayHome);
        monster.put("Forest", goToForest);
        monster.put("Rave", goToARave);
        monster.put("Landing on Island", landOnIsland);
        monster.put("Exploring Cave", exploreACave);
        monster.put("Going to Apple Store", goToAppleStore);
        monster.put("Attending Java Class", goToJavaClass);
    }
    
    public String generateMonster(String location) {
        
        Random rand = new Random();
        
        if (location == "Go To Alaska")
        {
            ArrayList<String> alaska = monster.get("Alaska");
            int n = rand.nextInt(alaska.size());
            return (alaska.get(n));  
        }
        if (location == "Go To Florida")
        {
            ArrayList<String> florida = monster.get("Florida");
            int n = rand.nextInt(florida.size());
            return (florida.get(n));
            
        }if (location == "Go Black Friday Shopping")
        {
            ArrayList<String> blackFridayShopping = monster.get("Black Friday Shopping @ Walmart");
            int n = rand.nextInt(blackFridayShopping.size());
            return (blackFridayShopping.get(n));
        }if (location == "Stay Home")
        {
            ArrayList<String> stayHome = monster.get("Stay Home");
            int n = rand.nextInt(stayHome.size());
            return (stayHome.get(n));
        }
        if (location == "Go To Forest")
        {
            ArrayList<String> goToForest = monster.get("Go To Forest");
            int n = rand.nextInt(goToForest.size());
            return (goToForest.get(n));
        }if (location == "Explore A Cave")
        {
            ArrayList<String> exploreACave = monster.get("Explore A Cave");
            int n = rand.nextInt(exploreACave.size());
            return (exploreACave.get(n));
        }if (location == "Go to a Rave")
        {
            ArrayList<String> goToARave = monster.get("Go To A Rave");
            int n = rand.nextInt(goToARave.size());
            return (goToARave.get(n));
        }if (location == "Land on Island")
        {
            ArrayList<String> landOnIsland = monster.get("Land On Island");
            int n = rand.nextInt(landOnIsland.size());
            return (landOnIsland.get(n));
        }if (location == "Go to Viridian City Gym")
        {
            ArrayList<String> goToViridianCityGym = monster.get("Go To Viridian City Gym");
            int n = rand.nextInt(goToViridianCityGym.size());
            return (goToViridianCityGym.get(n));
        }if (location == "Go to the Apple Store")
        {
            ArrayList<String> goToTheAppleStore = monster.get("Go To The Apple Store");
            int n = rand.nextInt(goToTheAppleStore.size());
            return (goToTheAppleStore.get(n));
        }if (location == "Go to Java Class")
        {
            ArrayList<String> goToJavaClass = monster.get("Go To Java Class");
            int n = rand.nextInt(goToJavaClass.size());
            return (goToJavaClass.get(n));
        }if (location == "Buy Some Butter")
        {
            ArrayList<String> buySomeButter = monster.get("Buy Some Butter");
            int n = rand.nextInt(buySomeButter.size());
            return (buySomeButter.get(n));
        }if (location == "Learn to Walk")
        {
            ArrayList<String> learnToWalk = monster.get("Learn To Walk");
            int n = rand.nextInt(learnToWalk.size());
            return (learnToWalk.get(n));
        }if (location == "Catch Some Pokemon")
        {
            ArrayList<String> catchSomePokemon = monster.get("Catch Some Pokemon");
            int n = rand.nextInt(catchSomePokemon.size());
            return (catchSomePokemon.get(n));
        }if (location == "Be The Best like No One ever was")
        {
            ArrayList<String> beTheBestLikeNoOneEverWas = monster.get("Be The Best Like No One Ever Was");
            int n = rand.nextInt(beTheBestLikeNoOneEverWas.size());
            return (beTheBestLikeNoOneEverWas.get(n));
        }if (location == "Find the Meaning of Life")
        {
            ArrayList<String> findTheMeaningOfLife = monster.get("Find The Meaning Of Life");
            int n = rand.nextInt(findTheMeaningOfLife.size());
            return (findTheMeaningOfLife.get(n));
        }if (location == "Make Friends")
        {
            ArrayList<String> makeFriends = monster.get("Make Friends");
            int n = rand.nextInt(makeFriends.size());
            return (makeFriends.get(n));
        }if (location == "Get Lunch")
        {
            ArrayList<String> getLunch = monster.get("Get Lunch");
            int n = rand.nextInt(getLunch.size());
            return (getLunch.get(n));
        }if (location == "Teach a Machine to Love")
        {
            ArrayList<String> teachAMachineToLove = monster.get("Teach A Machine To Love");
            int n = rand.nextInt(teachAMachineToLove.size());
            return (teachAMachineToLove.get(n));
        }if (location == "Get a Job")
        {
            ArrayList<String> getAJob = monster.get("Get A Job");
            int n = rand.nextInt(getAJob.size());
            return (getAJob.get(n));
        }
        return "Well something went wrong and we dont know either so dont ask";
    }
}
