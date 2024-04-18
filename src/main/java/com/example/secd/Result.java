package com.example.secd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Boolean success;
    private String errorMsg;
    private T data;
    private Long total;

    public static Result ok(){
        return new Result<>(true, null, null, null);
    }
    public static<T> Result<T> ok(T data){
        return new Result<T>(true, null, data, null);
    }
    public static<T> Result<List<T>> ok(List<T> data, Long total){
        return new Result<>(true, null, data, total);
    }
    public static<T> Result<Map<T,T>> ok(Map<T,T> data, Long total){
        return new Result<>(true, null, data, total);
    }
    public static Result fail(String errorMsg){
        return new Result(false, errorMsg, null, null);
    }

    public boolean isSuccess() {
        return success;
    }
}
