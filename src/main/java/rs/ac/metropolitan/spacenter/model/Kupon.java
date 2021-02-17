package rs.ac.metropolitan.spacenter.model;

import javax.persistence.*;

@Entity
public class Kupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int kuponId;
    private String sifraKupona;

    @OneToOne
    public Tretman tretman;

    @ManyToOne
    public Istorija istorija;

    public Kupon() {
    }

    public Kupon(String sifraKupona, Tretman tretman, Istorija istorija) {
        this.sifraKupona = sifraKupona;
        this.tretman = tretman;
        this.istorija = istorija;
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

    public Istorija getIstorija() {
        return istorija;
    }

    public void setIstorija(Istorija istorija) {
        this.istorija = istorija;
    }

    public Tretman getTretman() {
        return this.tretman;
    }

    public void setTretman(Tretman tretman) {
        this.tretman = tretman;
    }

}