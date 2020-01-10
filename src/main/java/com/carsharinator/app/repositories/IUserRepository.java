package com.carsharinator.app.repositories;

import com.carsharinator.app.models.users.User;
import org.springframework.data.repository.CrudRepository;

/**
 * The repository for the {@link User} used to persistent the user.
 */
public abstract class IUserRepository implements CrudRepository<User, Integer> {
}
