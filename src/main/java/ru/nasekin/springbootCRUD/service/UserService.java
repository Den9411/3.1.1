package ru.nasekin.springbootCRUD.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.nasekin.springbootCRUD.model.User;


import java.util.List;

public interface UserService extends UserDetailsService {
    public void addUser (User user);
    public void updateUser(long id, User user);
    public void removeUser(long id);
    public User getUserById(long id);
    public List<User> getAll();
    User getUserByUsername(String name) throws UsernameNotFoundException;


    @Override
    UserDetails loadUserByUsername(String name) throws UsernameNotFoundException;
}
