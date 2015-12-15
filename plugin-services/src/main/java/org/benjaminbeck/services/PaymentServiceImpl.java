package org.benjaminbeck.services;

import org.benjaminbeck.plugins.constant.*;
import org.benjaminbeck.plugins.model.*;
import org.benjaminbeck.gateway.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.messaging.support.GenericMessage;

@Component("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentGateway paymentGateway;

    public PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel) {

        Map headerMap = new HashMap();
        headerMap.put("BANKING_SYSTEM", paymentRequestModel.getBankingSystem());
        headerMap.put("ACTION", SystemActions.AUTHORISE.toString());
        GenericMessage<PaymentRequestModel> paymentRequestMsg = new GenericMessage<PaymentRequestModel>(paymentRequestModel,
                headerMap);
        PaymentResponseModel paymentResponseDTO = paymentGateway.authorisePayment(paymentRequestMsg);

        if (paymentResponseDTO.getStatusCode() == PaymentStatusCode.FAILURE) {
            /**
             * Throw relevant exception
             */
        }
        return paymentResponseDTO;

    }

    public PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel) {

        Map headerMap = new HashMap();
        headerMap.put("BANKING_SYSTEM", paymentRequestModel.getBankingSystem());
        headerMap.put("ACTION", SystemActions.CAPTURE.toString());
        GenericMessage<PaymentRequestModel> paymentRequestMsg = new GenericMessage<PaymentRequestModel>(paymentRequestModel,
                headerMap);
        PaymentResponseModel paymentResponseDTO = paymentGateway.capturePayment(paymentRequestMsg);

        if (paymentResponseDTO.getStatusCode() == PaymentStatusCode.FAILURE) {
            /**
             * Throw relevant exception
             */
        }
        return paymentResponseDTO;

    }

    public PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel) {

        Map headerMap = new HashMap();
        headerMap.put("BANKING_SYSTEM", paymentRequestModel.getBankingSystem());
        headerMap.put("ACTION", SystemActions.PAYMENT.toString());
        GenericMessage<PaymentRequestModel> paymentRequestMsg = new GenericMessage<PaymentRequestModel>(paymentRequestModel,
                headerMap);
        PaymentResponseModel paymentResponseDTO = paymentGateway.makePayment(paymentRequestMsg);

        if (paymentResponseDTO.getStatusCode() == PaymentStatusCode.FAILURE) {
            /**
             * Throw relevant exception
             */
        }
        return paymentResponseDTO;

    }

}