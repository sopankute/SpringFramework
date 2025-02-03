/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.db;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author CDAC
 */

public class DBOperations {

    private JdbcTemplate jdbcTemplate;  
    String query = null;
    int rowsAffected = 0;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public boolean verifyUserDetails(String username, String password){
        query = "select username from userlogininfo where username=? and password=?";
        try {
            UserLoginInfo ul = jdbcTemplate.queryForObject(query,
                    new Object[]{username, password}, 
                    new BeanPropertyRowMapper<UserLoginInfo>(UserLoginInfo.class));
            if (ul != null) {
                return true;
            }
        } catch (EmptyResultDataAccessException ee) {

        }
        
        return false;
    }    
  
}
