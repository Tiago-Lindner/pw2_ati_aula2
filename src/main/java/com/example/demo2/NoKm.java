package com.example.demo2;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/nokm/{nos}")
@Singleton
public class NoKm {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getNos(@PathParam("nos") Double nos) {
        double km = nos*1.852;
        return Double.toString(nos) + " Nos = " + Double.toString(km) + " Km/h";
    }
}