package com.webservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerService {

    Logger logger = LoggerFactory.getLogger(ControllerService.class);

    StringBuilder brands = new StringBuilder().append("Rolex")
            .append("Omega").append("Tag Heuer").append("Hublot")
            .append("Gucci").append("Cartier");

    StringBuilder rolex = new StringBuilder().append("Rolex GMT Master II Batman")
            .append("Rolex GMT Master II Pepsi").append("Rolex Submarine Date").append("Rolex Daytona Gold")
            .append("Rolex RootBear").append("Rolex Submarine Hulk").append("Rolex Submarine Bluesy");

    StringBuilder omega = new StringBuilder().append("Speedmaster Moon Watch")
            .append("Omega Seamaster").append("Speedmaster Race");


    @GetMapping("/healthcheck")
    public String healthCheck(){
        String message = "webservice-demo is up and running!";
        logger.info(message);
        return message;
    }

    @GetMapping("/watch/brands")
    public List getBrands(){
        logger.info(brands.toString());
        return Arrays.asList(brands);
    }

    @GetMapping("/watch/rolex")
    public List getRolexModels(){
        logger.info(rolex.toString());
        return Arrays.asList(rolex);
    }

    @GetMapping("/watch/omega")
    public List getOmegaModels(){
        logger.info(omega.toString());
        return Arrays.asList(omega);}

}