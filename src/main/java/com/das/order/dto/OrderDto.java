package com.das.order.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



import java.sql.Timestamp;

@Builder
@Data
public class OrderDto {
    private String id;
    @NotNull
    private String product;
    @NotNull
    private String customerName;
    private String status;
    @NotNull
    private int quantity;
    @NotNull
    private double price;
    private Timestamp postingDate;
}
