package org.benjaminbeck.plugins;

import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
public interface BasePlugin {

    PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel);

    PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel);

}