package com.nabeel.nabeel.controller;

import com.nabeel.nabeel.model.Group;
import com.nabeel.nabeel.services.GroupServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/groups")
public class GroupController {

    @Autowired
    GroupServices groupServices;

    @PostMapping("/createGroup")
    public Group createGroup(@RequestBody Group group){
        return groupServices.createGroup(group);
    }
    @GetMapping("/MyGroups/{id}")
    public List<Group> MyGroup(@PathVariable String id ){
        List<Group> groups = groupServices.getAllGroups();
        List<Group> result = new ArrayList<>();
        for(int i = 0; i< groups.size() ; i++){
            if(groups.get(i).getAdmin_id().equals(id)){
                result.add(groups.get(i));
            }
            else{
                for(int j = 0 ;j <groups.get(i).getUsers_id().size();j++){
                    if(groups.get(i).getUsers_id().get(j).equals(id)){
                        result.add(groups.get(i));
                    }
                }
            }
        }
        return result;
    }
    @GetMapping("/{gid}/{userId}")
    public Group AddToGroup(@PathVariable String userId , @PathVariable String  gid){
        return  groupServices.AddToGroup(userId , gid);
    }
}
