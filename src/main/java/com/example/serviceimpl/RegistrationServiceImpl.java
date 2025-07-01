package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Registration;
import com.example.repository.RegistrationRepository;
import com.example.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepo;

    @Override
    public void userRegistration(Registration registration) {
        registrationRepo.save(registration);
    }
}
