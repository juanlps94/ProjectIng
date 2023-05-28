/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Logic {
    private PreparedStatement PS = null;
    private Connect CN = new Connect();
    private final String SQL_INSERT = "INSERT INTO users (name,last,email,password,phone,rol) values(?,?,?,?,?,?)";
 
     public void CrearUsuario(String name, String email, String last, String pass, String phone, boolean rol, int id) {
        
        try {
            PS = CN.conector().prepareStatement(SQL_INSERT);
            PS.setString(1,name);
            PS.setString(2,last);
            PS.setString(3,email);
            PS.setString(4,pass);
            PS.setString(5,phone);
            PS.setString(6, null);
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registrado Correctamente!!");
        } catch (Exception e) {
            System.err.println("error al guardar los datos: " + e);
        }

    }
}
