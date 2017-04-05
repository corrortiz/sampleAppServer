package com.aohys.userHospital;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserHospitalRespository extends CrudRepository<UserHospitalEntity, Integer> {

    List<UserHospitalEntity> findByNameContainingOrIdCardContaining(String term);

}
