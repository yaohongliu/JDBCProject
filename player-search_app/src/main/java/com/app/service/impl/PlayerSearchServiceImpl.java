package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = null;
		if(id >1000 && id <1100) {
			//code for DAO
			player = playerSearchDAO.getPlayerById(id);
		}else {
			throw new BusinessException("Enter Player Id "+id+" is Invalid");
		}
		
		return player;
	}

	@Override
	public Player getPlayerByCont(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = null;
		if(contact >000000 && contact < 999999) {
			//code for DAO
			player = playerSearchDAO.getPlayerByCont(contact);
		}else {
			throw new BusinessException("Enter Player Contact "+contact+" is Invalid");
		}
		
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> agePlayersList = null;
		if(age >18 && age <30) {
			//code for DAO
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		}else {
			throw new BusinessException("Enter Player Age "+age+" is Invalid");
		}
		
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> agePlayersList = null;
		if(gender == "Female" || gender == "Male") {
			//code for DAO
			agePlayersList = playerSearchDAO.getPlayersByGender(gender);
		}else {
			throw new BusinessException("Enter Player Gender "+gender +" is Invalid");
		}
		
		return agePlayersList;

	}

	@Override
	public List<Player> getPlayersByTeamname(String teamname) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> teamPlayersList = null;
		if(teamname != null&& teamname.matches("[a-zA-Z]{5,20}")) {
			teamPlayersList = playerSearchDAO.getPlayersByTeamname(teamname);
			}else {
				throw new BusinessException("Enter Player teamname "+teamname+" is Invalid");
			}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> agePlayersList = null;
		if(dob == "" || dob == "") {
			//code for DAO
			agePlayersList = playerSearchDAO.getPlayersByDob(dob);
		}else {
			throw new BusinessException("Enter Player dob "+ dob +" is Invalid");
		}
		
		return agePlayersList;
		
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> agePlayersList = null;
		if(name != null&& name.matches("[a-zA-Z]")) {
			//code for DAO
			agePlayersList = playerSearchDAO.getPlayersByName(name);
		}else {
			throw new BusinessException("Enter Player Name "+name +" is Invalid");
		}
		
		return agePlayersList;
		
	}

}
//task: complete the other menu options of this app..