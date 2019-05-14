package com.winterfell.other.filter;

/**
 * @author : zhuzhenjie
 **/
public class Client {

    private FilterManager filterManager;

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        this.filterManager.filterRequest(request);
    }
}
