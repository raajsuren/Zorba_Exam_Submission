package org.example.utility;

import org.example.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReadDataFromExcelFile {
    public List<UserModel> fetchAllUserData(){
        return new ArrayList<>();

    }
}
