package com.nabeel.nabeel.services;

import com.nabeel.nabeel.model.Group;
import com.nabeel.nabeel.model.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServices {
    @Autowired
    GroupRepo groupRepo;

    public Group createGroup(Group group){
        return groupRepo.insert(group);
    }
    public List<Group> getAllGroups(){
        return groupRepo.findAll();
    }
    public Group AddToGroup(String userId , String gid){
        Group group = groupRepo.findById(gid).get();
        List<String>names = group.getUsers_id();

        names.add(userId);
        group.setUsers_id(names);
        groupRepo.save(group);
        return group;
        }
}
