package com.dolo.pattern.adapter.loginadapter.v2.adapters;


import com.dolo.pattern.adapter.loginadapter.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
