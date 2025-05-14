package com.codefest3.APIPayloadDownloader.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;


public class ApiPayloadResponse {
    public List<PayloadDetails> payloadDetailsList;
    public LocalDateTime startDate;
    public LocalDateTime endDate;

    @Value
    @Builder
    @RequiredArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PayloadDetails {
        String serviceName;
        String confirmationNumber;
        String correlationId;
        LocalDateTime logTimestamp;
        String payload;
        List<String> drillDownOptions;
    }

}

