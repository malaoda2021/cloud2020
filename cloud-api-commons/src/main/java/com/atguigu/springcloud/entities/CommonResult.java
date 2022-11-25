package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author malaoda
 * @create 2022-11-20 11:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T            data;

    public CommonResult(Integer code, String message){
        this(code,message, null);
    }
}
