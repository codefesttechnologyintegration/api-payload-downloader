package com.codefest3.APIPayloadDownloader.util;

import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DynatraceRequestUtil {

    public static ApiPayloadResponse getApiPayloadResponse (String serviceName, String confirmationNumber, String correlationId, LocalDateTime startDate, LocalDateTime endDate) {
        return buildMockedPayloadDetails();
    }

    private static ApiPayloadResponse buildMockedPayloadDetails(){

        // Sample data for PayloadDetails
        ApiPayloadResponse.PayloadDetails payload1 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("ServiceA")
                .confirmationNumber("12345")
                .correlationId("abcde-12345")
                .logTimestamp(LocalDateTime.now().minusHours(2))
                .payload(null)
                .drillDownOptions(Arrays.asList("Name", "Address","Payment"))
                .build();

        ApiPayloadResponse.PayloadDetails payload2 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("ServiceB")
                .confirmationNumber("67890")
                .correlationId("fghij-67890")
                .logTimestamp(LocalDateTime.now().minusHours(2))
                .payload(null)
                .logTimestamp(LocalDateTime.now())
                .drillDownOptions(Arrays.asList("Name", "Address","Payment"))
                .build();

        // Create a list of PayloadDetails
        List<ApiPayloadResponse.PayloadDetails> payloadDetailsList = Arrays.asList(payload1, payload2);

        // Build the ApiPayloadResponse object
        ApiPayloadResponse apiPayloadResponse = new ApiPayloadResponse();
        apiPayloadResponse.payloadDetailsList = payloadDetailsList;
        apiPayloadResponse.startDate = LocalDateTime.now().minusDays(1);
        apiPayloadResponse.endDate = LocalDateTime.now();

        // Print the ApiPayloadResponse object
        System.out.println(apiPayloadResponse);

        return apiPayloadResponse;
    }

}
