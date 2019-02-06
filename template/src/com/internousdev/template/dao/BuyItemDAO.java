package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
				BuyItemDTO buyItemDTO=new BuyItemDTO();
				DBConnector dbConnector = new DBConnector();
				Connection connection = dbConnector.getConnection();

				String sql="selectid,item_name,item_price from item_info_transaction";
			try{
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();

				if(resultSet.next()){
					buyItemDTO.setId(resultSet.getInt("id"));
					buyItemDTO.setItemName(resultSet.getString("item_name"));
					buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			return buyItemDTO;
		}
	}
