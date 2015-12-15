package org.benjaminbeck.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

/**
 * Created by benjamin.beck on 3/12/2015.
 */
@Configuration
@ComponentScan("org.benjaminbeck")
@IntegrationComponentScan("org.benjaminbeck.gateway")
@EnableIntegration
public class InfrastructureConfiguration {

    @Bean
    @Description("Entry Channel for messaging system through the gateway.")
    public MessageChannel inputChannel() {
        return new DirectChannel();
    }

    @Bean
    @Description("Output Channel for messaging system through the gateway.")
    public MessageChannel outputChannel() {
        return new DirectChannel();
    }

}
