package com.crz.service;

import com.crz.dao.LoginMapper;

public class LoginServiceImpl implements LoginService{
    private LoginMapper loginMapper;

    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public String verify(String username) {
        return loginMapper.verify(username);
    }
}
