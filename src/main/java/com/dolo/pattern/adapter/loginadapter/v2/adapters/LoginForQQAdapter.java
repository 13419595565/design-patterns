package com.dolo.pattern.adapter.loginadapter.v2.adapters;


import com.dolo.pattern.adapter.loginadapter.ResultMsg;

/**
 *
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
