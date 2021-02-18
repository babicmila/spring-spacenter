package rs.ac.metropolitan.spacenter.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer korisnikId;
    private final String ime;
    private final String prezime;
    private final String adresa;
    private final String grad;
    private final String brojTelefona;
    private final String email;

    @OneToOne()
    private Istorija istorija;

    public Korisnik(Integer korisnikId, String ime, String prezime, String adresa, String grad, String brojTelefona, String email) {
        this.korisnikId = korisnikId;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.grad = grad;
        this.brojTelefona = brojTelefona;
        this.email = email;
    }


    public int getKorisnikId() {
        return this.korisnikId;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }


    public String getAdresa() {
        return this.adresa;
    }

    public String getGrad() {
        return this.grad;
    }

    public String getBrojTelefona() {
        return this.brojTelefona;
    }


    public String getEmail() {
        return this.email;
    }

    //    public Rola getRola() {
//        return this.rola;
//    }
//
//    public void setRola(Rola rola) {
//        this.rola = rola;
//    }

    // public void rezervisiTretman() {

    // }

    // public void otkaziRezervaciju() {

    // }

    // public void zahtevajMagazin() {

    // }

    // public void prikaziIstoriju() {

    // }

    // public void pogledajProfil() {

    // }

    // public List<Tretman> pretraziTretmane() {
    // return null;
    // }

    // public void generisiIzvestaj() {

    // }

    // public List<Korisnik> pretraziKorisnika() {
    // return null;
    // }

    // public void kreirajAkciju() {

    // }

    // public void kreirajTretman() {

    // }

    // public void kreriajTermin() {

    // }

    // public void kreirajKorisnika() {

    // }

    // public void azurirajTretman() {

    // }

    // public void azurirajTermin() {

    // }

    // public void azurirajKorisnika() {

    // }

    // public void azurirajAkciju() {

    // }

    // public void obrisiTretman() {

    // }

    // public void obrisiKorisnika() {

    // }

    // public void obrisiTermin() {

    // }

    // public void obrisiAkciju() {

    // }

}