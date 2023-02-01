package com.folksdev.graphqlfolksdev.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfig {

  @Bean
  RuntimeWiringConfigurer runtimeWiringConfigurer() {
    return new RuntimeWiringConfigurer() {
      @Override
      public void configure(Builder builder) {
        builder.scalar(ExtendedScalars.DateTime);
      }
    };
  }
}
