import model.Impiegato;
import repository.RepositoryImpiegato;

import java.util.ArrayList;
import java.util.List;

import dao.ImpiegatoDao;

public class Main {
	
	private static ImpiegatoDao rp = new ImpiegatoDao();
	
	public static void main(String[] args) {
		
			Impiegato i = new Impiegato();
			i.setNome("Mario");
			i.setCognome("Rossi");
			i.setId(1);
			rp.creaImpiegato(i);
			
			Impiegato i1 = new Impiegato();
			i1.setNome("Mariooo");
			i1.setCognome("Rossiiii");
			i1.setId(2);
			rp.creaImpiegato(i1);
			
			Impiegato i2 = new Impiegato();
			i2.setNome("Marioaaaa");
			i2.setCognome("Rossiaaaa");
			i2.setId(3);
			rp.creaImpiegato(i2);
			
			
			List<Impiegato> lista = new ArrayList<Impiegato>();
			lista = rp.listaImpiegati();
				for(Impiegato impiegato : lista) {
					System.out.println("Id : " + impiegato.getId());
					System.out.println("Nome : " + impiegato.getNome());
					System.out.println("Cognome : " + impiegato.getCognome());
					System.out.println("--------------------------------------");
				}
			rp.cancellaImpiegato(2);
			
			
			for(Impiegato impiegato : lista) {
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.println("Id : " + impiegato.getId());
				System.out.println("Nome : " + impiegato.getNome());
				System.out.println("Cognome : " + impiegato.getCognome());
				
			}
			rp.aggiornaImpiegato(i2);
			i2.setNome("AAAAAAAA");
			i2.setCognome("BBBBBBBB");
			//i2.setId(5);
			for(Impiegato impiegato : lista) {
				System.out.println("--------------------------------------");
				System.out.println("Id : " + impiegato.getId());
				System.out.println("Nome : " + impiegato.getNome());
				System.out.println("Cognome : " + impiegato.getCognome());
				System.out.println("--------------------------------------");
			}
		
		
	}
}
