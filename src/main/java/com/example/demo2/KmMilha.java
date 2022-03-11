package com.example.demo2;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/kmmilha/{km}")
@Singleton
public class KmMilha {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getKm(@PathParam("km") Double kilo) {
        double milha = kilo*0.621371;
        return Double.toString(kilo) + "Km/h = " + Double.toString(milha) + " Milhas por hora";
    }
}