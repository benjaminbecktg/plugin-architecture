package org.benjaminbeck.api;

import org.benjaminbeck.domain.model.PaymentRequestModel;
import org.benjaminbeck.domain.model.PaymentResponseModel;
import org.benjaminbeck.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by benjamin.beck on 10/12/2015.
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    PaymentResponseModel GetById(@PathVariable String id) {
        // Return mock object
        PaymentResponseModel responseModel = new PaymentResponseModel();
        return responseModel;
    }
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    @ResponseBody
    PaymentResponseModel Pay(@RequestBody PaymentRequestModel requestModel) {
        PaymentResponseModel responseModel = paymentService.makePayment(requestModel);
        return responseModel;
    }

    @RequestMapping(value = "/authorise", method = RequestMethod.POST)
    @ResponseBody
    PaymentResponseModel Authorise(@RequestBody PaymentRequestModel requestModel) {
        PaymentResponseModel responseModel = paymentService.authorisePayment(requestModel);
        return responseModel;
    }

    @RequestMapping(value = "/capture", method = RequestMethod.POST)
    @ResponseBody
    PaymentResponseModel Capture(@RequestBody PaymentRequestModel requestModel) {
        PaymentResponseModel responseModel = paymentService.capturePayment(requestModel);
        return responseModel;
    }
}