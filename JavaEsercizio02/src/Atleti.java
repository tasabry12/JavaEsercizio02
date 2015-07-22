
public class Atleti implements Ordinabile {
	
	int pettorale=0;
	int eta=0;
	int prestazione=0;
	final static double prestazionEta=0.4;
	
	public Atleti(int _pettorale, int _eta, int _prestazione){
		pettorale=_pettorale;
		eta=_eta;
		prestazione=_prestazione;		
	}
	
	public boolean minoreDi(Object altroAtleta){
		double indicePrestazioneQuesto=prestazione-eta*prestazionEta;
		double indicePrestazioneAltro=((Atleti)altroAtleta).prestazione-((Atleti)altroAtleta).eta*prestazionEta;
		return indicePrestazioneQuesto<indicePrestazioneAltro;
	}
	
	public boolean maggioreDi(Object altroAtleta){
		return true;
	}
	
}
