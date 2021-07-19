package br.com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;
import br.com.springboot.repository.UserRepository;

@Component
@RestController
@RequestMapping("/messages")
public class UserController {
    
    private List<Message> messages = new ArrayList<>();

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/")
    public Message message() {

        User message = new Message();
        user.setId(5L);
        user.setName("Brian");
        user.setUsername("BrianArruk");
        user.setMessage("Mensagem teste")
        return user;
    }

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id) {      
  
      Optional<Message> messageFind = this.messageRepository.findById(id);
  
      if (messageFind.isPresent()) {
        return messageFind.get();
      }
  
      return null;
    }

    @PostMapping("/")
    public Message message(@RequestBody User user) {
      return this.messageRepository.save(message);
    }

    @GetMapping("/list")
    public List<Message> list() {
        return this.messageRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public List<Message> listMoreThan(@PathVariable("id") Long id) {
        return this.messageRepository.findAllMoreThan(id);
    }

    @GetMapping("/list1/{id}")
    public List<Message> listMoreThan(@PathVariable("id") Long id) {
        return this.messageRepository.findByIdGreaterThan(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Message> findByName(@PathVariable("name") String name) {
        return this.messageRepository.findByNameIgnoreCase(name);
    }

    @GetMapping("/findByMessage/{message}")
    public List<Message> findByMessage(@PathVariable("message") String message) {
        return this.messageRepository.findByNameIgnoreCase(message);
    }
}
