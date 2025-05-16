# api-payload-downloader
Micro Service for the API Payload Downloader Tool

# Steps to Run the WEB UI Application :
    1. Navigate & Run the ApiPayloadDownloaderApplication File as Spring Boot Application,
    2. Application will start on port 8081 (http) with context path '/'
 
# Curl Script to test the fetch api end point
curl --location 'http://localhost:8081/v1/api/payload/fetch?serviceName=Reservation%20Create%2FModify&confirmationNumber=890111&correlationId=&startDate=2025-05-12T00%3A00%3A00&endDate=2025-05-13T00%3A00%3A00' \
--header 'Content-Type: application/json'

# Curl Script to test the View Payload Content API end point
curl --location 'http://localhost:8081/v1/api/payload/content?serviceName=Reservation%20Delivery&correlationId=f47ac10b' \
--header 'Content-Type: application/json'

# Curl Script to test the View Drill Down Payload Content API end point
curl --location 'http://localhost:8081/v1/api/payload/drilldown/content?serviceName=Reservation+Delivery&correlationId=f47ac10b&drillDownOption=roomInfo' \
--header 'Content-Type: application/json'