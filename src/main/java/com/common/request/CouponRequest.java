package com.common.request;

import lombok.Data;

@Data
public class CouponRequest {

    private String couponId;
    private String couponCode;
    private String couponDescription;
    private String discountAmount;
    private boolean isDiscountTypePercentage;
    private String endDate;
    private String startDate;
    private String maxUsersPerCoupon;
    private String maxUsesPerPerson;
}
