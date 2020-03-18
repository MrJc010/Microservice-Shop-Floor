package com.shoopfloor.item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String>{
	Item findByPpid(String id);
}
