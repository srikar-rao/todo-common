package org.module.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseStatus {

    private Boolean isSuccess;
    private String message;
    private String detail_message;
    private Integer statusCode;
    private String httpStatus;
}
