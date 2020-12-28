package com.app.service;

import java.text.ParseException;
import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {

	public Player getPlayerById(int id) throws BusinessException;
	public Player getPlayerByCont(long contact) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
	public List<Player> getPlayersByTeamname(String teamname) throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	
}
