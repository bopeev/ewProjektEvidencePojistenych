import java.util.ArrayList;
import java.util.Scanner;

class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }


    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Příjmení: " + prijmeni + ", Věk: " + vek + ", Telefon: " + telefon;
    }


}

