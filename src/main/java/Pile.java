
public class Pile {

	int[] elements;
	int indiceSommet = -1;

	public Pile(int pfTaille) {
		this.elements = new int[pfTaille];
	}

	public boolean est_vide() {
		if (this.indiceSommet > -1) {
			return false;
		} else {
			return true;
		}
	}

	public void empiler(int pfVal) {
		this.indiceSommet++;
		this.elements[this.indiceSommet] = pfVal;
	}

	public int depiler() throws Exception {
		if (this.est_vide()) {
			throw new Exception("ERREUR !! La pile est vide");
		}
		int sommet;
		sommet = this.elements[this.indiceSommet];
		this.indiceSommet--;
		return sommet;
	}

	public int sommet() {
		return this.elements[this.indiceSommet];
	}

	public void vider() {
		this.indiceSommet = -1;
	}

}