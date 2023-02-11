package com.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

    private Long totalRecords;
    private Integer fetchedRecords;
    private Integer totalPages;
    private String status;
    private String errorMessage;
    private String successMessage;
}
