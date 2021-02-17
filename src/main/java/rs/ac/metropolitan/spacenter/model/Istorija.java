package rs.ac.metropolitan.spacenter.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Istorija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int istorijaId;

    @OneToMany
    private Set<Kupon> listaKupona = new HashSet<>();

    @OneToOne
    private Korisnik korisnik;

    public Istorija() {
    }

    public Istorija(Set<Kupon> listaKupona, Korisnik k) {
        this.listaKupona = listaKupona;
        this.korisnik = k;
    }

    public int getIstorijaId() {
        return this.istorijaId;
    }

    public void setIstorijaId(int istorijaId) {
        this.istorijaId = istorijaId;
    }

    public Set<Kupon> getListaKupona() {
        return this.listaKupona;
    }

    public void setListaKupona(Set<Kupon> listaKupona) {
        this.listaKupona = listaKupona;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public void azurirajIstoriju(Kupon kupon) {
        this.listaKupona.add(kupon);
    }

    @Override
    public String toString() {
        return "ID istorije: " + getIstorijaId();
    }
}

