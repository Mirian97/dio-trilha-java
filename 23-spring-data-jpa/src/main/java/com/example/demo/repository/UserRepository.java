package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

/*
 * Define a interface UserRepository, que estende JpaRepository. 
 * Isso permite que UserRepository herde todos os métodos de CRUD básicos para a entidade User, 
 * cuja chave primária é do tipo Integer.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
     //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUsername(String username);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
} 