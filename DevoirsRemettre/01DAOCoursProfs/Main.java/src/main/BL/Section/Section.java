// package BL.Section;

// public class Section {

package main.BL.Section;

public class Section {
    private final int id;
    private String nom;

    /**
     * Classe permettant la modelisation d
     * une section (de cours).
     *
     * @param id  Identifiant de la section
     * @param nom Nom de la section
     */
    public Section(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    /**
     * @return int retourne l
     *         identifiant
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return String retourne le nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * @param nom Le nom à mettre
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

}
