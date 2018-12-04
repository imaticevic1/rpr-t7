package ba.unsa.etf.rpr.tutorijal7;

import java.beans.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public static ArrayList<Grad> ucitajGradove(){
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
        /*try{
            while(ulaz.hasNext()){
            }
            if(ulaz.next().getClass() == String.class){
                System.out.println((String)ulaz.next());
            }
        }
        catch (Exception e){
            ulaz.close();
        }*/
        return null;
    }
    public static void main(String[] args){
        ucitajGradove();
    }
}
