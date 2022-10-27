package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Banka {
    private long brojRacuna;
    protected ArrayList<Korisnik> korisnici;
    protected ArrayList<Uposlenik> uposlenici;
    public Banka() {
    }
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        return new Korisnik(ime, prezime);
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        return new Uposlenik(ime, prezime);
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        return new Racun(0, korisnik);
    }
}
