package com.app.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, age, gender from \"MySchema\".player where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
			    player.setTeamname(resultSet.getString("teamname"));
				
			}else{
				throw new BusinessException("No Player found with id "+id);
			}
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return player;
	}

	@Override
	public Player getPlayerByCont(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, age, gender from \"MySchema\".player where contact = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setContact(contact);
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setId(resultSet.getInt("id"));
				player.setDob(resultSet.getDate("dob"));
			    player.setTeamname(resultSet.getString("teamname"));
				
			}else{
				throw new BusinessException("No Player found with contact "+contact);
			}
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, age, teamname, gender, contact, dob from \"MySchema\".player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
				
			}if(playersList.size()==0){
				throw new BusinessException("No Player in the db so far");
			}
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersList;
		
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, age, gender, teamname contact, dob from \"MySchema\".player where age=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(age);
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
			}if(playersList.size()==0){
				throw new BusinessException("No players found with age "+age);
			}
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, age, gender, teamname contact, dob from \"MySchema\".player where gender=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(gender);
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
				
			}if(playersList.size()==0){
				throw new BusinessException("No Player found with gender "+ gender);
			}
		}catch(ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByTeamname(String teamname) throws BusinessException {
		// TODO Auto-generated method stub
		
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql="select id,name,age,gender,teamname,contact,dob from roc_revature.player where teamname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamname);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(teamname);
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
			}
			if(playersList.size()==0)
			{
				throw new BusinessException("No Players found with teamname "+teamname);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql="select id,name,age,gender,teamname,contact,dob from roc_revature.player where dob=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, dob);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Date date = Date.valueOf(dob);
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(date);
				playersList.add(player);
			}
			if(playersList.size()==0)
			{
				throw new BusinessException("No Players found with dob "+dob);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}
		return playersList;

	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql="select id,name,age,gender,teamname,contact,dob from roc_revature.player where name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(name);
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
			}
			if(playersList.size()==0)
			{
				throw new BusinessException("No Players found with name "+name);
			}
		}catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}
		return playersList;
		
	}

}
