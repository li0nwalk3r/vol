package sopra.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.vol.dao.IAeroportDao;
import sopra.vol.dao.IAeroportVilleDao;
import sopra.vol.dao.IClientDao;
import sopra.vol.dao.ICompagnieAerienneDao;
import sopra.vol.dao.ICompagnieAerienneVolDao;
import sopra.vol.dao.IEscaleDao;
import sopra.vol.dao.IFacturationDao;
import sopra.vol.dao.IPassagerDao;
import sopra.vol.dao.IReservationDao;
import sopra.vol.dao.IVilleDao;
import sopra.vol.dao.IVolDao;
import sopra.vol.dao.jpa.AeroportDaoJpa;
import sopra.vol.dao.jpa.AeroportVilleDaoJpa;
import sopra.vol.dao.jpa.ClientDaoJpa;
import sopra.vol.dao.jpa.CompagnieAerienneDaoJpa;
import sopra.vol.dao.jpa.CompagnieAerienneVolDaoJpa;
import sopra.vol.dao.jpa.EscaleDaoJpa;
import sopra.vol.dao.jpa.FacturationDaoJpa;
import sopra.vol.dao.jpa.PassagerDaoJpa;
import sopra.vol.dao.jpa.ReservationDaoJpa;
import sopra.vol.dao.jpa.VilleDaoJpa;
import sopra.vol.dao.jpa.VolDaoJpa;

public class Application {

	private static Application instance = null;
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monVol");
	private final IAeroportDao aeroportDao = new AeroportDaoJpa();
	private final IAeroportVilleDao aeroporVilletDao = new AeroportVilleDaoJpa();
	private final IClientDao clientDao = new ClientDaoJpa();
	private final ICompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
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

	public IReservationDao getReservationDao() {
		return reservationDao;
	}

	public IFacturationDao getFacturationDao() {
		return facturationDao;
	}

	public ICompagnieAerienneDao getCompagnieAerienneDao() {
		return compagnieAerienneDao;
	}

	public ICompagnieAerienneVolDao getCompagnieAerienneVolDao() {
		return compagnieAerienneVolDao;
	}

	public IEscaleDao getEscaleDao() {
		return escaleDao;
	}

	public IPassagerDao getPassagerDao() {
		return passagerDao;
	}

	public IVolDao getVolDao() {
		return volDao;
	}

	public IAeroportDao getAeroportDao() {
		return aeroportDao;
	}

	public IAeroportVilleDao getAeroporVilletDao() {
		return aeroporVilletDao;
	}

	public IVilleDao getVilleDao() {
		return villeDao;
	}
}