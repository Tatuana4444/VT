package com.epam.shop.dao;

import com.epam.shop.entity.User;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.List;
import java.util.Optional;

/**
 * This class realize UserDAO
 */
public class UserDao {
    private List<User> users = SingletonOnlineShop.getInstance().getUser();

    /**
     * Setter for user
     *
     * @param user user which need to add
     */
    public void addUser(User user) {
        this.users.add(user);
    }

    /**
     * Check This method check available user
     *
     * @param login    user's login
     * @param password user's password
     * @return list of product which have such login and password
     */
    public Optional<User> isAvailable(String login, String password) {
        return users.stream()
                .filter(u -> password.equals(u.getPassword())
                        && login.equals(u.getLogin()))
                .findFirst();
    }
}
