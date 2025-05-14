package com.codefest3.APIPayloadDownloader.util;

import com.codefest3.APIPayloadDownloader.constants.ApiPayloadConstants;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadContent;
import org.springframework.stereotype.Component;


@Component
public class DynatraceLogsCache {
    public static ApiPayloadContent getApiPayloadContent(String serviceName, String correlationId) {
        return buildMockedPayloadContent();
    }
    private static ApiPayloadContent buildMockedPayloadContent(){

        // Sample data for PayloadDetails
        ApiPayloadContent payload1 = ApiPayloadContent.builder()
                .payload(ApiPayloadConstants.orderPayloadSample1)
                .build();
        return payload1;
    }

    public static ApiPayloadContent getApiPayloadDrillDownContent(String serviceName, String correlationId , String drillDownOption) {
        return buildMockedPayloadDrillDownContent();
    }

    private static ApiPayloadContent buildMockedPayloadDrillDownContent(){

        // Sample data for PayloadDetails
        ApiPayloadContent payload1 = ApiPayloadContent.builder()
                .payload(ApiPayloadConstants.orderDrillDownPayment)
                .build();
        return payload1;
    }
}
