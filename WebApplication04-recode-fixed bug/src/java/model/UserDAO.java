/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author an0other
 */
public class UserDAO {

    List<UserDTO> user_list = new ArrayList<UserDTO>();

    public UserDAO() {
        user_list.add(new UserDTO("admin", "admin", "admin", "AD", true));
        user_list.add(new UserDTO("se123", "hcm", "Tran Quang Thanh", "MB", true));
        user_list.add(new UserDTO("se234", "hcm", "CC", "MB", true));
    }
    
    public boolean login(String userID, String password){
        for (UserDTO userDTO : user_list) {
            if(userDTO.getUserID().equalsIgnoreCase(userID)
                    && userDTO.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public UserDTO getUserById(String id){
        for (UserDTO userDTO : user_list) {
            if(userDTO.getUserID().equalsIgnoreCase(id)){
                return userDTO;
            }
        }
        return null;
    }
}
