package cz.itnetwork.projectzkouska;

// Třída s konzolovým rozhraním

import java.util.Scanner;
import java.util.List;

public class KonzolovaAplikace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        EvidenceOsob evidence = new EvidenceOsob();

        while (true) {
            System.out.println("1. Pridat nového pojištěného");
            System.out.println("2. Vypsat všechny pojištěné");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Konec");
            System.out.print("Vyberte si akci: ");
            int vyber = scanner.nextInt();
            scanner.nextLine();

            switch (vyber) {
                case 1:
                    // Přidání nové pojištěné osoby
                    System.out.print("Zadejte jméno pojištěného: ");
                    String Jmeno = scanner.nextLine();
                    System.out.print("Zadejte příjmení: ");
                    String Prijmeni = scanner.nextLine();
                    System.out.print("Zadejte věk: ");
                    int Vek = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Zadejte telefonní číslo: ");
                    String TelefonniCislo = scanner.nextLine();
                    PojistenaOsoba Osoba = new PojistenaOsoba(Jmeno, Prijmeni, Vek, TelefonniCislo);
                    evidence.pridatPojistenouOsobu(Osoba);
                    break;
                case 2:
                    // Výpis všech pojištěných osob
                    List<PojistenaOsoba> allPeople = evidence.pridatPojisteneLide();
                    for (PojistenaOsoba p : allPeople) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    // Vyhledání pojištěné osoby podle jména a příjmení
                    System.out.print("Zadej jméno pojištěného: ");
                    String hledatJmeno = scanner.nextLine();
                    System.out.print("Zadej příjmení: ");
                    String hledatPrijmeni = scanner.nextLine();
                    PojistenaOsoba Nalezena = evidence.najdiPojistencePodleJmena(hledatJmeno, hledatPrijmeni);
                    if (Nalezena != null) {
                        System.out.println("Nalezena osoba: " + Nalezena);
                    } else {
                        System.out.println("Nenalezeno.");
                    }
                    break;
                case 4:
                    // Ukončení aplikace
                    System.out.println("Data byla uložena. Pokračujte libovolnou klavesou...");
                    System.exit(0);
                default:
                    System.out.println("Nesprávně. Zkuste ještě jednou.");
            }
        }
    }
}
