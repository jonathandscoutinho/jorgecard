package DAO;

import org.springframework.data.repository.CrudRepository;

import model.User;

public interface IUser extends CrudRepository<User, Integer>{

}
