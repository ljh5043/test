package com.example.test.mappers;

import com.example.test.model.user.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpSession;

@Mapper
public interface UserMapper {

    /*회원가입*/
    public void memberSignUp(UserVO vo);

    public UserVO userLogin(UserVO vo);

    public int checkId(String userId);

    public void userLogout(HttpSession session);
}
