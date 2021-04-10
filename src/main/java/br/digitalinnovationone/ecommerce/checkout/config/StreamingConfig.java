package java.br.digitalinnovationone.ecommerce.checkout.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import java.br.digitalinnovationone.ecommerce.checkout.streaming.CheckoutCreatedSource;
import java.br.digitalinnovationone.ecommerce.checkout.streaming.PaymentPaidSink;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
