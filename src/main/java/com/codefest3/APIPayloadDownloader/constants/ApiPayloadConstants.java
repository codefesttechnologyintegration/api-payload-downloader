package com.codefest3.APIPayloadDownloader.constants;

public class ApiPayloadConstants {

    public static final String orderPayloadSample1 = "{\"confirmationNumber\":890111, \"name\" : {\"firstName\" : \"John\",\"middleName\" : null,\"lastName\" : \"Smith\"},\"address\" : {\"addressline1\":\"123 Main Street\",\"addressLine2\" : \"Apt #1234\",\"city\" : \"Boston\",\"state\" : \"MA\",\"country\" : \"United States of America\"},\"roomInfo\" : {\"type\" : \"\",\"numberOfRooms\": 2},\"payment\" : {\"cardType\" : \"visa\",\"cardNumber\" : 44445555666677778888,\"expirationMonth\" : 10,\"expirationYear\" : 2030,\"securityCode\" : 111},\"service\" : \"Place Order\",\"correlationId\" : \"f47ac10b\"  }";

    public static final String orderDrillDownPayment = "{\"cardType\" : \"visa\", \"cardNumber\" : 44445555666677778888, \"expirationMonth\" : 10,\"expirationYear\" : 2030,\"securityCode\" : 111}";

}
