package org.example.validation.constraintValidation;

import org.example.validation.NotEmpyList;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidator implements ConstraintValidator<NotEmpyList, List> {

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list!=null && !list.isEmpty();
    }

    @Override
    public void initialize(NotEmpyList constraintAnnotation) {
    }
}
