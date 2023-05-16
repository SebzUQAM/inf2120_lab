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
    private TaxeDouble[] taxeDoubles = new TaxeDouble[10];
    private TaxeSimple[] taxeSimples = new TaxeSimple[10];
    private NonTaxable[] nonTaxables = new NonTaxable[10];
    
    public void ajouterProduitNonTaxable(NonTaxable produit){
        int index = 0;
        boolean ajouter = false;
        while(index < nonTaxables.length && !ajouter){
            ajouter = nonTaxables[index] == null;
            if(ajouter){
                nonTaxables[index] = produit;
            }
        }
        if(!ajouter){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public void ajouterProduitTaxeSimple(TaxeSimple produit){
        int index = 0;
        boolean ajouter = false;
        while(index < taxeSimples.length && !ajouter){
            ajouter = taxeSimples[index] == null;
            if(ajouter){
                taxeSimples[index] = produit;
            }
        }
        if(!ajouter){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public void ajouterProduitTaxeDouble(TaxeDouble produit){
        int index = 0;
        boolean ajouter = false;
        while(index < taxeDoubles.length && !ajouter){
            ajouter = taxeDoubles[index] == null;
            if(ajouter){
                taxeDoubles[index] = produit;
            }
        }
        if(!ajouter){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public double prixTotal(){
        double result = 0;
        for(NonTaxable val : nonTaxables){
            result += val.prix();
        }
        for(TaxeDouble val : taxeDoubles){
            result += val.prix();
        }
        for(TaxeSimple val : taxeSimples){
            result += val.prix();
        }
        return result;
    }
}
