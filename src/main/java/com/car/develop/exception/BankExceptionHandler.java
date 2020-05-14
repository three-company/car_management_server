package com.car.develop.exception;


import com.car.develop.util.ResultMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author weimin
 */
@ControllerAdvice
public class BankExceptionHandler {
    @ExceptionHandler(value = BankException.class)
    @ResponseBody
    public ResultMessage<Object> handle(BankException e) {
        return new ResultMessage<>(e.getCode(), e.getMsg(), null);
    }
}
