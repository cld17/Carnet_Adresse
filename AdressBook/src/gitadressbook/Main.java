/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitadressbook;

/**
 *
 * @author A faire 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // construit la vue
        
        //Interface_Carnet carnet = new Interface_Carnet();
        InterfaceVue carnet = new InterfaceVue();
        
        carnet.setVisible(true);
    }
    
}
