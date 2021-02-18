package rs.ac.metropolitan.spacenter.model;

import javax.persistence.*;

@Entity
public class Kupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int kuponId;
    private String sifraKupona;

    @OneToOne()
    @JoinColumn(name = "tretmanId")
    public Tretman tretman;

    @OneToOne()
    @JoinColumn(name = "korisnikId")
    private Korisnik korisnik;

    @ManyToOne
    Istorija istorija;

    public Kupon() {
    }

    public Kupon(String sifraKupona, Tretman tretman, Korisnik korisnik) {
        this.sifraKupona = sifraKupona;
        this.tretman = tretman;
        this.korisnik = korisnik;
    }

    public int getKuponId() {
        return this.kuponId;
    }

    public void setKuponId(int kuponId) {
        this.kuponId = kuponId;
    }

    public String getSifraKupona() {
        return this.sifraKupona;
    }

    public void setSifraKupona(String sifraKupona) {
        this.sifraKupona = sifraKupona;
    }

    public Tretman getTretman() {
        return this.tretman;
    }

    public void setTretman(Tretman tretman) {
        this.tretman = tretman;
    }

}