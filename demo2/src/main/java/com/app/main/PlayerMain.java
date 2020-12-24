package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCurdDAOImpl;
import com.app.exception.BusinessException;
import com.app.module.Player;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerCrudDAO dao = new PlayerCurdDAOImpl();
		
		/*Player p = new Player(108, "Allie", 15,"Female");
		try {
		if(dao.createPlayer(p)!=0) {
			System.out.println("Player created successfully!");
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
	}*/
		try{
			Player player = dao.getPlayerById(1);//get information for player id 1
			if(player!=null) {
				System.out.println("Details of player with id "+player.getId());
				System.out.println(player);
				}
			}catch(BusinessException e) {
			System.out.println(e.getMessage());
			}
		
		try {
		List<Player> playerList = dao.getAllPlayers();//get information for all players
		if(playerList != null && playerList.size()!=0) {
			System.out.println("\n\nFound "+playerList.size()+ " number of players in DB..Printing them all");
			for(Player p:playerList) {//traverse every player inside playerList
				System.out.println(p);
				}
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
}

}
/*1. try running the same app and get the idea of hof what is going on and where 
 * 2. look into the recording and parallely try to recreate the whole app by yourself from scratch
 * 3. complete update and delete operations and complete playerSearchDAOImpl
 */