/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class ItemModel {
    private final Connection CONNECTION;

    public ItemModel() throws Exception{
        this.CONNECTION = DBConnection.getInstance().getConnection();
    }
    
    public String saveItem(ItemDto dto) throws Exception{
        String sql = "INSERT INTO item VALUES(?,?,?,?,?)";
        PreparedStatement statement = CONNECTION.prepareStatement(sql);
        statement.setString(1, dto.getItemCode());
        statement.setString(2, dto.getDescription());
        statement.setString(3, dto.getPackSize());
        statement.setDouble(4, dto.getUnitPrice());
        statement.setInt(5, dto.getQoh());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
        
    }
}
