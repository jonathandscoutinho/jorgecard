package DAO;

import org.springframework.data.repository.CrudRepository;

import model.Card;

public interface ICard extends CrudRepository<Card, Integer>{

}
