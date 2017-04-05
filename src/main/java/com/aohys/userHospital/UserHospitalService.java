package com.aohys.userHospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserHospitalService {

    private UserHospitalRespository userHospitalRespository;

    @Autowired
    public UserHospitalService(UserHospitalRespository userHospitalRespository) {
        this.userHospitalRespository = userHospitalRespository;
    }

    public Iterable<UserHospitalEntity> list() {
        return userHospitalRespository.findAll();
    }

    public Iterable<UserHospitalEntity> listLike(String term) {
        return userHospitalRespository.findByNameContainingOrIdCardContaining(term, term);
    }

    public UserHospitalEntity addUserHospital(UserHospitalEntity userHospital) {
        return userHospitalRespository.save(userHospital);
    }

    public UserHospitalEntity getUserHispital(int id) {
        return userHospitalRespository.findOne(id);
    }

    public UserHospitalEntity updateUserHospital(int id, UserHospitalEntity userHospital) {
        return userHospitalRespository.save(userHospital);
    }

    public void deleteHuserHospital(int id) {
        userHospitalRespository.delete(id);
    }


}
