package com.codefest3.APIPayloadDownloader.util;

import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadResponse;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample data for PayloadDetails
        ApiPayloadResponse.PayloadDetails payload1 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("ServiceA")
                .confirmationNumber("12345")
                .correlationId("abcde-12345")
                .payload("Sample payload data 1")
                .logTimestamp(LocalDateTime.now())
                .build();

        ApiPayloadResponse.PayloadDetails payload2 = ApiPayloadResponse.PayloadDetails.builder()
                .serviceName("ServiceB")
                .confirmationNumber("67890")
                .correlationId("fghij-67890")
                .payload("Sample payload data 2")
                .logTimestamp(LocalDateTime.now())
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
    }
}

