package iut.bad;

public class Femme extends Humain {
	public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
public static void main(String[] args) {
		
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Durand", 25);

        femme.ami(homme, 150);
    }
}
