package com.nabeel.nabeel.model;

import com.nabeel.nabeel.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatarRepo extends MongoRepository<User,String> {}
