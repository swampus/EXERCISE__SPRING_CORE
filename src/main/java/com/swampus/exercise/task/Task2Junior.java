package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.Service;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import org.springframework.stereotype.Component;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Component
public class Task2Junior {

    private Task2Junior(){
        throw new RuntimeException("No not working, Try to understand why?");
    }


    @DoNotModifyMethod
    public String getAlghoritm() {
        return "SHA";
    }

}
