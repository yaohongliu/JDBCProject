package com.app.main;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCurdDAOImpl;
import com.app.exception.BusinessException;
import com.app.module.Player;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerCrudDAO dao = new PlayerCurdDAOImpl();
		
		/*String s = "1999-09-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-mm");
		sdf.setLenient(false);
		java.util.Date dob = null;
		try {
			dob = sdf.parse(s);
		}catch(ParseException e) {
			System.out.println("Invalid date format");
		}*/
		//create an new player into the table 
		Player p = new Player(1007, "Jakie", 21, 7900940392L, new Date(0), "F", "Pepper");
		
		try {
			if(dao.createPlayer(p)!=0) {
				System.out.println("Player created successfully!");
			}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	//get player info by id
		try{
			Player player = dao.getPlayerById(1002);//get information for player id 1
			if(player!=null) {
				System.out.println("Details of player with id "+player.getId());
				System.out.println(player);
				}
			}catch(BusinessException e) {
			System.out.println(e.getMessage());
			}
		
		//get all the players info
		try {
		List<Player> playerList = dao.getAllPlayers();//get information for all players
		if(playerList != null && playerList.size()!=0) {
			System.out.println("\n\nFound "+playerList.size()+ " number of players in DB..Printing them all");
			for(Player p1:playerList) {//traverse every player inside playerList
				System.out.println(p1);
				}
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		//update the contact
		  dao.updatePlayerContact(1002, 1112223334L);//get information for player id 1
			
				System.out.println("updated player 1002 with new contact 1112223334");
				try {
					List<Player> playerAfterUpdateContact = dao.getAllPlayers();
					if(playerAfterUpdateContact!=null&& playerAfterUpdateContact.size()!=0)
						System.out.println("Found "+playerAfterUpdateContact.size()+" number of players and printing them");
					
					for(Player p2:playerAfterUpdateContact) {
						System.out.println(p2);
					}
				}catch(BusinessException e) {
					System.out.println(e.getMessage());
				}
		
			
		
		
		//delete play by id and then display the new table
	 	dao.deletePlayer(1001);
		System.out.println("Display the players after delete id: 1001");
		try {
			List<Player> playerAfterDeleted = dao.getAllPlayers();
			if(playerAfterDeleted!=null&& playerAfterDeleted.size()!=0)
				System.out.println("Found "+playerAfterDeleted.size()+" number of players and printing them all");
			
			for(Player p2:playerAfterDeleted) {
				System.out.println(p2);
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