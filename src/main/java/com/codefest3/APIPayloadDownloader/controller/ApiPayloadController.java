package com.codefest3.APIPayloadDownloader.controller;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadContent;
import com.codefest3.APIPayloadDownloader.model.response.ApiPayloadResponse;
import com.codefest3.APIPayloadDownloader.service.ApiPayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ApiPayloadController {

    @Autowired
    private ApiPayloadService apiPayloadService;

    @GetMapping("v1/api/payload/fetch")
    public ApiPayloadResponse fetchApiResponse(
            @RequestParam String serviceName,
            @RequestParam String confirmationNumber,
            @RequestParam String correlationId,
            @RequestParam LocalDateTime startDate,
            @RequestParam LocalDateTime endDate) {

        ApiPayloadResponse response = apiPayloadService.fetchAPIPayloads(serviceName, confirmationNumber, correlationId, startDate, endDate);

        return response;
    }

    @GetMapping("v1/api/payload/content")
    public ApiPayloadContent getApiPayloadContent(
            @RequestParam String serviceName,
            @RequestParam String correlationId) {

        ApiPayloadContent response = apiPayloadService.getApiPayloadContent(serviceName, correlationId);

        return response;
    }

    @GetMapping("v1/api/payload/drilldown/content")
    public ApiPayloadContent getApiPayloadDrillDownContent(
            @RequestParam String serviceName,
            @RequestParam String correlationId,
            @RequestParam String drillDownOption
            ) {

        ApiPayloadContent response = apiPayloadService.getApiPayloadDrillDownContent(serviceName, correlationId, drillDownOption);

        return response;
    }

}

