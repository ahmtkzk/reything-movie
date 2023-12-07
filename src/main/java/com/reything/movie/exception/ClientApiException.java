package com.reything.movie.exception;

import feign.FeignException;

public class ClientApiException extends FeignException {

    public ClientApiException(int status, String message){
        super(status, message);
    }

}
