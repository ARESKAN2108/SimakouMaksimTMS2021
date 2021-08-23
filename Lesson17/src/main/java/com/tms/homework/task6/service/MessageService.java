package com.tms.homework.task6.service;

import com.tms.homework.task6.model.EmailAddress;
import com.tms.homework.task6.model.Reader;

import java.util.List;

public interface MessageService {

    List<EmailAddress> sendMessage(String message, List<Reader> readers);

    List<EmailAddress> sendMessageByAgreeReaders(String message, List<Reader> readers);

}
