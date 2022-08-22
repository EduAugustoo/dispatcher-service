//package com.polarbookshop.dispatcherservice;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.function.context.FunctionCatalog;
//import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;
//import org.springframework.messaging.support.GenericMessage;
//import reactor.core.publisher.Flux;
//import reactor.test.StepVerifier;
//
//import java.util.function.Function;
//
//@FunctionalSpringBootTest
//public class DispatchingFunctionsIntegrationTests {
//
//    @Autowired
//    private FunctionCatalog catalog;
//
//    @Test
//    void packAndLabelOrder() {
//        long orderId = 121;
//        Function<OrderAcceptedMessage, Flux<OrderDispatchedMessage>> packAndLabel =
//                this.catalog.lookup(Function.class, "pack|label");
//
//        StepVerifier.create(packAndLabel.apply(new OrderAcceptedMessage(orderId)))
//                .expectNextMatches(dispatchedOrder -> {
//                    System.out.println(dispatchedOrder);
//                    return true;
//                })
//                .verifyComplete();
//    }
//}
