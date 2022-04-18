package com.codeman.chainofresponsibilitypatterns;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hdgaadd
 * Created on 2022/04/18
 */
@Data
@AllArgsConstructor
public abstract class Handler {
    private Handler nextHandler;

    protected abstract void doHandler(Handler handler);
}
