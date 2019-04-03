/*
 * Lancement de l'application
 *  
 */

import vue.InterfaceCarnet;

/**
 * @author Adeline, Christophe, Cyril, Christine
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // construit la vue
        InterfaceCarnet carnet = new InterfaceCarnet();

        carnet.setVisible(true);
    }

}
