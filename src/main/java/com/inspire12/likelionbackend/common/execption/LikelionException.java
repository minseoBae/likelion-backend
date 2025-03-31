package com.inspire12.likelionbackend.common.execption;

import lombok.Getter;

@Getter
public class LikelionException extends RuntimeException {
    private final ErrorCode errorCode;
    public LikelionException() {
        super("likelion exception");
        this.errorCode = ErrorCode.LIKE_LION_ERROR;
    }

    public LikelionException(ErrorCode errorCode) {
        super("likelion exception");
        this.errorCode = errorCode;
    }
}
