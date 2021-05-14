import Concrete.AuthManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.OfferManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "murataslan", "Murat", "Aslan", "contact@murataslan.com", "1995", ":)");
		GamerManager gamerManager = new GamerManager(new AuthManager());
				
		gamerManager.register(gamer);
		gamerManager.update(gamer);
		
		Game game = new Game(1,"Age of Empires II","Video game","Ensemble Studios",30);
		
		Offer offer = new Offer(1, "Pay one, get two!", 50, 0);
		OfferManager offerManager = new OfferManager();
		offerManager.add(offer);
		offerManager.update(offer);
		
		GameManager gameManager = new GameManager();
		gameManager.sell(game , gamer, offer);
		gameManager.sell(game, gamer);
		
		gamerManager.delete(gamer);
		offerManager.delete(offer);

	}

}