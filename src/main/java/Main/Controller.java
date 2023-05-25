/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Model.Ciudad;
import Model.Usuario;
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
    public V_Inicio v1;
    public V_Login v2;
    public V_Modificar_Ciudad v3;
    public V_Modificar_Hotel v4;
    public V_Pago v5;
    public V_Perfil_Modficar v6;
    public V_Regis_Ciudad v7;
    public V_Regis_Hotel v8;
    public V_SingIn v9;
    public V_HotelList v10;
    public V_Feedback v11;
    public V_EliminarHotel v12;
    public V_EliminarCiudad v13;
    public V_CityList v14;
   
    //Constructor
    
    
    public static void main(String[] args) {
        V_Inicio v1 = new V_Inicio();
        v1.setVisible(true);
    }
}
