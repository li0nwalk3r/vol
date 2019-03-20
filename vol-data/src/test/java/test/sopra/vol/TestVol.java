package test.sopra.vol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.vol.Application;
import sopra.vol.dao.IAeroportDao;
import sopra.vol.dao.IClientDao;
import sopra.vol.dao.ICompagnieAerienneDao;
import sopra.vol.dao.ICompagnieAerienneVolDao;
import sopra.vol.dao.IFacturationDao;
import sopra.vol.dao.IPassagerDao;
import sopra.vol.dao.IReservationDao;
import sopra.vol.dao.IVilleDao;
import sopra.vol.dao.IVolDao;
import sopra.vol.model.Adresse;
import sopra.vol.model.Aeroport;
import sopra.vol.model.Civilite;
import sopra.vol.model.Client;
import sopra.vol.model.ClientParticulier;
import sopra.vol.model.CompagnieAerienne;
import sopra.vol.model.CompagnieAerienneVol;
import sopra.vol.model.Facturation;
import sopra.vol.model.ModeDePaiement;
import sopra.vol.model.Passager;
import sopra.vol.model.Reservation;
import sopra.vol.model.Ville;
import sopra.vol.model.Vol;

public class TestVol {
	public static void main(String[] args) {
		IClientDao clientDao = Application.getInstance().getClientDao();
		IReservationDao reservationDao = Application.getInstance().getReservationDao();
		IFacturationDao facturationDao = Application.getInstance().getFacturationDao();
		IPassagerDao passagerDao = Application.getInstance().getPassagerDao();
		ICompagnieAerienneDao compagnieAerienneDao = Application.getInstance().getCompagnieAerienneDao();
		IVolDao volDao = Application.getInstance().getVolDao();
		ICompagnieAerienneVolDao compagnieAerienneVolDao = Application.getInstance().getCompagnieAerienneVolDao();
		IVilleDao villeDao = Application.getInstance().getVilleDao();
		IAeroportDao aeroportDao = Application.getInstance().getAeroportDao();

		Client gary = new ClientParticulier("Bouchentouf", "Gary", Civilite.M);
		gary = clientDao.save(gary);

		// Creation 2 passagers + adresse

		Date dtBirth = null;
		try {
			dtBirth = new SimpleDateFormat("dd/MM/yyyy").parse("22/01/1989");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Passager passager1 = new Passager("RINFRAY", "Jean-Lou", dtBirth, "pass5");
		Adresse adr3 = new Adresse("1 rue de la paix", "31510", "village", "france");
		passager1.setAdresse(adr3);

		passager1 = passagerDao.save(passager1);

		Date dtFac = new Date(10, 10, 10);
		Facturation facturation = new Facturation("s45v4v5e", ModeDePaiement.CB, dtFac);
		facturation = facturationDao.save(facturation);

		CompagnieAerienne airFrance = new CompagnieAerienne("Air France");
		CompagnieAerienne britishAriways = new CompagnieAerienne("British Airways");

		Date dateDepart = null;
		Date dateArrivee = null;
		try {
			dateDepart = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm").parse("11/03/2019 at 08:32");
			dateArrivee = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm").parse("11/03/2019 at 09:46");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Ville ville = new Ville("SuperCity666");
		ville = villeDao.save(ville);
		
		Aeroport aeroportD = new Aeroport("cacadepart", "depart");
		aeroportD = aeroportDao.save(aeroportD);
		
		Aeroport aeroportA = new Aeroport("caca", "superAeroport666");
		aeroportA = aeroportDao.save(aeroportA);
		

		Vol bdxLondres = new Vol(true, dateDepart, dateArrivee, 34.26F);
		bdxLondres.setDepart(aeroportD);
		bdxLondres.setArrivee(aeroportA);
		

		airFrance = compagnieAerienneDao.save(airFrance);
		britishAriways = compagnieAerienneDao.save(britishAriways);

		bdxLondres = volDao.save(bdxLondres);

		bdxLondres.setTarif(53.00F);

		bdxLondres = volDao.save(bdxLondres);

		CompagnieAerienneVol aFBdxLond = new CompagnieAerienneVol(airFrance, bdxLondres);
		CompagnieAerienneVol bABdxLond = new CompagnieAerienneVol(britishAriways, bdxLondres);
		aFBdxLond = compagnieAerienneVolDao.save(aFBdxLond);
		bABdxLond = compagnieAerienneVolDao.save(bABdxLond);

//		Passager passager2 = new Passager("RINFRAY", "Corentin", new SimpleDateFormat("dd/MM/yyyy").parse("22/01/1987"),
//				"pass105");
//		Adresse adr4 = new Adresse("1 rue de la paix", "31510", "village", "france");
//		passager2.setAdresse(adr4);
//
//		passager2 = passagerDao.save(passager2);

		Date dtRes = new Date(10, 10, 10);
		Reservation resGary = new Reservation("5g6ez4g65ez", false, true, dtRes);
		resGary.setClient(gary);
		resGary.setPassager(passager1);
		resGary.setFacturation(facturation);
		resGary.setVol(bdxLondres);
		resGary = reservationDao.save(resGary);

	}
}
