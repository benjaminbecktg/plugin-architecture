package org.benjaminbeck.gateway;

import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.support.GenericMessage;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
@MessagingGateway(name = "gateway", defaultRequestChannel = "inputChannel")
public interface PaymentGateway {

    @Gateway(requestChannel = "inputChannel", replyChannel = "outputChannel")
    PaymentResponseModel authorisePayment(GenericMessage<PaymentRequestModel> paymentRequestModel);

    @Gateway(requestChannel = "inputChannel", replyChannel = "outputChannel")
    PaymentResponseModel capturePayment(GenericMessage<PaymentRequestModel> paymentRequestModel);

    @Gateway(requestChannel = "inputChannel", replyChannel = "outputChannel")
    PaymentResponseModel makePayment(GenericMessage<PaymentRequestModel> paymentRequestModel);
}
