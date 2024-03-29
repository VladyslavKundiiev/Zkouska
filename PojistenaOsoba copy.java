package cz.itnetwork.projectzkouska;

// Třída reprezentující pojištěné osobu
public class PojistenaOsoba {
    private String Jmeno;
    private String Prijmeni;
    private int Vek;
    private String TelefonniCislo;

    // Konstruktor pro inicializaci objektu
    public PojistenaOsoba(String Jmeno, String Prijmeni, int Vek, String TelefonniCislo) {
        this.Jmeno = Jmeno;
        this.Prijmeni = Prijmeni;
        this.Vek = Vek;
        this.TelefonniCislo = TelefonniCislo;
    }
    
    public String ukazJmeno() {
        return Jmeno;
    }

    public String ukazPrijmeni() {
        return Prijmeni;
    }


// Metoda pro formátovaný výpis informací o osobě
    @Override
    public String toString() {
        return "Jméno: " + Jmeno + " " + Prijmeni +
               ", Věk: " + Vek +
               ", Telefonní číslo: " + TelefonniCislo;
    }
}