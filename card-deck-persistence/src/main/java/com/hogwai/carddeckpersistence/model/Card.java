package com.hogwai.carddeckpersistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "couleur", nullable = false)
    private String couleur;

    @Column(name = "valeur", nullable = false)
    private String valeur;

    @Column(name = "chemin")
    private String chemin;

    public Card() {}

    public Card(Couleur couleur, Valeur valeur) {
        this.couleur = couleur.toString();
        this.valeur = valeur.toString();
        this.chemin = "src/main/resources/images/" + this.valeur + "_de_" + this.couleur + ".png";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id.equals(card.id) && couleur.equals(card.couleur) && valeur.equals(card.valeur) && chemin.equals(card.chemin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couleur, valeur, chemin);
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
