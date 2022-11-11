package com.nabeel.nabeel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
    @Id
    String gid;
    String nameGroup;
    String admin_id;
    String[] users_id;

    public Group(String gid, String nameGroup, String admin_id, String[] users_id) {
        this.gid = gid;
        this.nameGroup = nameGroup;
        this.admin_id = admin_id;
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

    public String[] getUsers_id() {
        return users_id;
    }
}
