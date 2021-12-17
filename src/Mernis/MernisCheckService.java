package Mernis;

import java.rmi.RemoteException;

import Abstract.PersonalIdentityCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements PersonalIdentityCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentityNumber()), player.getFirstName(),
				player.getLastName(), player.getDateOfYear());
		if (result == true) {
			System.out.println("Giriş Başarılı");
			return true;
		} else {
			System.out.println("Giriş Başarısız");
			return false;
		}
	}

}