/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

import java.util.Random;

/**
 *
 * @author ncc
 */
public class QuestList {
   private static String [] questList = {
       "Go to Florida",
       "Go to Alaska", //
       "Go Black Friday Shopping", //
       "Stay Home", //
       "Go to the Forest", //
       "Explore a Cave", //
       "Go to a Rave", //
       "Land on an Island", //
       "Go to Viridian City Gym", //
       "Go to the Apple Store", //
       "Go to Java Class", //
       "Buy Some Butter",
       "Learn to Walk",
       "Catch Some Pokemon",
       "Be the Best like No One ever was",
       "Find the Meaning of Life",
       "Make Friends",
       "Get Lunch",
       "Teach a Machine to Love",
       "Get a Job"
   };
   
   public static String fetchQuest() {
       Random rand = new Random();
       String quest;
       int roll;
       
       roll = rand.nextInt(19);
       quest = questList[roll];
       
       return quest;
       
   }
           
   
    
}
