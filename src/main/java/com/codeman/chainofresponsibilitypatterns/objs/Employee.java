package com.codeman.chainofresponsibilitypatterns.objs;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hdgaadd
 * Created on 2022/04/18
 */
@Data
@AllArgsConstructor
public class Employee { // [ɪmˈplɔɪiː]
    private String employeeName;

    /**
     * 请假天数
     */
    private Integer vacateDays;
}
