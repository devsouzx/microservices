package com.devsouzx.order.kafka;

import com.devsouzx.order.customer.CustomerResponse;
import com.devsouzx.order.order.PaymentMethod;
import com.devsouzx.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
