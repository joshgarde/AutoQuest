/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ncc
 */
public class ItemList {
    private static final Map<String, Integer> itemList = createMap();
    private String drop;
    
    private static Map<String, Integer> createMap() {
        Map<String, Integer> itemList = new HashMap<>();

        itemList.put("Shiny Rock", 10);
        itemList.put("Icy Rock", 7);
        itemList.put("Hot Rock", 7);
        itemList.put("Wet Rock", 5);
        itemList.put("Beetle", 15);
        itemList.put("Shiny Beetle", 25);
        itemList.put("Centiped", 19);
        itemList.put("Lost Keys", 5);
        itemList.put("Pet Hamster", 100);
        itemList.put("Infinity Gauntlet", 1);
        itemList.put("Moldy Fries", 3);
        itemList.put("Heinz Ketchup™", 29);
        itemList.put("Stan Lee in the Soul Stone", 95);
        itemList.put("Beetz™ Headphones", 34);
        itemList.put("MePhone", 99);
        itemList.put("NetBean", 1);
        itemList.put("Disoriented Gauntlet", 88);
        itemList.put("9Up™", 9);
        itemList.put("WcDonald's Chimkn Nuggs", 10);
        itemList.put("Big Book of Random Facts", 29);
        itemList.put("Death Note™", 69);
        itemList.put("Lizard™ Sandals", 50);
        itemList.put("Waifu Body Pillow", 98);
        itemList.put("BitCoin", 1);
        itemList.put("I Don't Know If This Is Butter! Or Is It? Maybe? Probably...", 45);
        itemList.put("Windows 98 Laptop", 89);
        itemList.put("Blue Screen", -0);
        itemList.put("Cute Selfie, Might Delete Later", 6);
        itemList.put("AHR GEE BEE PC", 150);
        itemList.put("bUGS", 200);
        itemList.put("Frayed Charging Wire", 10);
        itemList.put("Lost Weave", 2);
        itemList.put("Hand Sanitizer", 5);
        itemList.put("Balenciaga™ Crocs™", 999);
        itemList.put("Knock Off Off White™ Sweater", 50);
        itemList.put("SOOPREEM™ Clothing Item", 150);
        itemList.put("Lost Time Capsule", 18);
        itemList.put("4K 144hz Monitor", 9999);
        itemList.put("Lost Cabages", 1);
        itemList.put("Spare Soy Sauce", 20);
        itemList.put("A Lot Of Money", 1);
        itemList.put("Packing Peanuts", 2);
        itemList.put("DrugZ", 420);
        itemList.put("Slice of Life Manga", 11);
        itemList.put("Forgotten Birthday Card With 20 Gold Inside", 20);
        itemList.put("Reddit", 97);
        itemList.put("Lotion", 66);
        itemList.put("Goochie Belt", 78);
        itemList.put("StayPlastion", 300);
        itemList.put("Power Bank with 12% charge", 12);
        itemList.put("A \"Canvas\" Bag", 76);
        itemList.put("Ahr Tee Ekcs 2080TeeAie", 1300);
        itemList.put("John W O'Connor's High Tech Door Bell", 200);
        itemList.put("A Ghost in the Machine", 99);
        itemList.put("Irish Wrist Watch", 23);
        itemList.put("Braised Pork Bowl", 8);
        itemList.put("Mike, AKA Micycle", 25);
        itemList.put("Bike, AKA Bichael", 25);
        itemList.put("A Short Swedish Man", 4269);
        itemList.put("Project: Dave", 18);
        itemList.put("Fallout 76", 0);
        itemList.put("Sharingan", 5);
        itemList.put("BFG AKA Bad Formatting and Games", 999);
        itemList.put("NVMe SSD", 2000);
        itemList.put("Blu Ray Disk Read/Write Drive", 53);
        itemList.put("Yu-Gi-Oh!™ Trading Cards", 32);
        itemList.put("PokeMon™ Trading Cards", 15);
        itemList.put("Spare Change", 3);
        itemList.put("King K Rool's Crown", 18);
        itemList.put("Salad", 1);
        
        return itemList;
    }
    
    public static String dropItem() {
        Random rand = new Random();
        
        ArrayList<String> items = new ArrayList<String>(itemList.keySet());
        return items.get(rand.nextInt(items.size()));
    }
    
    public static Integer dropPrice(String itemDropped) {
        Random rand = new Random();
        Integer bitcoinValue = rand.nextInt(10000);
        int price;
        
        if (itemDropped.equals("BitCoin"))
            price = bitcoinValue;
        else
            price = itemList.get(itemDropped);
        
        return price;
    }
}
