package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.module.Player;

public interface PlayerCrudDAO {
	
	public int createPylater(Player player) throws BusinessException;
	public  void deletePlayer(int id);
	public int updatePlayerContact(int id, long newContact);
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	
	
	
}
