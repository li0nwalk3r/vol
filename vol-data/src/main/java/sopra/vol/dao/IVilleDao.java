package sopra.vol.dao;

import java.util.List;

import sopra.vol.model.Ville;

public interface IVilleDao extends IDao<Ville, Long>{
	List<Ville> findAllVilleByAeroport(Long aeroportId);
}
