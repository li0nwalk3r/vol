package sopra.vol.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.TypedQuery;

import sopra.vol.Application;
import sopra.vol.dao.IReservationDao;
import sopra.vol.model.Reservation;

public class ReservationDaoJpa implements IReservationDao{

	@Override
	public List<Reservation> findAll() {
		List<Reservation> liste = new ArrayList<Reservation>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<Reservation> query = em.createQuery("from Reservation", Reservation.class);
			
			liste = query.getResultList();
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
		return liste;
	}

	@Override
	public Reservation find(Id id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation save(Reservation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Reservation obj) {
		// TODO Auto-generated method stub
		
	}

}
