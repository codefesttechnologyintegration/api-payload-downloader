package com.codefest3.APIPayloadDownloader.service;

import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadContent;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadResponse;
import com.codefest3.APIPayloadDownloader.util.DynatraceLogsCache;
import com.codefest3.APIPayloadDownloader.util.DynatraceRequestUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class ApiPayloadService {

    public ApiPayloadResponse fetchAPIPayloads(
            String serviceName,
            String confirmationNumber,
            String correlationId,
            LocalDateTime startDate,
            LocalDateTime endDate) {

        ApiPayloadResponse response = DynatraceRequestUtil.getApiPayloadResponse(serviceName, confirmationNumber, correlationId, startDate, endDate);
        return response;
    }

    public ApiPayloadContent getApiPayloadContent(String serviceName, String correlationId) {
        ApiPayloadContent response = DynatraceLogsCache.getApiPayloadContent(serviceName, correlationId);
        return response;
    }

    public ApiPayloadContent getApiPayloadDrillDownContent(String serviceName, String correlationId, String drillDownOption) {
        ApiPayloadContent response = DynatraceLogsCache.getApiPayloadDrillDownContent(serviceName, correlationId, drillDownOption);
        return response;
    }

}
