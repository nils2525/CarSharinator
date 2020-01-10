package com.carsharinator.app.services;

import com.carsharinator.app.models.users.User;
import com.carsharinator.app.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class is used to manipulate the {@link User} DTO.
 */
@Component
public class UserService {

    /**
     * The repository used as persistent layer to save the user.
     */
    private IUserRepository _repository;

    /**
     * Initializes a new instance of the {@link UserService} class.
     * @param repository The CRUD repository this service should use.
     */
    @Autowired
    public UserService(IUserRepository repository){
        _repository = repository;
    }

    /**
     * Registers a user using this {@literal username} and {@literal password}.
     * @param username The username the user has choose.
     * @param password The password the user has choose.
     * @return The saved user instance.
     */
    public User registerUser(String username, String password){
        if(username == null){
            throw new IllegalArgumentException("The parameter 'username' cant be null!");
        }
        if(password == null){
            throw new IllegalArgumentException("The parameter 'password' cant be null!");
        }
        User userToCreate = new User();
        userToCreate.setUsername(username);
        userToCreate.setPassword(password);
        return _repository.save(userToCreate);
    }

    /**
     * Logs a user in for authentication.
     * @param username The username of the user to login.
     * @param password The password of the user to login.
     * @return A {@link User} instance, of the logged in user.
     */
    public User loginUser(String username, String password){
        //TODO: implement it with cookies etc!
        throw new UnsupportedOperationException();
    }

    /**
     * Logs a user out of the system.
     * @param user The user to log out.
     * @return The logout {@link User} instance.
     */
    public User logoutUser(User user){
        //TODO: implement it with cookies etc!
        throw new UnsupportedOperationException();
    }

}
