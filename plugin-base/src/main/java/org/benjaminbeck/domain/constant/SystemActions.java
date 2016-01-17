package org.benjaminbeck.domain.constant;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
public enum SystemActions {

    AUTHORISE {
        @Override
        public String toString() {
            return "Authorise";
        }
    },

    CAPTURE {
        @Override
        public String toString() {
            return "Capture";
        }
    },

    PAYMENT {
        @Override
        public String toString() {
            return "OneStepPay";
        }
    }
}