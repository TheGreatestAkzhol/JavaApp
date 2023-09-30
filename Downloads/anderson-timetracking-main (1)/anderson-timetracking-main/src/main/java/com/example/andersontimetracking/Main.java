package com.example.andersontimetracking;

import com.example.andersontimetracking.dao.UserDaoImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.isEmpty());
    }
}
