package rs.ac.metropolitan.spacenter.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Tretman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tretmanId;
    private String tretmanNaziv;
    private String tretmanOpis;
    private int tretmanTrajanje;
    private double tretmanCena;
    private String urlSlike;

    @OneToOne()
    private Kupon kupon;

    public Tretman() {
    }

    public Tretman(String tretmanNaziv, String tretmanOpis, int tretmanTrajanje, double tretmanCena, String urlSlike) {
        this.tretmanNaziv = tretmanNaziv;
        this.tretmanOpis = tretmanOpis;
        this.tretmanTrajanje = tretmanTrajanje;
        this.tretmanCena = tretmanCena;
        this.urlSlike = urlSlike;
    }

    public int gettretmanId() {
        return tretmanId;
    }

    public void settretmanId(int newTretmanId) {
        tretmanId = newTretmanId;
    }

    public String gettretmanNaziv() {
        return tretmanNaziv;
    }

    public void settretmanNaziv(String newTretmanNaziv) {
        tretmanNaziv = newTretmanNaziv;
    }

    public String gettretmanOpis() {
        return tretmanOpis;
    }

    public void settretmanOpis(String newTretmanOpis) {
        tretmanOpis = newTretmanOpis;
    }

    public int gettretmanTrajanje() {
        return tretmanTrajanje;
    }

    public void settretmanTrajanje(int newTretmanTrajanje) {
        tretmanTrajanje = newTretmanTrajanje;
    }

    public double gettretmanCena() {
        return tretmanCena;
    }

    public void settretmanCena(double newTretmanCena) {
        tretmanCena = newTretmanCena;
    }

    public String geturlSlike() {
        return urlSlike;
    }

    public void seturlSlike(String newUrlSlike) {
        urlSlike = newUrlSlike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tretman tretman = (Tretman) o;
        return tretmanId == tretman.tretmanId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tretmanId);
    }

    @Override
    public String toString() {
        return "Tretman{" +
                "tretmanId=" + tretmanId +
                ", tretmanNaziv='" + tretmanNaziv + '\'' +
                ", tretmanOpis='" + tretmanOpis + '\'' +
                ", tretmanTrajanje=" + tretmanTrajanje +
                ", tretmanCena=" + tretmanCena +
                ", urlSlike='" + urlSlike + '\'' +
                ", kupon=" + kupon +
                '}';
    }
}
