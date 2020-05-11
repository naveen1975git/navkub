package kub.controller;

import com.ms.kub.model.NavKubDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/navkubservice/")
public class KubAPIController {

    private static final Logger log = LoggerFactory.getLogger(KubAPIController.class);

    @GetMapping(path="/getdetails", produces = "application/json", consumes = "application/json")
    public NavKubDetails getDetails()
    {
        log.info("Entered getDetails)_");
        log.info("Exited getDetails()");
        return new NavKubDetails("" + Math.random(), "Name is " + Math.random());
    }


}
