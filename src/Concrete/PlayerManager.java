package Concrete;

import java.rmi.RemoteException;

import Abstract.PersonalIdentityCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	PersonalIdentityCheckService personelIdentityCheckService;

	public PlayerManager(PersonalIdentityCheckService personelIdentityCheckService) {
		this.personelIdentityCheckService = personelIdentityCheckService;
	}

	@Override
	public void add(Player player) throws NumberFormatException, RemoteException {
		if(personelIdentityCheckService.CheckIfRealPerson(player)) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" kayıt oldu.");
		}else {
			System.out.println("Bilgilerinizi hatalı yada eksik girdiniz.");
		}
		
	}

	@Override
	public void delete(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" bilgileri güncellendi.");
		
	}

	@Override
	public void update(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" silindi.");
		
	}

}
