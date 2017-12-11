package com.avs.repositories;


import com.avs.models.User;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
