package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.module.Player;

public interface PlayerSearchDAO {

	public Player getPlayerByContact(long contact) throws BusinessException;
	public List<Player> getPlayerByGender(String gender) throws BusinessException;
}
