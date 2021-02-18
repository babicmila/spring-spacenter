package rs.ac.metropolitan.spacenter.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Istorija {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final int istorijaId;

    @OneToOne()
    @JoinColumn(name = "korisnikId")
    private Korisnik korisnik;

    @OneToMany()
    @JoinTable(name = "kuponi_istorija", joinColumns = @JoinColumn(name = "istorijaId"), inverseJoinColumns = @JoinColumn(name = "kuponId"))
    private Set<Kupon> listaKupona = new HashSet<>();


    public Istorija(int istorijaId) {
        this.istorijaId = istorijaId;
    }

    public int getIstorijaId() {
        return this.istorijaId;
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

