package com.devsouzx.customer.costumer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Costumer firstname is required")
        String firstname,
        @NotNull(message = "Costumer lastname is required")
        String lastname,
        @NotNull(message = "Costumer email is required")
        @Email(message = "Customer Email is not a valid email address")
        String email,
        Address address
) {
}
