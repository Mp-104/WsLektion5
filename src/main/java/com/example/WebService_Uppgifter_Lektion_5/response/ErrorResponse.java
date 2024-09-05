package com.example.WebService_Uppgifter_Lektion_5.response;

public class ErrorResponse implements Response {

    private String responseMessage;

    public ErrorResponse (String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
