package com.codeman.interceptor;

import com.codeman.interceptor.component.FilterManager;
import com.codeman.interceptor.component.Target;
import com.codeman.interceptor.filter.FilterOne;
import com.codeman.interceptor.filter.FilterTwo;

/**
 * @author hdgaadd
 * Created on 2022/03/28
 */
public class Main {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());

        filterManager.setFilters(new FilterOne());
        filterManager.setFilters(new FilterTwo());

        filterManager.executeFilter("parameter");
    }
}
