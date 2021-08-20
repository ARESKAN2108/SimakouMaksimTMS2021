package com.tms.homework.task6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class EmailAddress {
    private String addressName;
    private String message;

    public EmailAddress(String addressName) {
        this.addressName = addressName;
    }
}
