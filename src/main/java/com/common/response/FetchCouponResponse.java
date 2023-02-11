package com.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FetchCouponResponse extends BaseResponse {
    private String couponId;

    private String couponCode;

    private String couponDescription;

    private String discountAmount;

    private String discountType;

    private Date startDate;

    private Date endDate;

    private String maxUsersPerCoupon;

    private String maxUsesPerPerson;

    private String createDate;

    List<FetchCouponResponse> couponDetails;
}
