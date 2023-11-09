/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scannette.classeMetier;

import java.util.ArrayList;

/**
 *
 * @author solen
 */
public class Scannette {
    private String identiteClient;
    private ArrayList<Article> lePanier;

    public String getIdentiteClient() {
        return identiteClient;
    }

    public void setIdentiteClient(String identiteClient) {
        this.identiteClient = identiteClient;
    }

    public ArrayList<Article> getLePanier() {
        return lePanier;
    }

    
    public void setLePanier(ArrayList<Article> lePanier) {
        this.lePanier = lePanier;
    }

    @Override
    public String toString() {
        return "scannette{" + "identiteClient=" + identiteClient + ", lePanier=" + lePanier + '}';
    }

    public Scannette(String identiteClient) {
        this.identiteClient = identiteClient;
        lePanier = new ArrayList();
    }
    /**
     * ajouterAuPanier: ajoute l'article passé en paramatre dans le panier
     * @param lArticle : article à ajouter
     * @return true si ok
     */
    public boolean ajouterAuPanier(Article lArticle){
        return lePanier.add(lArticle);
    }
    
    /**
     * oterDuPanier: enleve l'article passé en parametre dans le panier
     * @param lArticle : article à enlever
     * @return true si ok
     */
    public boolean oterDuPanier (Article lArticle){
        return lePanier.remove(lArticle);
    }
    
    /**
     * calculeMtPanier: calcul du montant à payer
     * @return montant calculé (float)
     */
    public float calculetMtPanier (){
        float mt = 0;
        for (Article unArticle:lePanier){
            mt+= unArticle.getPrixVente();
        }
        return mt;
    }
    
    
    
}
