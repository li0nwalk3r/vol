package sopra.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.vol.dao.IClientDao;
import sopra.vol.dao.jpa.ClientDaoJpa;

public class Application {

	private static Application instance = null;
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monVol");
	private final IAeroportDao aeroportDao = new AeroportDaoJpa();
	private final IAeroportVilleDao aeroporVilletDao = new AeroportVilleDaoJpa();
	private final IClientDao clientDao = new ClientDaoJpa();
	private final ICompagnieAerienneDao compagnieAerienneDao = new PassagerDaoJpa();
	private final ICompagnieAerienneVolDao compagnieAerienneVolDao = new CompagnieAerienneVolDaoJpa();
	private final IEscaleDao escaleDao = new EscaleDaoJpa();
	private final IFacturationDao facturationDao = new FacturationDaoJpa();
	private final IPassagerDao passagerDao = new PassagerDaoJpa();
	private final IReservationDao reservationDao = new ReservationDaoJpa();
	private final IVilleDao villeDao = new VilleDaoJpa();
	private final IVolDao volDao = new VolDaoJpa();
	
	
	

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}


	public EntityManagerFactory getEmf() {
		return emf;
	}
	
	public IClientDao getClientDao() {
		return clientDao;
	}
}