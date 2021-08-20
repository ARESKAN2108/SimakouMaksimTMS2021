package com.tms.homework.task6.service;

import com.tms.homework.task6.model.EmailAddress;
import com.tms.homework.task6.model.Reader;

import java.util.List;
import java.util.stream.Collectors;


public class MessageServiceImpl implements MessageService {
    @Override
    public List<EmailAddress> sendMessage(String message, List<Reader> readers) {
        return readers.stream()
                .map(r -> new EmailAddress(r.getEmailAddress().getAddressName(), message))
                .collect(Collectors.toList());
    }
}
