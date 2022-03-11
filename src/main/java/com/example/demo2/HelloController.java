package com.example.demo2;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 */
@Path("/hello/{km}")
@Singleton
public class HelloController {

    @GET
    public String getKm(@PathParam("km") Double kilo) {
        double milha = kilo*0.621371;
        return Double.toString(kilo) + "Km/h = " + Double.toString(milha) + " Milhas por hora";
    }
}
