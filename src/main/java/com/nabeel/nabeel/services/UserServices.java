package com.nabeel.nabeel.services;

import com.nabeel.nabeel.model.DatarRepo;
import com.nabeel.nabeel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServices {
    @Autowired
    private DatarRepo datarRepo;

    public User AddUser(User user){
        return datarRepo.insert(user);
    }
    public List<User> getAllUser(String id ){
        List<User> list = datarRepo.findAll();
        List<User> temp = new ArrayList<>();
        for(int i = 0; i< list.size();i++){
            if(list.get(i).getId().equals(id)){
                continue;
            }
            else{
                temp.add(list.get(i));
            }
        }
        return temp;
    }
}
