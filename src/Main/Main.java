package Main;

import java.rmi.RemoteException;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Mernis.MernisCheckService;

public class Main {

	
		public static void main(String[] args) throws NumberFormatException, RemoteException {

			Player player1 = new Player(1, "Doğu", "Yakışıklı","123456789012",2019);

			Game game1 = new Game(1, "Knight Online", 50);

			Campaign campaign1 = new Campaign(1, "Yılbaşı İndirimi", 30);

			GameManager gameManager = new GameManager();
			gameManager.add(game1);

			CampaignManager campaignManager = new CampaignManager();
			campaignManager.add(campaign1);

			SalesManager salesManager = new SalesManager();
			salesManager.gameSales(player1, game1, campaign1);

			PlayerManager playerManager = new PlayerManager(new MernisCheckService());
			playerManager.add(player1);


	}

}
