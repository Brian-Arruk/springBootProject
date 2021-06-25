package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
