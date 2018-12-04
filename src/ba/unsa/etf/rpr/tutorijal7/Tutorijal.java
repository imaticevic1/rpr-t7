package ba.unsa.etf.rpr.tutorijal7;

import java.beans.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public Tutorijal() {
    }

    public static ArrayList<Grad> ucitajGradove(){
        String linija = "";
        String grad = "";
        double broj;
        int k = 0;
        double[] temperature = new double[1000];
        String br = "";
        ArrayList<Grad> gradovi = new ArrayList<Grad>();
        Scanner ulaz;
        try{
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("Datoteka mjerenja.txt se ne moze otvoriti ili ne postoji");
            System.out.println("Greska: " + e);
            return null;
        }
        try{
            while(ulaz.hasNextLine()) {
                 int brojZareza = 0;
                 grad = "";
                 br = "";
                for(int j = 0; j < k; j++)
                   temperature[j] = 0;
                    k = 0;
                linija = ulaz.nextLine();
                for(int i = 0; i < linija.length(); i++){
                    if(linija.charAt(i) != ',' && brojZareza == 0){
                        grad = grad + linija.charAt(i);
                    }
                    if(linija.charAt(i) != ',' && !Character.isLetter(linija.charAt(i)))
                        br = br + linija.charAt(i);

                    if(linija.charAt(i) == ',' || i == linija.length() - 1){
                        brojZareza++;
                        if(k < 1000 && !br.equals("") ) {
                            temperature[k] = Double.parseDouble(br);
                            k++;
                        }
                        br = "";
                    }
                }
                gradovi.add(new Grad(grad, 0, temperature));
            }
        }
        catch (Exception e){
            System.out.println("greska");
            ulaz.close();
        }
        return gradovi;
    }
    public static void main(String[] args){
        ArrayList<Grad> gradovi = new ArrayList<Grad>();
        gradovi.addAll(ucitajGradove());
        for(Grad g : gradovi) {
            System.out.println(g.getNaziv());
            for (int i = 0; i < 10; i++)
                System.out.println(g.getTemperature()[i]);
        }
    }
}
