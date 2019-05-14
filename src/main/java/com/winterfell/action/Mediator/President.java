package com.winterfell.action.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhuzhenjie
 **/
public class President implements Mediator {

    private Map<String, Department> map = new HashMap<String, Department>();

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }
}
