package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.JsonDataParser;
import com.swampus.exercise.not.modify.XmlDataParser;
import com.swampus.exercise.not.modify.annotations.DoNotAddAnnotation;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import com.swampus.exercise.not.modify.annotations.DoNotModifyVariable;
import org.springframework.stereotype.Service;

/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Service
public class Task5Developer {

    @DoNotModifyVariable
    @DoNotAddAnnotation
    private JsonDataParser jsonDataParser;

    @DoNotModifyVariable
    @DoNotAddAnnotation
    private XmlDataParser xmlDataParser;

    @DoNotModifyMethod
    public String doStaff(){
        return xmlDataParser.parseData()+jsonDataParser.parseData();
    }
}
