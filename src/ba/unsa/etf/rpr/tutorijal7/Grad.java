package ba.unsa.etf.rpr.tutorijal7;
import java.beans.*;
import java.io.*;

public class Grad {
    private String naziv;
    private int brojStanovnika;
    double[] temperature = new double[1000];

    public Grad(String naziv, int brojStanovnika, double[] temerature) {
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.temperature = temerature;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temerature) {
        this.temperature = temerature;
    }
}
