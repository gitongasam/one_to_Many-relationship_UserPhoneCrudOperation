package com.devSam.library.management.system.PhoneRepository;

import com.devSam.library.management.system.PhoneEntity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
}
