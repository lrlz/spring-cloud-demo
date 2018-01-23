package com.lrlz.commons.response;

import com.xiaoleilu.hutool.http.HttpStatus;
import lombok.Data;

/**
 * BaseResult
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/13
 */
@Data
public class BaseResult {

    private String message;
    private int code;
    private Object data;
    private boolean success = true;

    public static BaseResult failure(String message) {
        return new BaseResult(message, 0, null, false);
    }
    public static BaseResult success(Object obj) {
        return new BaseResult(null, HttpStatus.HTTP_OK, obj, true);
    }
    public static BaseResult success(String message, Object obj) {
        return new BaseResult(message, HttpStatus.HTTP_OK, obj, true);
    }
    public static BaseResult succeed() {
        return success(null);
    }

    public BaseResult(String message, int code, Object data, boolean success) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.success = success;
    }

    public BaseResult() {
        super();
    }



}
