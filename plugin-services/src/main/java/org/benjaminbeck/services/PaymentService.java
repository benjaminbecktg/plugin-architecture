package org.benjaminbeck.services;

import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */

public interface PaymentService {
    PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel);
}
