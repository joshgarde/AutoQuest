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
public class CharacterSheet {
    private String name;
    private int str;
    private int con;
    private int dex;
    private int inte;
    
    public CharacterSheet(String name, int str, int con, int dex, int inte) {
        this.name = name;
        this.str = str;
        this.con = con;
        this.dex = dex;
        this.inte = inte;
    }
    
    public String getName() {
        return name;
    }
    
    public int getStr() {
        return str;
    }
    
    public int getCon() {
        return con;
    }
    
    public int getDex() {
        return dex;
    }
    
    public int getInt() {
        return inte;
    }
}
