import java.util.ArrayList;
import java.util.Scanner;

class EvidencePojisteni {
    public ArrayList<Pojisteny> seznamPojistenych = new ArrayList<>();

    public void pridejPojisteneho(Pojisteny pojisteny) {
        seznamPojistenych.add(pojisteny);
    }

    public void vypisVsechnyPojistene() {
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println(pojisteny);
        }
    }

    public Pojisteny najdiPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                return pojisteny;
            }
        }

        return null;
    }
}

