package com.wen.promfed;

import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;

//import reactor.core.publisher.Mono;

// !!!! turn on "management.endpoint.health.show-details=always" to show it !!!!

@Component
public class CustomHealthCheck extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up()
                .withDetail("app", "Alive and spinning...")
                .withDetail("error", "Nothing wrong so far...");
    }
//    @Override
//    public Mono<Health> health() {
//        return checkDownstreamServiceHealth().onErrorResume(
//                ex -> Mono.just(new Health.Builder().down(ex).build())
//        );
//    }
//
//    private Mono<Health> checkDownstreamServiceHealth() {
//        return Mono.just(new Health.Builder().withDetail("status", "MyKeyValue here!").up().build());
//    }
}
//public class CustomHealthCheck implements HealthIndicator {
//
//    @Override
//    public Health health() {
//        int errCode = check();
//        if (errCode != 0) {
//            return Health.down()
//                    .withDetail("Error Code", errCode)
//                    .build();
//        }
//        return Health.up().build();
//    }
//
//    private int check() {
//        return 0; // your custome error code here
//    }
//}