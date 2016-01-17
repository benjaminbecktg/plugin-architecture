package org.benjaminbeck.plugins;

import org.benjaminbeck.domain.constant.PaymentStatusCode;
import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Created by Benjamin.Beck on 11/23/2015.
 */
@Service
public class SouthernBankPlugin implements BasePlugin {

    /**
     * Right now we just return a mock value. But when the true implementation
     * comes you will deal with any connection related information
     * at this point.
     */
    @ServiceActivator(inputChannel = "southernCaptureChannel", outputChannel = "outputChannel")
    public PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("SouthernBankPlugin.capturePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(20000000001l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }

    @ServiceActivator(inputChannel = "southernAuthoriseChannel", outputChannel = "outputChannel")
    public PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("SouthernBankPlugin.authorisePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(20000000002l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }

    @ServiceActivator(inputChannel = "southernOneStepPayChannel", outputChannel = "outputChannel")
    public PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("SouthernBankPlugin.makePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(20000000003l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }
}