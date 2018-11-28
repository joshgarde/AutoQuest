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
        
        if (location == "Go To Alaska")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }
        if (location == "Go To Florida")
        {
            ArrayList<String> florida = monster.get("Florida");
            
        }if (location == "Go Black Friday Shopping")
        {
            ArrayList<String> blackFridayShopping = monster.get("Black Friday Shopping @ Walmart");
        }if (location == "Stay Home")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }
        if (location == "Go To Forest")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Explore A Cave")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Go to a Rave")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Land on Island")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Go to Viridian City Gym")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Go to the Apple Store")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Go to Java Class")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Buy Some Butter")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Learn to Walk")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Catch Some Pokemon")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Be The Best like No One ever was")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Find the Meaning of Life")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Make Friends")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Get Lunch")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Teach a Machine to Love")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }if (location == "Get a Job")
        {
            ArrayList<String> alaska = monster.get("Alaska");
        }
        return " ";
    }
}
