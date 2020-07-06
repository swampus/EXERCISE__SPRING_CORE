package com.swampus.exercise.task;


import com.swampus.exercise.not.modify.annotations.DataParser;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Component
public class Task3Junior {

    @Autowired
    private DataParser dataParser;

    @DoNotModifyMethod
    public String getData() {
        return dataParser.parseData();
    }

}
