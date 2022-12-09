package com.example.ComplaintAppBackend.dao;

import com.example.ComplaintAppBackend.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}
