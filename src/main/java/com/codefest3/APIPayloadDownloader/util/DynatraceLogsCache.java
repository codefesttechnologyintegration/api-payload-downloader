package com.codefest3.APIPayloadDownloader.util;

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
                .payload("sample Payload 1")
                .build();
        return payload1;
    }

    public static ApiPayloadContent getApiPayloadDrillDownContent(String serviceName, String correlationId , String drillDownOption) {
        return buildMockedPayloadDrillDownContent();
    }

    private static ApiPayloadContent buildMockedPayloadDrillDownContent(){

        // Sample data for PayloadDetails
        ApiPayloadContent payload1 = ApiPayloadContent.builder()
                .payload("sample Drill Down Payload 1")
                .build();
        return payload1;
    }
}
