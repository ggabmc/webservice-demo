package com.webservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerService {

    String[] brands = {"Rolex","Omega","Tag Heuer","Hublot"};

    String[] rolex = {"Rolex GMT Master II Batman", "Rolex GMT Master II Pepsi",
            "Rolex Submarine Date", "Rolex Daytona Gold", "Rolex RootBear", "Rolex Submarine Hulk",
    "Rolex Submarine Bluesy"};

    @GetMapping("/healthcheck")
    public String healthCheck(){
        return "webservice-demo is up and running!";
    }

    @GetMapping("/watch/brands")
    public List getBrands(){
        return Arrays.asList(brands);
    }

    @GetMapping("/watch/rolex")
    public List getRolexModels(){
        return Arrays.asList(rolex);
    }

}