package rs.ac.metropolitan.spacenter.model;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kupon kupon = (Kupon) o;
        return kuponId == kupon.kuponId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kuponId);
    }

    @Override
    public String toString() {
        return "Kupon{" +
                "kuponId=" + kuponId +
                ", sifraKupona='" + sifraKupona + '\'' +
                ", tretman=" + tretman +
                ", korisnik=" + korisnik +
                ", istorija=" + istorija +
                '}';
    }
}