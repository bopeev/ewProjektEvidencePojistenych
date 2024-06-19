import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvidencePojisteni evidence = new EvidencePojisteni();
        Scanner scanner = new Scanner(System.in);


        String oddelovac = "--------------------------------------------------------";
        System.out.println(oddelovac);
        System.out.println("Evidence pojistenych");
        System.out.println(oddelovac);
        System.out.println();

        while (true) {
            System.out.println("Vyberte akci (napište číslo akce a potvrďte enter):");
            System.out.println("1 - Přidat pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");

            int volba = scanner.nextInt();
            scanner.nextLine();

            switch (volba) {
                case 1:
                    System.out.println("Jméno: ");
                    String jmeno = scanner.nextLine();
                    System.out.println("Příjmení: ");
                    String prijmeni = scanner.nextLine();

                    int vek;
                    while (true) {
                        System.out.println("Věk: ");
                        String vekString = scanner.nextLine();
                        try {
                            vek = Integer.parseInt(vekString);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Neplatný věk. Zadejte prosím platné číslo.");
                        }
                    }
                    int telefon;
                    while (true) {
                        System.out.println("Telefon (bez předvolby a mezer): ");
                        String telefonString = scanner.nextLine();

                        if (telefonString.length() > 9) {
                            System.out.println("Maximální počet znaků je 9. Zadejte prosím kratší telefonní číslo.");
                        } else if (telefonString.length() < 9) {
                            System.out.println("Telefonní číslo je příliš krátké. Zadejte prosím platné číslo.");
                        } else {
                            try {
                                telefon = Integer.parseInt(telefonString);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Neplatné telefonní číslo. Zadejte prosím platné číslo.");
                            }
                        }
                    }
                    Pojisteny novyPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
                    evidence.pridejPojisteneho(novyPojisteny);
                    System.out.println("Data byla uložena. Pokračujte z výběru akcí nebo aplikaci ukončete. ");
                    break;

                case 2:
                    evidence.vypisVsechnyPojistene();
                    System.out.println("Pokračujte z výběru akcí nebo aplikaci ukončete. ");
                    break;

                case 3:
                    System.out.println("Zadejte jméno: ");
                    String hledaneJmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení: ");
                    String hledanePrijmeni = scanner.nextLine();

                    Pojisteny nalezeny = evidence.najdiPojisteneho(hledaneJmeno, hledanePrijmeni);
                    if (nalezeny != null) {
                        System.out.println("Nalezeno: " + nalezeny);
                    } else {
                        System.out.println("Pojištěný nenalezen.");
                    }
                    System.out.println("Pokračujte z výběru akcí nebo aplikaci ukončete. ");
                    break;

                case 4:
                    System.out.println("Konec programu.");
                    return;

                default:
                    System.out.println("Neplatná volba.");
            }
        }
    }
}