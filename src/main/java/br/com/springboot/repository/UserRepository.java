package br.com.springboot.repository;

import javax.annotation.ManagedBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.springboot.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>{
    
}
