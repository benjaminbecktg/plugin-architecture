package org.benjaminbeck.services;

import org.benjaminbeck.plugins.model.PaymentRequestModel;
import org.benjaminbeck.plugins.model.PaymentResponseModel;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */

public interface PaymentService {
    PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel);
}
