package com.devsouzx.order.payment;

import com.devsouzx.order.customer.CustomerResponse;
import com.devsouzx.order.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
