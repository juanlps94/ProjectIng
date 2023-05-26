/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import Model.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import view.*;

/**
 *
 * @author Juan
 */
public class Controller {
    
    //variables de las interfaces, singlenton y otros.
    public V_Inicio vistaInicio = new V_Inicio();
   

    //Constructor
    public Controller() {
    }

    public void setV() {
        this.vistaInicio.setVisible(true);
    }

    //Constructor
    public static void main(String[] args) {
        Controller principal = new Controller();
        principal.setV();
    }
}
