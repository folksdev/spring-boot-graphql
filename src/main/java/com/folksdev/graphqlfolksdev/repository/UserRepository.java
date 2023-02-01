package com.folksdev.graphqlfolksdev.repository;

import com.folksdev.graphqlfolksdev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
