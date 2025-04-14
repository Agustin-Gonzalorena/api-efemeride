package org.example.efemerideapi.utils;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ApiResponse<T> {
    private LocalDateTime timestamp;
    private int status;
    private T results;

    public ApiResponse(int status, T results) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.results = results;
    }

}
