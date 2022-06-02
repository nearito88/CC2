package com.example.abdessamadjebari;
import java.io.Serializable;

public class Entreprise implements Serializable {
    private int id;
    private String raison_social;
    private String Adresse;
    private double Capitale;
}
public Entreprise(){

}
public Entreprise(int id, string raison_social,string Adresse,double Capitale){
    this.id=id;
    this.raison_social=raison_social;
    this.Adresse=Adresse;
    this.Capitale=Capitale;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaison_social() {
        return raison_social;
    }

    public void setRaison_social(String raison_social) {
        this.raison_social = raison_social;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public double getCapitale() {
        return Capitale;
    }

    public void setCapitale(double capitale) {
        Capitale = capitale;
    }

