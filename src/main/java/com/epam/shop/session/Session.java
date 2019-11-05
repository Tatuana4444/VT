package com.epam.shop.session;

import java.util.List;

public class Session {
    private  static int currUserId;

    public static int getCurrUserId() {
        return currUserId;
    }

    public static void setCurrUserId(int currUserId) {
        Session.currUserId = currUserId;
    }
}
