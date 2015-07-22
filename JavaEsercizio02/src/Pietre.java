
public class Pietre implements Ordinabile {

	int peso = 0;
	int costo = 0;
	int numero = 0;

	public Pietre(int _peso, int _costo, int _numero) {
		_peso = peso;
		_costo = costo;
		_numero = numero;
	}

	public boolean minoreDi(Object altraPietra) {

		if ((altraPietra == null) || !(altraPietra instanceof Pietre))
			return false;

		else {
			double valoreQuestaPietra = peso * costo * numero;
			double valoreAltraPietra = ((Pietre) altraPietra).peso
					* ((Pietre) altraPietra).costo
					* ((Pietre) altraPietra).numero;
			return valoreQuestaPietra < valoreAltraPietra;
		}
	}

	public boolean maggioreDi(Object confrontaCon) {

		return !minoreDi(confrontaCon);
	}

}
