package repository;

import java.util.List;

import model.Impiegato;

public interface RepositoryImpiegato {
	
	public boolean creaImpiegato(Impiegato impiegato);
	public boolean cancellaImpiegato(int id);
	public boolean aggiornaImpiegato(Impiegato impiegato);
	public List<Impiegato> listaImpiegati();
}
