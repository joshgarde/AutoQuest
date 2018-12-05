/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

import java.util.HashMap;

/**
 *
 * @author ncc
 */
public class Equipment {
    private HashMap<Integer, String> equipment = new HashMap<>();
    
    public void equipmentLevels(){
     equipment.put(1, "Plastic Helm");
     equipment.put(2, "Plastic Goggles");
     equipment.put(3, "Plastic Necklace");
     equipment.put(4, "Plastic Shirt");
     equipment.put(5, "Plastic Greaves");
     equipment.put(6, "Plastic Gauntlets");
     equipment.put(7, "Plastic Pants");
     equipment.put(8, "Plastic Shoes");
     equipment.put(9, "Leather Helm");
     equipment.put(10, "Leather Goggles");
     equipment.put(11, "Leather Necklace");
     equipment.put(12, "Leather Shirt");
     equipment.put(13, "Leather Greaves");
     equipment.put(14, "Leather Gauntlets");
     equipment.put(15, "Leather Pants");
     equipment.put(16, "Leather Boots");
     equipment.put(17, "Iron Helm");
     equipment.put(18, "Iron Mask");
     equipment.put(19, "Iron Necklace");
     equipment.put(20, "Iron Chestplate");
     equipment.put(21, "Iron Greaves");
     equipment.put(22, "Iron Gauntlets");
     equipment.put(23, "Iron Pants");
     equipment.put(24, "Iron Boots");
     equipment.put(25, "Steel Helm");
     equipment.put(26, "Steel Mask");
     equipment.put(27, "Steel Necklace");
     equipment.put(28, "Steel Chestplate");
     equipment.put(29, "Steel Greaves");
     equipment.put(30, "Steel Gauntlets");
     equipment.put(31, "Steel Pants");
     equipment.put(32, "Steel Boots");
     equipment.put(33, "Adamantium Helm");
     equipment.put(34, "Adamantium Mask");
     equipment.put(35, "Adamantium Necklace");
     equipment.put(36, "Adamantium Chestplate");
     equipment.put(37, "Asamantium Greaves");
     equipment.put(38, "Adamantium Gauntlets");
     equipment.put(39, "Adamantium Pants");
     equipment.put(40, "Adamantium Boots");
    }
    
    public String levelUp(Integer level){
        String newItem;
        
        newItem = equipment.get(level);
        
        if(newItem.contains("Helm")){
            return "Head: " + newItem;
        }
        if(newItem.contains("Goggles") || newItem.contains("Mask")){
            return "Face: " + newItem;
        }
        if(newItem.contains("Necklace")){
            return "Neck: " + newItem;
        }
        if(newItem.contains("Shirt") || newItem.contains("Chestplate")){
            return "Chest: " + newItem;
        }
        if(newItem.contains("Greaves")){
            return "Greaves: " + newItem;
        }
        if(newItem.contains("Gauntlets")){
            return "Gauntlets: " + newItem;
        }
        if(newItem.contains("Pants")){
            return "Pants: " + newItem;
        }
        if(newItem.contains("Shoes") || newItem.contains("Boots")){
            return "Shoes: " + newItem;
        }
        
        else
            return "You're currently naked. Get some clothes!!!";
    }
}
