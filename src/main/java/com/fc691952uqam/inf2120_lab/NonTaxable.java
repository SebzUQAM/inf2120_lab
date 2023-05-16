/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fc691952uqam.inf2120_lab;

/**
 *
 * @author fc691952
 */
public class NonTaxable {
    private String nomProduit;
    private double prixProduit;

    public NonTaxable(String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }
    
    public double prix(){
        double result = prixProduit;
        result *= 100;
        result = Math.round(result);
        return result / 100;
    }
}
