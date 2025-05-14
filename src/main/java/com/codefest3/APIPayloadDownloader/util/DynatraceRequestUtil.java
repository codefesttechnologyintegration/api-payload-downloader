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
                .serviceName("Place Order")
                .confirmationNumber("890111")
                .correlationId("f47ac10b")
                .logTimestamp(LocalDateTime.now().minusHours(1))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "Address","roomInfo","Payment"))
                .build();

        ApiPayloadResponse.PayloadDetails payload2 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("Reservation Delivery")
                .confirmationNumber("890111")
                .correlationId("f47ac10b")
                .logTimestamp(LocalDateTime.now().minusHours(2))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "roomInfo"))
                .build();

        ApiPayloadResponse.PayloadDetails payload3 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("Reservation Create/Modify")
                .confirmationNumber("890111")
                .correlationId("f47ac10b")
                .logTimestamp(LocalDateTime.now().minusHours(3))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "Address","roomInfo"))
                .build();

        // Create a list of PayloadDetails
        List<ApiPayloadResponse.PayloadDetails> payloadDetailsList = Arrays.asList(payload1, payload2, payload3);

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
