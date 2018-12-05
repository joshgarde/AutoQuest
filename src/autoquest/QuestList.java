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
       "Go To Florida",
       "Go To Alaska", //
       "Go Black Friday Shopping", //
       "Stay Home", //
       "Go To Forest", //
       "Explore A Cave", //
       "Go To A Rave", //
       "Land On Island", //
       "Go To Viridian City Gym", //
       "Go To Apple Store", //
       "Go To Java Class", //
       "Buy Some Butter",
       "Learn To Walk",
       "Catch Some Pokemon",
       "Be The Best Like No One Ever Was",
       "Find The Meaning Of Life",
       "Make Friends",
       "Get Lunch",
       "Teach A Machine To Love",
       "Get A Job"
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
