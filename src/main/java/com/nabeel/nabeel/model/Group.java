package com.nabeel.nabeel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
    @Id
    String gid;
    String nameGroup;
    String admin_id;
    List<String> users_id;

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Group(String gid, String nameGroup, String admin_id, List<String> users_id) {
        this.gid = gid;
        this.nameGroup = nameGroup;
        this.admin_id = admin_id;
        this.users_id = users_id;
    }

    public void setUsers_id(List<String> users_id) {
        this.users_id = users_id;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getGid() {
        return gid;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public List<String> getUsers_id() {
        return users_id;
    }
}
