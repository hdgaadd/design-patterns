package com.codeman.chainofresponsibilitypatterns;

import com.codeman.chainofresponsibilitypatterns.objs.Employee;
import lombok.Data;

/**
 * @author hdgaadd
 * Created on 2022/04/18
 */
@Data
public abstract class Handler {
    private Handler nextHandler;

    public abstract void doHandler(Employee employee);
}
