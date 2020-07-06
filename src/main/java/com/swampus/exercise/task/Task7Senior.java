package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import com.swampus.exercise.not.modify.annotations.DoNotModifyVariable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Component
public class Task7Senior {

    @DoNotModifyVariable
    private String accessKey;

    public void init() {
        accessKey = "accessGranted";
    }

    @DoNotModifyMethod
    public Task7Senior() {
    }

    @DoNotModifyMethod
    public String getAccessKey() {
        return accessKey;
    }
}
