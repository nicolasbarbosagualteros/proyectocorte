package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation <D, E>{//D -> DTO || E -> Entidad

	public String showAll(); //mostrar todo
	
	public ArrayList<D> getAll(); //mostrar todo Todito como DTO
	
	public boolean add(D newData); //ahora verifico que no haya duplicados c:
	
	public boolean delete(D toDelete, D toDelete2, D toDelete3); //eliminar
	
	public E find(E toFind); //to buscar; verificar si existe o no; null -> no existe
	
	public boolean update(D previous, D newData,D previous2, D newData2,D previous3, D newData4); //actualizarr
	
}
