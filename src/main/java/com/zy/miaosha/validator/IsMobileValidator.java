package com.zy.miaosha.validator;

import com.zy.miaosha.util.ValidatorUtil;
import org.springframework.beans.factory.annotation.Required;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile,String> {
    private boolean required = false;

    @Override
    public void initialize(IsMobile constrainAnnotation){
        required = constrainAnnotation.required();
    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context){
        if(required){
            return ValidatorUtil.isMobile(value);
        }else {
            if(StringUtils.isEmpty(value)){
                return true;
            }else {
                return ValidatorUtil.isMobile(value);
            }
        }
    }
}
