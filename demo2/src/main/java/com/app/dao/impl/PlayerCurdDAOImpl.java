package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.module.Player;

public class PlayerCurdDAOImpl implements PlayerCrudDAO{
	@Override
	public int createPlayer(Player player) throws BusinessException{
		//step 3 -to 6 all done  by the following code
		int c = 0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into \"MySchema\".player(id, name, gender,age, dob, contact, teamname) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setString(3, player.getGender());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setDate(5, new java.sql.Date(player.getDob().getTime()));//util.Data to sql.Date
			preparedStatement.setLong(6, player.getContact());
			preparedStatement.setString(7, player.getTeamname());
			
			c = preparedStatement.executeUpdate();	
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		//task
		int d = 0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "delete from  \"MySchema\".player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			d = preparedStatement.executeUpdate();
		
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}		
	}
	
	@Override
	public int updatePlayerContact(int id, long newContact) {
		//task 
		int u =0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "update \"MySchema\".player set contact=? where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, newContact);
			preparedStatement.setInt(2,id);
		    u = preparedStatement.executeUpdate();
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
			
		return u;
	}
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select name, gender,age, dob, contact, teamname from \"MySchema\".player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);//set the first ? to id
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setAge(resultSet.getInt("age"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));	
			}else{
				throw new BusinessException("No Player found with id"+id);
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return player;
	}
	
	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, gender,age, dob, contact, teamname from \"MySchema\".player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playerList.add(player);
			}if(playerList.size()==0){
				throw new BusinessException("No Player in the db so far");
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playerList;
	}
	

}
