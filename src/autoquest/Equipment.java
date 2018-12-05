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
    private String headGear = "Head: ";
    private String faceGear = "Face: ";
    private String neckGear = "Neck: ";
    private String chestGear = "Chest: ";
    private String greavesGear = "Greaves: ";
    private String gloveGear = "Gloves: ";
    private String pantsGear = "Pants: ";
    private String footGear = "Shoes: ";
    
    public void equipmentLevels(){
     equipment.put(1, "Plastic Helm");
     equipment.put(2, "Plastic Goggles");
     equipment.put(3, "Plastic Necklace");
     equipment.put(4, "Plastic Shirt");
     equipment.put(5, "Plastic Greaves");
     equipment.put(6, "Plastic Gloves");
     equipment.put(7, "Plastic Pants");
     equipment.put(8, "Plastic Shoes");
     equipment.put(9, "Leather Helm");
     equipment.put(10, "Leather Goggles");
     equipment.put(11, "Leather Necklace");
     equipment.put(12, "Leather Shirt");
     equipment.put(13, "Leather Greaves");
     equipment.put(14, "Leather Gloves");
     equipment.put(15, "Leather Pants");
     equipment.put(16, "Leather Boots");
     equipment.put(17, "Iron Helm");
     equipment.put(18, "Iron Mask");
     equipment.put(19, "Iron Necklace");
     equipment.put(20, "Iron Chestplate");
     equipment.put(21, "Iron Greaves");
     equipment.put(22, "Iron Gloves");
     equipment.put(23, "Iron Pants");
     equipment.put(24, "Iron Boots");
     equipment.put(25, "Steel Helm");
     equipment.put(26, "Steel Mask");
     equipment.put(27, "Steel Necklace");
     equipment.put(28, "Steel Chestplate");
     equipment.put(29, "Steel Greaves");
     equipment.put(30, "Steel Gloves");
     equipment.put(31, "Steel Pants");
     equipment.put(32, "Steel Boots");
     equipment.put(33, "Adamantium Helm");
     equipment.put(34, "Adamantium Mask");
     equipment.put(35, "Adamantium Necklace");
     equipment.put(36, "Adamantium Chestplate");
     equipment.put(37, "Asamantium Greaves");
     equipment.put(38, "Adamantium Gloves");
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
        if(newItem.contains("Shirt") || newItem.contains("Chestplate")){
            return "Chest: " + newItem;
        }
        if(newItem.contains("Greaves")){
            return "Greaves: " + newItem;
        }
        if(newItem.contains("Gloves")){
            return "Gloves: " + newItem;
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
