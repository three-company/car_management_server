package com.car.develop.exception;


import com.i2test.vb4.util.ResultMessage;
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
