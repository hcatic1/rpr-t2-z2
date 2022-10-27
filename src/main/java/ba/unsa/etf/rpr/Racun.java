package ba.unsa.etf.rpr;

public class Racun {
    protected long brojRacuna;
    protected Osoba korisnikRacuna;
    protected boolean odobrenjePrekoracenja;
    protected Double stanjeRacuna;

    public Racun(long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    private boolean provjeraOdobrenjaPrekoracenja(Double prekoracenje){
        return true;
    }
    public boolean izvrsiUplatu(Double uplata){
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata){
        return true;
    }
    public void odobriPrekoracenje(Double prekoracenje){
    }
}
