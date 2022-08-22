package com.polarbookshop.dispatcherservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderAcceptedMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long orderId;
}
