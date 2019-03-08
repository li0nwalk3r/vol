package test.sopra.vol;


import sopra.vol.Application;
import sopra.vol.dao.IClientDao;

public class TestVol {
	public static void main(String[] args) {
		IClientDao clientnDao = Application.getInstance().getClientDao();
		
	}
}
