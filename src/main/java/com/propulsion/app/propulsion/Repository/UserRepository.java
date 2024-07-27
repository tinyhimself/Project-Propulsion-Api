package com.propulsion.app.propulsion.Repository;

import com.propulsion.app.propulsion.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
