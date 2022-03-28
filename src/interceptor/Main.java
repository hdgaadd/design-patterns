package interceptor;

import interceptor.component.FilterManager;
import interceptor.component.Target;
import interceptor.filter.FilterOne;
import interceptor.filter.FilterTwo;

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
