package com.amzuit.alpha.Alpha.reposntory;

import com.amzuit.alpha.Alpha.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
