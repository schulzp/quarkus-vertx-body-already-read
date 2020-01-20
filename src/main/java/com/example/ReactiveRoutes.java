package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.vertx.ext.web.Router;

@ApplicationScoped
public class ReactiveRoutes {

    public void init(@Observes Router router) {
        router.get("/test").handler(rc -> {
            rc.request().bodyHandler((buffer) -> {
                // do something with the body
            });
            rc.response().end("reactive");
        });
    }

}
