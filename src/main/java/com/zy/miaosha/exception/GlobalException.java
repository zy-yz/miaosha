package com.zy.miaosha.exception;

import com.zy.miaosha.result.CodeMsg;

public class GlobalException extends RuntimeException{

    private static final long seralVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm){
        super(cm.toString());
        this.cm = cm;
    }
    public CodeMsg getCm(){
        return cm;
    }
}
