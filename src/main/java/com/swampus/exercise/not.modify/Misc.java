package com.swampus.exercise.not.modify;

import com.swampus.exercise.task.Task1Junior;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Misc {

    @Autowired
    private Task1Junior task1Junior;

    public Task1Junior get(){
        return task1Junior;
    }
}
