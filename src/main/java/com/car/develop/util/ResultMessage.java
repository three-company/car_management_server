package com.car.develop.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage<T> {
    //返回错误码
    private String code;
    //返回信息
    private String message;
    //返回对象
    private T data;
}
