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
	FiloniMatteoClass() {

	}

	/**
	 * 
	 * @param s valore iniziale
	 * @param f valore finale
	 * @return prodotto dei valori compresi tra 's' e 'f'
	 */

	public int FiloniMet(int s, int f) {
		int r = 0;
		for (int i = 1;i<f;i++)
			r = r+r;
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
