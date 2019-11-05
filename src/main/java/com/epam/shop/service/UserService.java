package com.epam.shop.service;

import com.epam.shop.dao.ProductDao;
import com.epam.shop.dao.UserDao;
import com.epam.shop.entity.Order;
import com.epam.shop.entity.Product;
import com.epam.shop.entity.User;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.Optional;

/**
 * This class implements user functions
 */
public class UserService {
    /**
     * This method get user from DAO
     * @param login user's login
     * @param password user's password
     * @return list of users that has such login and password
     */
    public Optional<User> login(String login, String password) {
        UserDao dao = new UserDao();
        return dao.isAvailable(login,password);
    }

    /**
     * This method register user in DAO
     * @param user user which needed to register
     */
    public void register(User user) {
        UserDao dao = new UserDao();
        dao.addUser(user);
    }

}
