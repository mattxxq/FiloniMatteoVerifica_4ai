/**
 * 
 * CLASSE: 4AI
 * Data: 04/02/2023
 * @author <b> Filoni Matteo </b>
 */
public class FiloniMatteoClass {
	/**
	 * metodo costruttore
	 */
	public FiloniMatteoClass() {

	}

	/**
	 * 
	 * @param s valore iniziale
	 * @param f valore finale
	 * @return prodotto dei valori compresi tra 's' e 'f'
	 */

	
	public int FiloniMet(int s, int f) {
		int r = 1;
		for (int i = s; i <= f; i++)	//la i parte dal primo indice di valroe fornito
										//e arriva fino all'ultimo valore fornito
			r *= i;						//moltiplica i valori da 's' a 'f' e li somma in 'r'
		return r;
	}
/**
 * 
 * METODO PRINCIPALE
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiloniMatteoClass a = new FiloniMatteoClass();
		System.out.println(a.FiloniMet(5, 7));
		System.out.println(a.FiloniMet(6, 7));
		System.out.println(a.FiloniMet(5, 6));
	}

}
