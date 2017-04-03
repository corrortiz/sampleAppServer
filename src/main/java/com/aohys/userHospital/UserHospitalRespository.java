package com.aohys.userHospital;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHospitalRespository extends CrudRepository<UserHospitalEntity, Integer> {
}
