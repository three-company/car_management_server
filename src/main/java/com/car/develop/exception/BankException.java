package com.car.develop.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author weimin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BankException extends RuntimeException{
    private String code;
    private String msg;

    public BankException(String code, String msg){
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
