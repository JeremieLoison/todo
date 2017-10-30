/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jerem.todo;

/**
 *
 * @author Administrateur
 */

public class TodoDTO {

    public String tache;
    public String categorie;
    public String fait;

    public TodoDTO() {

    }

    public TodoDTO(String tache, String categorie, String fait) {
        this.categorie = categorie;
        this.fait = fait;
        this.tache = tache;

    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getFait() {
        return fait;
    }

    public void setFait(String fait) {
        this.fait = fait;
    }
    
    

    /**
     *
     * @param args the command line arguments
     */
    
    /* à voir ... si nécessaire dans le code du DTO
    public static void main(String[] args) {
        // TODO code application logic here
    }
*/
}
