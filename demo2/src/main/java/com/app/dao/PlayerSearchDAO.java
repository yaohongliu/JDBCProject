package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.module.Player;
import com.app.module.Player;

public interface PlayerSearchDAO {

	public Player getPlayerByContact(long contact) throws BusinessException;
	public List<Player> getPlayerByGender(String gender) throws BusinessException;
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
}
