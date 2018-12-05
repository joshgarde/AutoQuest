/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

/**
 *
 * @author ncc
 */
public class AutoQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        KillingList.initializeMonsters();
        Equipment.equipmentLevels();
        
        MainMenu window = new MainMenu();
        window.setVisible(true);
    }
    
}
