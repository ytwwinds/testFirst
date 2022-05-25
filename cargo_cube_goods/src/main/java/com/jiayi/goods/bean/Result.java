package com.jiayi.goods.bean;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
/**
 * @author ytw
 * @date 2022/5/25 10:25
 */
    @Getter //防止JSON序列化失败
    @SuppressWarnings("unchecked")
    public class Result<T> implements Serializable {

        private Integer code;
        private String message;
        private T data;

        private Result() {
        }

        private Result(Integer code, String message, T data) {
            this.code = code;
            this.message = message;
            this.data = data;
        }

        public static Result success() {
            return new Result(HttpStatus.OK.value(), "success", null);
        }

        public static <T> Result success(T data) {
            return new Result(HttpStatus.OK.value(), "success", data);
        }

        public static <T> Result success(String message) {
            return new Result(HttpStatus.OK.value(), message, null);
        }

        public static Result fail(Integer code, String message) {
            return new Result(code, message, null);
        }
    }

