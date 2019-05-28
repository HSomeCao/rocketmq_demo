package com.bank.common.info;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by caoliangwei on  2019/5/27 16:15
 */
@Data
@NoArgsConstructor
public class MQResult<T> {
    private Integer status;
    private String message;
    private T data;

    private MQResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static MQResult createBySuccess() {
        return new MQResult(0, "success", null);
    }

    public static MQResult createBySuccessWithData(Object data) {
        return new MQResult(0, "success", data);
    }

    public static MQResult createByErrorMessage(String message) {
        return new MQResult(1, message, null);
    }

    public static MQResult createByMessage(Integer i, String message) {
        return new MQResult(i, message, null);
    }
}

