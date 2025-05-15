package com.codefest3.APIPayloadDownloader.util;

import com.codefest3.APIPayloadDownloader.constants.ApiPayloadConstants;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DynatraceRequestUtil {

    public static ApiPayloadResponse getApiPayloadResponse (String serviceName, String confirmationNumber, String correlationId, LocalDateTime startDate, LocalDateTime endDate) {
        return buildMockedPayloadDetails(serviceName, confirmationNumber, correlationId);
    }

    private static ApiPayloadResponse buildMockedPayloadDetails(String serviceName, String confirmationNumber, String correlationId){

        // Sample data for PayloadDetails
        ApiPayloadResponse.PayloadDetails payload1 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName(ApiPayloadConstants.SERVICE_PLACE_ORDER)
                .confirmationNumber((confirmationNumber == null || confirmationNumber.isEmpty()) ? ApiPayloadConstants.SAMPLE_CONFIRMATION_NUMBER_1 : confirmationNumber)
                .correlationId((correlationId == null || correlationId.isEmpty()) ? ApiPayloadConstants.SAMPLE_CORRELATION_ID_1 : correlationId)
                .logTimestamp(LocalDateTime.now().minusHours(1))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "Address","roomInfo","Payment"))
                .build();

        ApiPayloadResponse.PayloadDetails payload2 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName(ApiPayloadConstants.SERVICE_RESERVATION_DELIVERY)
                .confirmationNumber((confirmationNumber == null || confirmationNumber.isEmpty()) ? ApiPayloadConstants.SAMPLE_CONFIRMATION_NUMBER_1 : confirmationNumber )
                .correlationId((correlationId == null || correlationId.isEmpty()) ? ApiPayloadConstants.SAMPLE_CORRELATION_ID_1 : correlationId )
                .logTimestamp(LocalDateTime.now().minusHours(2))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "roomInfo"))
                .build();

        ApiPayloadResponse.PayloadDetails payload3 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName(ApiPayloadConstants.SERVICE_RESERVATION_CREATE_MODIFY)
                .confirmationNumber((confirmationNumber == null || confirmationNumber.isEmpty()) ? ApiPayloadConstants.SAMPLE_CONFIRMATION_NUMBER_1 : confirmationNumber )
                .correlationId((correlationId == null || correlationId.isEmpty()) ? ApiPayloadConstants.SAMPLE_CORRELATION_ID_1: correlationId )
                .logTimestamp(LocalDateTime.now().minusHours(3))
                .payload(null)
                .drillDownOptions(Arrays.asList("Select Option", "Name", "Address","roomInfo"))
                .build();

        // Create a list of PayloadDetails
        List<ApiPayloadResponse.PayloadDetails> payloadDetailsList;
        if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_PLACE_ORDER)) {
            payloadDetailsList = Arrays.asList(payload1);
        } else if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_RESERVATION_DELIVERY)) {
            payloadDetailsList = Arrays.asList(payload2);
        } else if (serviceName.equalsIgnoreCase(ApiPayloadConstants.SERVICE_RESERVATION_CREATE_MODIFY)) {
            payloadDetailsList = Arrays.asList(payload3);
        } else  {
            payloadDetailsList = Arrays.asList(payload1, payload2, payload3);
        }

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
