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

    String[] brands = {"Rolex","Omega","Tag Heuer","Hublot","Gucci","Cartier"};

    String[] rolex = {"Rolex GMT Master II Batman", "Rolex GMT Master II Pepsi",
            "Rolex Submarine Date", "Rolex Daytona Gold", "Rolex RootBear",
            "Rolex Submarine Hulk", "Rolex Submarine Bluesy"};

    String[] omega = {"Speedmaster Moon Watch","Omega Seamaster","Speedmaster Race"};

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
        logger.info(String.valueOf(Arrays.asList(rolex)));
        return Arrays.asList(rolex);
    }

    @GetMapping("/watch/omega")
    public List getOmegaModels(){
        logger.info(String.valueOf(Arrays.asList(omega)));
        return Arrays.asList(omega);}

}