package com.devSam.library.management.system.PhoneService.phoneService;

import com.devSam.library.management.system.PhoneEntity.Phone;
import com.devSam.library.management.system.PhoneRepository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonesServiceImpl implements PhoneService{
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Phone savePhone(Phone phone) {
        return  phoneRepository.save(phone);
    }
}
