package com.aohys.userHospital;

import com.aohys.exception.PostNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserHospitalController {

    private UserHospitalService userHospitalService;

    @Autowired
    public UserHospitalController(UserHospitalService userHospitalService) {
        this.userHospitalService = userHospitalService;
    }

    @RequestMapping(value = "/usersHospital", method = RequestMethod.GET)
    public Iterable<UserHospitalEntity> list(){
        return userHospitalService.list();
    }


    @RequestMapping( value = "/usersHospital", method = RequestMethod.POST )
    public UserHospitalEntity addUserHospital(@RequestBody UserHospitalEntity userHospital){
        return userHospitalService.addUserHospital(userHospital);
    }

    @RequestMapping( value = "/usersHospital/{id}", method = RequestMethod.GET )
    public UserHospitalEntity getUserHospital(@PathVariable(value="id") int id) throws PostNotFoundException {
        UserHospitalEntity userHospital = userHospitalService.getUserHispital(id);
        if( userHospital == null ){
            throw new PostNotFoundException("User with id: " + id + " not found.");
        }
        return userHospital;
    }

    @RequestMapping( value = "/usersHospital/{id}", method = RequestMethod.PUT )
    public void updateUserHospital(@PathVariable(value="id") int id, @RequestBody UserHospitalEntity userHospital){
        userHospitalService.updateUserHospital(id, userHospital);
    }

    @RequestMapping( value = "/usersHospital/{id}", method = RequestMethod.DELETE )
    public void deleteUserHospital(@PathVariable(value="id") int id){
        userHospitalService.deleteHuserHospital(id);
    }

    @ExceptionHandler(PostNotFoundException.class)
    public void handlePostNotFound(PostNotFoundException exception, HttpServletResponse response) throws IOException {
        response.sendError( HttpStatus.NOT_FOUND.value(), exception.getMessage() );
    }

}
