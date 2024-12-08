package com.scaler.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelector {
    private RazorPayPaymentGateway razorPayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewaySelector(
            RazorPayPaymentGateway razorPayPaymentGateway,
            StripePaymentGateway stripePaymentGateway
    ) {
        this.razorPayPaymentGateway=razorPayPaymentGateway;
        this.stripePaymentGateway=stripePaymentGateway;
    }

    public PaymentGateway getPaymentGateway() {
        //logic select the correct payment gateway;
        return stripePaymentGateway;
    }
}
