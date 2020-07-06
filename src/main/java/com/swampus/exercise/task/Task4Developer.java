package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.Key;
import org.springframework.context.annotation.Configuration;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Configuration
public class Task4Developer {

    public Key secretKey(){
        return new Key("t1");
    }

}
