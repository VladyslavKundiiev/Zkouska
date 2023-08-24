package cz.itnetwork.projectzkouska;

import java.util.ArrayList;
import java.util.List;

// Třída pro evidenci pojištěných osob
public class EvidenceOsob {
    private final List<PojistenaOsoba> pojistenci;

    // Konstruktor pro inicializaci kolekce
    public EvidenceOsob() {
        pojistenci = new ArrayList<>();
    }

    // Metoda pro přidání pojištěné osoby do seznamu
    public void pridatPojistenouOsobu(PojistenaOsoba Osoba) {
        pojistenci.add(Osoba);
    }

    // Metoda pro získání seznamu všech pojištěných osob
    public List<PojistenaOsoba> pridatPojisteneLide() {
        return pojistenci;
    }

// Metoda pro vyhledání pojištěné osoby podle jména a příjmení
    public PojistenaOsoba najdiPojistencePodleJmena(String Jmeno, String Prijmeni) {
        for (PojistenaOsoba Osoba : pojistenci) {
            if (Osoba.ukazJmeno().equals(Jmeno) && Osoba.ukazPrijmeni().equals(Prijmeni)) {
                return Osoba;
            }
        }
        return null; // Osoba nenalezena
    }
}