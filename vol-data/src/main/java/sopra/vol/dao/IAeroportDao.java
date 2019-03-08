package sopra.vol.dao;

import java.util.List;

import sopra.vol.model.Aeroport;

public interface IAeroportDao extends IDao<Aeroport, Long>{
	List<Aeroport> findAllAeroportByVille(Long villeId);
}
