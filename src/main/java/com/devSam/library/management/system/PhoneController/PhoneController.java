package com.devSam.library.management.system.PhoneController;

import com.devSam.library.management.system.PhoneEntity.Phone;
import com.devSam.library.management.system.PhoneRepository.PhoneRepository;
import com.devSam.library.management.system.PhoneService.phoneService.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    @PostMapping("/savePhone")
    public String savePhone(@RequestBody Phone phone){
        phoneService.savePhone(phone);
        return "success";
    }
}
