package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.DeliveryCalculator;
import com.swampus.exercise.not.modify.StorageCalculator;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


/**
 * Analyze Spring - error and make a fix. (Modify / remove only code without deny-annotations (like @DoNotModify**)
 */
@Component
public class Task0Junior {


    private StorageCalculator storageCalculator;

    private DeliveryCalculator deliveryCalculator;

    @DoNotModifyMethod
    public BigDecimal calculateTotalAmount(BigDecimal money){
        System.out.println("\n \n storageCalculator is: " + storageCalculator);
        System.out.println("deliveryCalculator is: " + storageCalculator);
        BigDecimal totalAmount = storageCalculator.applyStorageInterests(money);
        return deliveryCalculator.applyDeliveryInterests(money);
    }


}
