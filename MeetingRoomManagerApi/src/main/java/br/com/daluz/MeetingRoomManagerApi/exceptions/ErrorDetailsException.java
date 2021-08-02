package br.com.daluz.MeetingRoomManagerApi.exceptions;

import java.util.Date;


public class ErrorDetailsException {

    private Date timestamps;

    private String message;

    private String details;

    public ErrorDetailsException(Date timestamps, String message, String details) {
        this.timestamps = timestamps;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamps() {
        return timestamps;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
