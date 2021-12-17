package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PersonalIdentityCheckService {

	boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException ;
}
