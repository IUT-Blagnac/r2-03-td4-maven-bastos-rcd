
public class Pile {

	int[] elements;
	int indiceSommet = -1;

	public Pile(int pfTaille) {
		this.elements = new int[pfTaille];
	}

	/**
	 * Retourne si la pile est vide
	 * 
	 * @return TRUE si vide, FALSE sinon
	 */
	public boolean est_vide() {
		if (this.indiceSommet > -1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Ajoute un élément à la pile au sommet
	 * 
	 * @param pfVal : valeur à empiler
	 */
	public void empiler(int pfVal) {
		this.indiceSommet++;
		this.elements[this.indiceSommet] = pfVal;
	}

	/**
	 * Dépile et retourne le sommet d'une pile
	 * 
	 * @return : le sommet qui a été dépilé
	 * @throws Exception : valide si this.estVide() == false
	 */
	public int depiler() throws Exception {
		if (this.est_vide()) {
			throw new Exception("ERREUR !! La pile est vide");
		}
		int sommet;
		sommet = this.elements[this.indiceSommet];
		this.indiceSommet--;
		return sommet;
	}

	/**
	 * Retourne le sommet de la pile
	 * 
	 * @return : sommet
	 */
	public int sommet() {
		return this.elements[this.indiceSommet];
	}

	/**
	 * Vide entièrement la pile
	 */
	public void vider() {
		this.indiceSommet = -1;
	}

}