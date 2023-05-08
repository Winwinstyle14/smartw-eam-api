package com.example.smartwweb.security.dto;

public class MessageResponse {
    private String messageRes;

    public MessageResponse(String messageRes) {
        this.messageRes = messageRes;
    }

    public String getMessageRes() {
        return messageRes;
    }

    public void setMessageRes(String messageRes) {
        this.messageRes = messageRes;
    }
}
