package com.winterfell.other.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhuzhenjie
 **/
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        this.target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
