/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scannette.classeMetier;

import java.util.Objects;

/**
 *
 * @author solen
 */
public class Article {
    private int numero;
    private String designation;
    private float prixVente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(float prixVente) {
        this.prixVente = prixVente;
    }

    public Article(int numero, String designation, float prixVente) {
        this.numero = numero;
        this.designation = designation;
        this.prixVente = prixVente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.numero;
        hash = 47 * hash + Objects.hashCode(this.designation);
        hash = 47 * hash + Float.floatToIntBits(this.prixVente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (Float.floatToIntBits(this.prixVente) != Float.floatToIntBits(other.prixVente)) {
            return false;
        }
        return Objects.equals(this.designation, other.designation);
    }

    @Override
    public String toString() {
        return "Article{" + "numero=" + numero + ", designation=" + designation + ", prixVente=" + prixVente + '}';
    }
    
}
