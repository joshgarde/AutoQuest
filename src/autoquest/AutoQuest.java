/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoquest;

import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;

/**
 *
 * @author ncc
 */
public class AutoQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
        System.out.println(LibVlc.INSTANCE.libvlc_get_version());
        new NativeDiscovery().discover();
        
        KillingList.initializeMonsters();
        Equipment.equipmentLevels();
        
        MainMenu window = new MainMenu();
        window.setVisible(true);
    }
    
}
