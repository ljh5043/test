package com.example.test.services;

import com.example.test.model.user.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public interface UserService {
    /*회원가입*/
    public void memberSignUp(UserVO vo);

    public UserVO userLogin(UserVO vo);

    public boolean checkId(String userId);

    public void userLogout(HttpSession session);
}
