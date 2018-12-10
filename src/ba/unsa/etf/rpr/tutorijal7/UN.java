package ba.unsa.etf.rpr.tutorijal7;

import java.util.ArrayList;
import java.beans.*;
import java.io.*;

public class UN {
    private ArrayList<Drzava> drzave = new ArrayList<Drzava>();

    public UN(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }

    public ArrayList<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(ArrayList<Drzava> drzave) {
        this.drzave = drzave;
    }
}
