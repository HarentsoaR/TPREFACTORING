package iut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    // Constructeur par défaut
    public Humain() {
    }

    // Constructeur avec tous les champs
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Getters et Setters pour chaque champ
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
 // Méthode pour afficher les détails
    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
    
 // Surcharge de la méthode toString()
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
 // Implémentation des méthodes de l'interface Consommation
    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }
    
    //Methode Ami
    public void ami(Humain humain, int dureeAmitie) {
        System.out.println(this.nom + " est ami avec " + humain.nom + " pour " + dureeAmitie + " jours.");
    }
}
