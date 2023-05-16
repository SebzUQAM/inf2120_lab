/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fc691952uqam.inf2120_lab;

/**
 *
 * @author fc691952
 */
public class Facture {
    private final int TAILLE_MAX = 30;
    private final Produit[] produits = new Produit[TAILLE_MAX];
    
    private int nbDeProduit = 0;
    
    public void ajouterProduit(Produit produit){
        if(nbDeProduit < TAILLE_MAX){
            produits[nbDeProduit++] = produit;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public double prixTotal(){
        int result = 0;
        for(int i=0; i< nbDeProduit; i++){
            result += produits[i].prix();
        }
        return result;
    }
}
