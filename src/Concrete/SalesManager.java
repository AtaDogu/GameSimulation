package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManager {

	public void gameSales(Player player, Game game, Campaign campaign) {
		String discountedPrice = player.getFirstName() + " " + player.getLastName() + " " + game.getGameName() + " " + "oyununu"
				+ " " + "%" + campaign.getDiscount() + " " + "indirimle" + " "
				+ (game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) + " "
				+ "TL fiyatına satın aldı.";
		System.out.println(discountedPrice);

	}
}
