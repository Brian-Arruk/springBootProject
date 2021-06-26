package br.com.springboot.repository;

import javax.annotation.ManagedBean;
import java.util.List
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.springboot.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query("SELECT u from User u where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);

    public List<User> findByIdGreaterThan(Long id);

    public List<User> findByNameIgnoreCase(String name);
}
