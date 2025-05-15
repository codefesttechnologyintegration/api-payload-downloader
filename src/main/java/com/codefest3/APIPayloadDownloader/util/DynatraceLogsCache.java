package com.codefest3.APIPayloadDownloader.util;

import com.codefest3.APIPayloadDownloader.constants.ApiPayloadConstants;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadContent;
import org.springframework.stereotype.Component;


@Component
public class DynatraceLogsCache {
    public static ApiPayloadContent getApiPayloadContent(String serviceName, String correlationId) {
        return buildMockedPayloadContent(serviceName);
    }
    private static ApiPayloadContent buildMockedPayloadContent(String serviceName){

        // Sample data for PayloadDetails
        ApiPayloadContent payload;

        if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_PLACE_ORDER)) {
            payload = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.orderPayloadSample1)
                    .build();
        } else if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_RESERVATION_DELIVERY)) {
            payload = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.reservationDeliveryPayloadSample1)
                    .build();
        } else if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_RESERVATION_CREATE_MODIFY)) {
            payload = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.reservationCreateModifyPayloadSample1)
                    .build();
        } else {
            payload = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.orderPayloadSample1)
                    .build();
        }

        return payload;
    }

    public static ApiPayloadContent getApiPayloadDrillDownContent(String serviceName, String correlationId , String drillDownOption) {
        return buildMockedPayloadDrillDownContent(drillDownOption);
    }

    private static ApiPayloadContent buildMockedPayloadDrillDownContent(String drillDownOption){

        // Sample data for PayloadDetails
        ApiPayloadContent drillDownPayloadContent;
        if (drillDownOption.equalsIgnoreCase(ApiPayloadConstants.DRILL_DOWN_OPTION_NAME)) {
            drillDownPayloadContent = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.nameDrillDownPayloadContent)
                    .build();
        } else if (drillDownOption.equalsIgnoreCase(ApiPayloadConstants.DRILL_DOWN_OPTION_ADDRESS)) {
            drillDownPayloadContent = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.addressDrillDownPayloadContent)
                    .build();
        } else if (drillDownOption.equalsIgnoreCase(ApiPayloadConstants.DRILL_DOWN_OPTION_ROOM_INFO)) {
            drillDownPayloadContent = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.roominfoDrillDownPayloadContent)
                    .build();
        } else if (drillDownOption.equalsIgnoreCase(ApiPayloadConstants.DRILL_DOWN_OPTION_PAYMENT)){
            drillDownPayloadContent = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.paymentDrillDownPayloadContent)
                    .build();
        } else {
            drillDownPayloadContent = ApiPayloadContent.builder()
                    .payload(ApiPayloadConstants.paymentDrillDownPayloadContent)
                    .build();
        }


        return drillDownPayloadContent;
    }
}
