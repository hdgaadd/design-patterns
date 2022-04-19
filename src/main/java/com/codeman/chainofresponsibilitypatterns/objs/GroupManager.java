package com.codeman.chainofresponsibilitypatterns.objs;

import com.codeman.chainofresponsibilitypatterns.Handler;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author hdgaadd
 * Created on 2022/04/19
 * @Description 组长
 */
@Slf4j
public class GroupManager extends Handler {

    @Override
    public void doHandler(Employee employee) {
        if (employee.getVacateDays() <= 2) {
            log.info("审核通过");
        } else {
            if (Objects.isNull(getNextHandler())) {
                log.info("审核失败");
            } else {
                getNextHandler().doHandler(employee);
            }
        }
    }
}
