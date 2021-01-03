package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch App v1.0");
		System.out.println("---------------------------------------------------");
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			
			System.out.println("Player search menu");
			System.out.println("==================================");
			System.out.println("1) By ID");
			System.out.println("2) By Contact Number");
			System.out.println("3) By Age");
			System.out.println("4) By Gender");
			System.out.println("5) By Teamname");
			System.out.println("6) By Dob");
			System.out.println("7) By Player Name");
			System.out.println("8) Show all the payers");
			System.out.println("9) Exit");
			System.out.println("Please enter appropriate choice between 1-9");
			try {
				ch = Integer.parseInt(sc.nextLine());//if you enter special symbols 
			}catch(NumberFormatException e) {
			}
				switch(ch) {
				case 1:
					System.out.println("Enter Player ID to get Player detials ...");
					try {
						int id = Integer.parseInt(sc.nextLine());
						Player player = playerSearchService.getPlayerById(id);
						if(player!=null) {
							System.out.println("Player found with id: "+id+" detail of the player is");
							System.out.println(player);
						}
					}catch(NumberFormatException e) {
						System.out.println("Player ID cannot be special chareacters ir symbols pr white space, it is numberic");
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.out.println("Enter Player Contact to get Player detials ...");
					try {
						long contact = Long.parseLong(sc.nextLine());
						
						//code to service 
						Player player = playerSearchService.getPlayerByContact(contact);
						if(player!=null) {
							System.out.println("Player found with contact number: "+contact+" detail of the player is");
							System.out.println(player);
						}
					}catch(NumberFormatException e) {
						System.out.println("Player Contact Number cannot be special chareacters ir symbols pr white space, it is numberic");
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter Player Age to get Player detials ...");
						try{
							int age = Integer.parseInt(sc.nextLine());
	
							List<Player> agePlayersList = playerSearchService.getPlayersByAge(age);
							if(agePlayersList!= null && agePlayersList.size()>0) {
								System.out.println("There are "+agePlayersList.size()+" num of players with age"+age+"..printing them..");
								for(Player p:agePlayersList) {
									System.out.println(p);
								}
							}
					}catch(NumberFormatException e){
						System.out.println("Age cannot have special chareacters or spaces or alphabets");
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 4:
					System.out.println("Enter Player Gender to get all the palyers");
					String gender = sc.nextLine();
					try {
						List<Player> genderPlayersList = playerSearchService.getPlayersByGender(gender);
						if(genderPlayersList != null && genderPlayersList.size()>0) {
							System.out.println("There are "+ genderPlayersList.size()+" num of players with gender "+gender+"..printing them..");
							for(Player p:genderPlayersList) {
								System.out.println(p);
							}
						}
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 5:
					System.out.println("Enter Teamname to get all the palyers");
					String teamname = sc.nextLine();
					try {
						List<Player> teamPlayersList = playerSearchService.getPlayersByTeamname(teamname);
						if(teamPlayersList != null && teamPlayersList.size()>0) {
							System.out.println("There are "+teamPlayersList.size()+" num of players with teamname"+teamname+"..printing them..");
							for(Player p:teamPlayersList) {
								System.out.println(p);
							}
						}
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 6:
					
					System.out.println("Enter Player dob to get all the palyers");
					String dob = sc.nextLine();
					try {
						List<Player> dobPlayersList = playerSearchService.getPlayersByDob(dob);
						if(dobPlayersList != null && dobPlayersList.size()>0) {
							System.out.println("There are "+dobPlayersList.size()+" num of players with dob "+dob+"..printing them..");
							for(Player p:dobPlayersList) {
								System.out.println(p);
							}
						}
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 7:
					System.out.println("Enter Player Name to get all the palyers");
					String name = sc.nextLine();
					try {
						List<Player> namePlayersList = playerSearchService.getPlayersByName(name);
						if(namePlayersList != null && namePlayersList.size()>0) {
							System.out.println("There are "+namePlayersList.size()+" num of players with name "+name+"..printing them..");
							for(Player p:namePlayersList) {
								System.out.println(p);
							}
						}
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 8:
					System.out.println("Retriving all the players from backend");
					try {
						List<Player> allPlayersList = playerSearchService.getAllPlayers();
						if(allPlayersList != null && allPlayersList.size()>0) {
							System.out.println("There are "+allPlayersList.size()+" num of players..printing their details..");
							for(Player p:allPlayersList) {
								System.out.println(p);
							}
						}
					}catch(BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 9:
					System.out.println("Thank you for using our PlayerSearch App V1.0...Have a good one..:)");
					break;
				default: System.out.println("Invilid meun option");
					
				}
					
		}while(ch!=9);

	}

}
//select all detail you want from player 
//
//