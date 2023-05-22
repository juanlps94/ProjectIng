/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan
 */
public class Habitacion {
    String name;
    String data;
    boolean disp;
    String cantCamas;
    String cantHuesp;

    public Habitacion(String name, String data, String cantCamas, String cantHuesp) {
        this.name = name;
        this.data = data;
        this.disp = false;
        this.cantCamas = cantCamas;
        this.cantHuesp = cantHuesp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public String getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(String cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getCantHuesp() {
        return cantHuesp;
    }

    public void setCantHuesp(String cantHuesp) {
        this.cantHuesp = cantHuesp;
    }
    
}
