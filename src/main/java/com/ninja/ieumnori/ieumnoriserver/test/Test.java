package com.ninja.ieumnori.ieumnoriserver.test;

import com.ninja.ieumnori.ieumnoriserver.user.domain.User;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.updateNickname("재인");
        System.out.println(user.getNickname());
    }
}