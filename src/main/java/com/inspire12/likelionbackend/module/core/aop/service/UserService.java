package com.inspire12.likelionbackend.module.core.aop.service;

import com.inspire12.likelionbackend.module.core.aop.aspect.LogExecutionTime;
import com.inspire12.likelionbackend.module.core.aop.aspect.UserInputValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class.getName());

    @LogExecutionTime
    @UserInputValidate
    public void registerUser(String username, String email) { // 변경됨
        log.info("DB에 사용자 저장 로직 실행");
    }
}