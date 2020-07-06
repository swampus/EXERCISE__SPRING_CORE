package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.Service;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Service
public class Task6Developer {

    @DoNotModifyMethod
    public String something(){
        return "something";
    }
}
