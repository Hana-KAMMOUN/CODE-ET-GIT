public class GestionnaireNotes {

    /**
     * Affiche les notes d'un étudiant et sa moyenne.
     * @param nomEtudiant Le nom de l'étudiant.
     * @param notes Tableau contenant les notes de l'étudiant.
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affiche les notes
        afficherNotes(nomEtudiant, notes);

        // Calcule la somme des notes
        int somme = calculerSomme(notes);

        // Calcule la moyenne
        double moyenne = calculerMoyenne(somme, notes.length);

        // Affiche la moyenne
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Affiche les notes d'un étudiant.
     * @param nomEtudiant Le nom de l'étudiant.
     * @param notes Tableau contenant les notes de l'étudiant.
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la somme des notes.
     * @param notes Tableau contenant les notes.
     * @return La somme des notes.
     */
    private int calculerSomme(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme; // Retourne la somme totale des notes
    }

    /**
     * Calcule la moyenne des notes.
     * @param somme La somme des notes.
     * @param nombreNotes Le nombre total de notes.
     * @return La moyenne des notes.
     */
    private double calculerMoyenne(int somme, int nombreNotes) {
        if (nombreNotes == 0) {
            return 0.0; // Gère le cas où il n'y a pas de notes
        }
        return (double) somme / nombreNotes; // Retourne la moyenne
    }
}

