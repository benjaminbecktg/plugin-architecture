package org.benjaminbeck.plugins;

import org.benjaminbeck.domain.constant.PaymentStatusCode;
import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
@Service
public class EasternBankPlugin implements BasePlugin {

    /**
     * Right now we just return a mock value. But when the true implementation
     * comes you will deal with any connection related information
     * at this point.
     */
    @ServiceActivator(inputChannel = "easternCaptureChannel", outputChannel = "outputChannel")
    public PaymentResponseModel capturePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("EasternBankPlugin.capturePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(10000000001l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }

    @ServiceActivator(inputChannel = "easternAuthoriseChannel", outputChannel = "outputChannel")
    public PaymentResponseModel authorisePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("EasternBankPlugin.authorisePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(10000000002l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }

    @ServiceActivator(inputChannel = "easternOneStepPayChannel", outputChannel = "outputChannel")
    public PaymentResponseModel makePayment(PaymentRequestModel paymentRequestModel) {

        System.out.println("EasternBankPlugin.makePayment()");

        PaymentResponseModel paymentResponseModel = new PaymentResponseModel();
        paymentResponseModel.setCardHolderName(paymentRequestModel.getCardHolderName());
        paymentResponseModel.setAmount(paymentRequestModel.getAmount());
        paymentResponseModel.setExpiryDate(paymentRequestModel.getExpiryDate());
        paymentResponseModel.setFirstName(paymentRequestModel.getFirstName());
        paymentResponseModel.setLastName(paymentRequestModel.getLastName());
        paymentResponseModel.setStatusCode(PaymentStatusCode.SUCCESS);
        paymentResponseModel.setTransactionId(10000000003l);
        paymentResponseModel.setBankingSystem(paymentRequestModel.getBankingSystem());
        return paymentResponseModel;
    }

}
