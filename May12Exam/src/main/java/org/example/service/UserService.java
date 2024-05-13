package org.example.service;

import org.example.dao.UserDAO;
import org.example.entity.User;
import org.example.model.UserModel;
import org.example.utility.ReadDataFromExcelFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private ReadDataFromExcelFile readDataFromExcelFile;

    @Autowired
    private UserDAO userDAO;

    public void saveUserData(UserModel userModel){
        User user = new User();
        user.setUserName(userModel.getUsername());
        this.userDAO.save(user);

    }
    public List<UserModel> getUserData(){
        List<UserModel> data= new ArrayList<>();

        //To Do code would be receiving data from database or from excel file
        data=readDataFromExcelFile.fetchAllUserData();
        return data;

    }
}
