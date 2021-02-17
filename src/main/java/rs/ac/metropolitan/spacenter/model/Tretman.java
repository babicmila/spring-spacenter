package rs.ac.metropolitan.spacenter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
