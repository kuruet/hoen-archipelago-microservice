package com.skyscanner;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.skyscanner.api.SearchResource;

public class HoenServiceApplication extends Application<HoenServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new HoenServiceApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HoenServiceConfiguration> bootstrap) {
        // nothing to initialize
    }

    @Override
    public void run(HoenServiceConfiguration configuration, Environment environment) {
        final SearchResource searchResource = new SearchResource();
        environment.jersey().register(searchResource);
    }
}
