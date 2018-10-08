package dao;

import java.util.*;

import model.Impiegato;
import repository.RepositoryImpiegato;

public class ImpiegatoDao implements RepositoryImpiegato{
	
	List<Impiegato> lista = new ArrayList<Impiegato>();
	
	public boolean creaImpiegato(Impiegato impiegato) {
		try {

			lista.add(impiegato);

		} catch (Exception e) {
			return false;
		}

		return true;
	}
	
	public boolean cancellaImpiegato(int id) {

		for (Impiegato impiegato : lista) {
			if (impiegato.getId() == id) {
				lista.remove(impiegato);
			}
		}

		return false;
	}
	
	public boolean aggiornaImpiegato(Impiegato impiegato) {

		for (Impiegato impiegato1 : lista) {
			if (impiegato1.getId() == impiegato.getId()) {
				
				lista.remove(impiegato1);
				lista.add(impiegato);
			}
		}
		return false;
	}
	
	public List<Impiegato> listaImpiegati() {
		return this.lista;
	}
}
