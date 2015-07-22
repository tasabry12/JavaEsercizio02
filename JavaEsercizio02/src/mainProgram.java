public class mainProgram {

	public static void main(String[] args) {

//		Atleti[] elenco = { new Atleti(1, 29, 14), 
//				            new Atleti(2, 30, 15),
//				            new Atleti(3, 29, 14) 
//		};
//
//		Ordinatore o = new Ordinatore(elenco);
//
//		Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();
//
//		System.out.println("La classifica ordinata è: ");
//		
//		for (int i=0; i<classifica.length;i++){
//			System.out.println("Pettorale "+classifica[i].pettorale+" prestazione "+(classifica[i].prestazione-classifica[i].eta*Atleti.prestazionEta));
//		}
		
		Pietre[] lista= { new Pietre(30,55,40),                          //peso,costo/grammo,mumero
				          new Pietre(100,15,20),
				          new Pietre(30,55,40)
		};
		
	
		Ordinatore p= new Ordinatore(lista);
		
		Pietre[] classifica= (Pietre[]) p.selectionSortA_Z();
		
		System.out.println("La classifica delle pietre è: ");
		for(int i=0; i<classifica.length;i++){
			System.out.println("Pietra 1");
		}
		

}
}
