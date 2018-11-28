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
public class NarrativeDust {
    private static String[] motivations = {
        "A sudden mystical force tells you to: ",
        "Your mom yelled at you to get out of the house and to: ",
        "Dave, from the gas station asked you to: ",
        "A voice inside your head told you to: ",
        "A gust of wind pushed you to a billboard commanding you to: ",
        "Killer clowns at the edge of town are holding your town hostage, and the only way to stop them is to: ",
        "Your dead uncle's second sister came to you in a dream last night telling you to: ",
        "You were bored as hell and you decided to: ",
        "YOLO, therefore: ",
        "[Insert Motivation Here]: ",
        "Your iPhone told you to: ",
    };
    
    private static String[] difficulties = {
        "This battle is quite difficult, trust me.",
        "\"Phew - it's really tough battling these things\" - Your character",
        "\"Wow - (s)he is really destroying us\" - Some Mob",
        "\"I don't think I could've lasted this long.\" - Game Creator",
        "Body parts flew everywhere in the chaos.",
        "\"Now I am become Death, the destroyer of worlds\" - Your character",
        "Blood was dripping off your sword after this encounter.",
        "[Insert Difficulty Text Here]",
        "I know you can't see it, but wow - this battle is really intense man.",
        "The monster still stands, but it is severely weakened."
    };
    
    public static String motivationGenerator() {
        Random random = new Random();
        return motivations[random.nextInt(11)];
    }
    
    public static String difficultyGenerator() {
        Random random = new Random();
        return difficulties[random.nextInt(11)];
    }
}
