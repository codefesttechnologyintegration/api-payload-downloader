package com.codefest3.APIPayloadDownloader.constants;

public class ApiPayloadConstants {

    public static final String SERVICE_PLACE_ORDER = "Place Order";
    public static final String SERVICE_RESERVATION_DELIVERY = "Reservation Delivery";
    public static final String SERVICE_RESERVATION_CREATE_MODIFY = "Reservation Create/Modify";
    public static final String SAMPLE_CONFIRMATION_NUMBER_1 = "890111";
    public static final String SAMPLE_CORRELATION_ID_1 = "f47ac10b";
    public static final String SAMPLE_CONFIRMATION_NUMBER_2 = "890333";
    public static final String SAMPLE_CORRELATION_ID_2 = "g48bd11c";

    public static final String orderPayloadSample1 = "{\"confirmationNumber\":890111, \"name\" : {\"firstName\" : \"John\",\"middleName\" : \"Grace\",\"lastName\" : \"Smith\"},\"address\" : {\"addressline1\":\"123 Main Street\",\"addressLine2\" : \"Apt #1234\",\"city\" : \"Boston\",\"state\" : \"MA\",\"country\" : \"United States of America\"},\"roomInfo\" : {\"type\" : \"guest\",\"numberOfRooms\": 2},\"payment\" : {\"cardType\" : \"visa\",\"cardNumber\" : 44445555666677778888,\"expirationMonth\" : 10,\"expirationYear\" : 2030,\"securityCode\" : 111},\"service\" : \"Place Order\",\"correlationId\" : \"f47ac10b\"  }";

    public static final String reservationDeliveryPayloadSample1 = "{\"confirmationNumber\":890111,\"name\" : {\"firstName\" : \"Ethan\",\"middleName\" : \"Michael\",\"lastName\" : \"Rivera\"},\"roomInfo\" : { \"type\" : \"deluxe\",\"numberOfRooms\": 1},\"service\" : \"Reservation Delivery\",\"correlationId\" : \"f47ac10b\" }";

    public static final String reservationCreateModifyPayloadSample1 = "{\"confirmationNumber\":890111, \"name\" : {\"firstName\" : \"Noah \",\"middleName\" : \"James\",\"lastName\" : \"Bennett\"},\"address\" : {\"addressline1\":\"123 Main Street\",\"addressLine2\" : \"Apt #1234\",\"city\" : \"Boston\",\"state\" : \"MA\",\"country\" : \"United States of America\"},\"roomInfo\" : {\"type\" : \"Executive\",\"numberOfRooms\": 3},\"service\" : \"Reservation Create/Modify\",\"correlationId\" : \"f47ac10b\"  }";

    public static final String DRILL_DOWN_OPTION_NAME = "Name";
    public static final String DRILL_DOWN_OPTION_ADDRESS = "Address";
    public static final String DRILL_DOWN_OPTION_ROOM_INFO = "roominfo";
    public static final String DRILL_DOWN_OPTION_PAYMENT = "Payment";

    public static final String nameDrillDownPayloadContent = "{\"firstName\" : \"Noah \",\"middleName\" : \"James\",\"lastName\" : \"Bennett\"}";
    public static final String addressDrillDownPayloadContent = "{\"addressline1\":\"123 Main Street\",\"addressLine2\" : \"Apt #1234\",\"city\" : \"Boston\",\"state\" : \"MA\",\"country\" : \"United States of America\"}";
    public static final String roominfoDrillDownPayloadContent = "{\"type\" : \"Executive\",\"numberOfRooms\": 3}";
    public static final String paymentDrillDownPayloadContent = "{\"cardType\" : \"visa\", \"cardNumber\" : 44445555666677778888, \"expirationMonth\" : 10,\"expirationYear\" : 2030,\"securityCode\" : 111}";


}
