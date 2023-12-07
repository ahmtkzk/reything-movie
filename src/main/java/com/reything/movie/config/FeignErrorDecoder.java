package com.reything.movie.config;

import com.reything.movie.exception.ClientApiException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;

public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String message, Response response) {
        int statusCode = response.status();
        if (HttpStatus.valueOf(statusCode).is4xxClientError() || HttpStatus.valueOf(statusCode).is5xxServerError()) {
            return new ClientApiException(statusCode, message);
        }
        return null;
    }

}
