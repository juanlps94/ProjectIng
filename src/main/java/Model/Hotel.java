/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan
 */
public class Hotel {
    String nameHotel;
    String rank;
    String infHotel;
    String opinion;
    String conjuntoR;

    public Hotel(String nameHotel, String rank, String infHotel, String opinion, String conjuntoR) {
        this.nameHotel = nameHotel;
        this.rank = rank;
        this.infHotel = infHotel;
        this.opinion = opinion;
        this.conjuntoR = conjuntoR;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getInfHotel() {
        return infHotel;
    }

    public void setInfHotel(String infHotel) {
        this.infHotel = infHotel;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getConjuntoR() {
        return conjuntoR;
    }

    public void setConjuntoR(String conjuntoR) {
        this.conjuntoR = conjuntoR;
    }
    
}

