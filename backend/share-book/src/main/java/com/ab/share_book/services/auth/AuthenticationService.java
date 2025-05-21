package com.ab.share_book.services.auth;

import com.ab.share_book.dao.auth.RegistrationRequest;
import jakarta.mail.MessagingException;

public interface AuthenticationService {
    public void register(RegistrationRequest request)throws MessagingException;
}
