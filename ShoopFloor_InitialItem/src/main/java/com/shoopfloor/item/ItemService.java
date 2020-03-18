package com.shoopfloor.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
@RequestMapping(path="/item") // This means URL's start with /item (after Application path)
public class ItemService {
  @Autowired
  private ItemRepository itemRepo;

//  @PostMapping(path="/add/{name}-{email}") // Map ONLY POST Requests
//  public @ResponseBody String addNewUser (@PathVariable  String name, @PathVariable  String email) {
//    Item n = new Item();
//    n.setName(name);
//    n.setEmail(email);
//    userRepository.save(n);
//    return "Saved";
//  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Item> getAllUsers() {
    // This returns a JSON or XML with the users
    return itemRepo.findAll();
  }
  
  @GetMapping(path="/{id}")
  public Item receiveById(@PathVariable String id) {
	Item i = itemRepo.findByPpid(id);
    return i;
  }
}
