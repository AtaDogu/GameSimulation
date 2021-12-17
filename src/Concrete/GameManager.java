package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" "+game.getPrice()+" ile eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" "+game.getPrice()+" ile güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" silindi.");
		
	}

}
