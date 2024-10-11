package org.example.servlet

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces

@Path("/hello-world")
class HelloResource {
    @GET
    @Produces("text/plain")
    String hello() {
        return "Hello, World!"
    }
}