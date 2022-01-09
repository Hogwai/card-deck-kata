package com.hogwai.carddeckconsole.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Card {
    private String couleur;
    private String valeur;

    public Card(Couleur couleur, Valeur valeur) {
        this.couleur = couleur.toString();
        this.valeur = valeur.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return couleur.equals(card.couleur) && valeur.equals(card.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couleur, valeur);
    }

    public enum Couleur {
        PIQUE ("pique"),
        COEUR ("coeur"),
        CARREAU ("carreau"),
        TREFLE ("trèfle");

        private final String nom;

        Couleur(String s) {
            nom = s;
        }

        @Override
        public String toString() {
            return this.nom;
        }
    }

    public enum Valeur {
        DEUX ("2"),
        TROIS ("3"),
        QUATRE ("4"),
        CINQ ("5"),
        SIX ("6"),
        SEPT ("7"),
        HUIT ("8"),
        NEUF ("9"),
        DIX ("10"),
        VALET ("Valet"),
        REINE ("Reine"),
        ROI ("Roi"),
        AS ("As");

        private final String nom;

        Valeur(String s) {
            nom = s;
        }

        @Override
        public String toString() {
            return this.nom;
        }
    }
}
