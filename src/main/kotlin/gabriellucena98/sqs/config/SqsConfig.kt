package gabriellucena98.sqs.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sqs.SqsAsyncClient
import java.net.URI

@Configuration
class SqsConfig {
    @Bean
    fun sqsAsyncClient(): SqsAsyncClient {
        return SqsAsyncClient.builder()
            .endpointOverride(URI.create("http://localhost:4566")) //Endpoint do LocalStack
            .region(Region.SA_EAST_1)
            .build()
    }
}